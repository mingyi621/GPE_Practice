import java.util.Scanner;

class Bangla
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNextLong())
		{
			count++;
			long n = sc.nextLong();
			long[] each = new long[5];
			long[0] = n % 100;
			n = n / 100;
			long[1] = n%10;
			n = n / 10;
			long[2] = n%100;
			n = n / 100;
			long[3] = n%100;
			n = n / 100;
			long[4] = n;

			System.out.printf("%d. ", count);
			for(int a = 4; a >= 0; a--)
			{
				
			}

		}
	}
}