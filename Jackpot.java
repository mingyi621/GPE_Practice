import java.util.Scanner;

class Jackpot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0) break;
			int[] num = new int[n];
			for(int i = 0; i < n; i++)
			{
				num[i] = sc.nextInt();
			}

			int max = 0;
			int total;
			for(int i = 0; i < n; i++)
			{
				total = 0;
				for(int j = i; j < n; j++)
				{
					total = total + num[j];
					if(total > max)
						max = total;
				}
			}

			if(max>0)
				System.out.printf("The maximum winning streak is %d.\n", max);
			else
				System.out.printf("Losing streak.\n");
		}



	}
}