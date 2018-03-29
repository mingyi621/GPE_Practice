import java.util.Scanner;

class Bee
{
	public static int fibonacci(int n)
	{	
		int result = 0;
		if(n == 0 || n == 1)
			result = 1;
		else
		{
			result = fibonacci(n-1)+fibonacci(n-2);
		}
		return result;
	} 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int N = sc.nextInt();
			if(N == -1)
				break;

			int male = 0;
			int female = 1;

			for(int i = 0; i <= N-1; i++)
				male = male + fibonacci(i);
			for(int i = 0; i <= N-2; i++)
				female = female+fibonacci(0);


			System.out.printf("%d %d\n", male, male+female);

		}
	}
}