import java.util.Scanner;

class Carry
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong())
		{
			long i = sc.nextLong();
			long j = sc.nextLong();

			if(i==0 && j==0)
				break;

			int count = 0;
			long carry = 0;
			while(i!=0 || j!=0)
			{
				if(i % 10 + j % 10 + carry >= 10)
				{ 
					carry = (i % 10 + j % 10 + carry) / 10;
					count = count + 1;
				}
				else
				{
					carry = 0;
				}
				i = i / 10;
				j = j / 10;
			}

			if(count == 0)
				System.out.println("No carry operation.");
			else if(count == 1)
				System.out.println("1 carry operation.");
			else
				System.out.printf("%d carry operations.\n", count);
			continue;
			
		}
	}
}