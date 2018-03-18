import java.util.Scanner;

class SquareRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0)
				break;

			int count = 0;
			for(int i = a; i <= b; i++)
			{
				if(Math.sqrt(i)%1 == 0)
					count++;
			}
			System.out.println(count);
		}
	}
}