import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if (n == 0)
				break;

			int sum = 0;

			for(int i = 1; i <= n; i++)
			{
				System.out.printf("i = %d, last = %d ",i,(int)(Math.pow(i,i)%10));
				sum = sum + (int)(Math.pow(i,i)%10);
				sum = sum % 10;
				System.out.printf("sum = %d\n", sum);
			}

		}
	}
}