import java.util.Scanner;

class Wavio
{
	public static int min(int i, int j)
	{
		if(i>j)
			return j;
		return i;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			int[] array = new int[n];
			for(int i = 0; i < n; i++)
			{
				array[i] = sc.nextInt();
			}

			int maxWavio = 0;
			int nIncrease = 1;
			int nDecrease = 1;

			int status = -1;

			for(int i = 0; i < n; i++)
			{
				if(i+1<n && array[i]<array[i+1])
				{
					if(status == 1)
					{
						if(min(nIncrease,nDecrease)>maxWavio)
							maxWavio = min(nIncrease,nDecrease);
//						System.out.println("maxWavio" + maxWavio);
						nIncrease = 1;
						nDecrease = 1;
					}
					nIncrease++;
					status = 0;
//					System.out.println(nIncrease);
				}
				else if(i+1<n && array[i]>array[i+1])
				{
					nDecrease++;
					status = 1;
//					System.out.println(nDecrease);
				}
				else if(i+1<n && array[i]==array[i+1])
				{
					if(min(nIncrease,nDecrease)>maxWavio)
						maxWavio = min(nIncrease,nDecrease);
					nIncrease = 1;
					nDecrease = 1;
				}
				else;
			}
			maxWavio = maxWavio * 2 - 1;
			System.out.println(maxWavio);
		}
	}
}