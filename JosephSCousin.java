import java.util.Scanner;
import java.lang.Math;

class JosephSCousin
{
	public static boolean isPrime(int p)
	{
		boolean result = false;
		for(int i = 2; i <= (int)Math.sqrt(p); i++)
		{
			if(p%i == 0)
			{
				result = true;
				break;
			}
		}
		return result;
	}



	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 1 || n == 2)
			{
				System.out.printf("1\n");
				continue;
			}
			boolean[] isKilled = new boolean[n];

			int thePrime = 2;
			int now = 0;

			

		}
		


	}
}