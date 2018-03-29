import java.util.Scanner;
import java.math.BigInteger;

class PrimeDistance
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int l = sc.nextInt();
			int u = sc.nextInt();

			int c1 = 0, c2 = 0;
			int d1 = 0, d2 = 0;

			BigInteger L = BigInteger.valueOf(l);
			BigInteger U = BigInteger.valueOf(u);
			BigInteger MinusOne = BigInteger.valueOf(-1);

			BigInteger TheFirstPrime = L.add(MinusOne).nextProbablePrime();
			int theFirstPrime = TheFirstPrime.intValue();

 			int diff = 10000;
 			int diff_max = 0;

 			while(true)
 			{
				BigInteger TheNextPrime = TheFirstPrime.nextProbablePrime();
				int theNextPrime = TheNextPrime.intValue();
				if(theNextPrime > u)
					break;
				if(theNextPrime - theFirstPrime < diff)
				{
					c1 = theFirstPrime;
					c2 = theNextPrime;
					diff = c2 - c1;
				}
				if(theNextPrime - theFirstPrime > diff_max)
				{
					d1 = theFirstPrime;
					d2 = theNextPrime;
					diff_max = d2 - d1;
				}
				TheFirstPrime = TheNextPrime;
				theFirstPrime = theNextPrime;
			}


			if(diff != 10000)
			{
				System.out.printf("%d,%d are closest, %d,%d are most distant.\n", c1, c2, d1, d2);
			}
			else
				System.out.printf("There are no adjacent primes.\n");
		}
	}
}