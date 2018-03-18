import java.util.Scanner;

class SimpleAddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(p<0 && q<0)
				break;
			int sum = 0;
			for(int n = p; n <= q; n++)
			{
				if(n%10>0)
					sum = sum + n % 10;
				else if(n == 0)
					sum = sum + 0;
				else
					sum = sum
			}

		}
	}
}