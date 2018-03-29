import java.util.Scanner;
import java.lang.Math;

class PrimeDistance2
{
	public static long findGCD(long i, long j)
	{
		long gcd = 0;
		if(i < j)
		{
			long temp = i;
			i = j;
			j = temp;
		}

		while(true)
		{
			i = i % j;
			if(i == 0)
			{
				gcd = j;
				break;
			}
			long temp = i;
			i = j;
			j = temp;
		}
		return gcd;
	}

	public static boolean isPrime(long j)
	{
		boolean result = true;
		for(long i = 2; i <= (long)Math.sqrt((double)j); i++)
		{
			if(findGCD(i,j) != 1)
			{
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

//		System.out.printf("%d",findGCD(15,17));

		while(sc.hasNextLong())
		{
			long l = sc.nextLong();
			long u = sc.nextLong();

			long min = 10000;
			long max = 0;

			long c1 = 0, c2 = 0;
			long d1 = 0, d2 = 0;

			for(long i = l; ; i++)
			{
				if(isPrime(i))
				{
					l = i;
					break;
				}
			}
			for(long i = l, j = i + 1;j <= u ; i = j, j = i + 1)
			{
				while(true)
				{
					if(j>u)
					{
						break;
					}
					if(!isPrime(j))
						j++;
					else 
						break;
				}
				if(j>u)
					break;
				if(j-i<min)
				{
					min = j - i;
					c1 = i;
					c2 = j;
				}
				if(j-i>max)
				{
					max = j - i;
					d1 = i;
					d2 = j;
				}
			}
			if(min == 10000)
			{
				System.out.println("There are no adjacent primes.");
			}
			else
			{
				System.out.printf("%d,%d are closest, %d,%d are most distant.\n",c1,c2,d1,d2);
			}
		}
	}
}