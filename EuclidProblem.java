import java.util.Scanner;

class EuclidProblem
{
	public static int findGCD(int a, int b)
	{
		while(b%a != 0)
		{
			b = b % a;
			int temp = a;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			boolean isExchange = false;
			if(a > b)
			{
				isExchange = true;
				int temp = a;
				a = b;
				b = temp;
			}

			int gcd = findGCD(a, b);

			int x = 0, y = 0;
			for(y = 1; y<100000000; y++)
			{
				if((gcd - b * y) % a == 0)
				{
					x = (gcd - b * y) / a;
					break;
				}
			}
			if(isExchange == true)
			{
				int temp = x;
				x = y;
				y = temp;
			}
			System.out.printf("%d %d %d\n", x, y, gcd);

		}
	}
}