import java.util.Scanner;
import java.math.BigInteger;

class GCD
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)break;
			BigInteger G = BigInteger.valueOf(0);
			for(int i = 1; i < n; i++)
			{
				for(int j = i + 1; j <= n; j++)
				{
					BigInteger v1 = BigInteger.valueOf(i);
					BigInteger v2 = BigInteger.valueOf(j);
					G = G.add(v1.gcd(v2));
				}
			}
			System.out.println(G);
		}
	}
}