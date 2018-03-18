import java.util.Scanner;

class TrainSwapping
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++)
		{
			int length = sc.nextInt();
			if(length == 0)
			{
				System.out.printf("Optimal train swapping takes 0 swaps.\n");
				continue;
			}

			int[] l = new int[length];
			for(int j = 0; j < length; j++)
			{
				l[j] = sc.nextInt();
			}
			
			int count = 0;
			for(int head = 0, tail = length - 1; head != tail; tail--)
			{
				for(int a = head; a <= tail - 1; a++)
				{
					if(l[a] > l[a+1])
					{
						int temp = l[a];
						l[a] = l[a+1];
						l[a+1] = temp;
						count++;
					}
				}
			}
			System.out.printf("Optimal train swapping takes %d swaps.\n", count);
			
		}
	}
}