import java.util.Scanner;

class EuclidProblem3
{
	public static void gcd(int a, int b)
	{
		int temp, flag = 0;
		int x1 = 1, y1 = 0, x2 = 0, y2 = 1;
		while(a%b > 0)
		{
			if(flag > 0)
			{
				x2 -= a/b*x1;
				y2 -= a/b*y1;
			}
			else
			{
				x1 -= a/b*x2;
				y1 -= a/b*y2;
			}
			temp = a;
			a = b;
			b = temp%b;
			flag ^= 1;
		}
		if(flag > 0)
			System.out.printf("%d %d", x1, y1);
		else
			System.out.printf("%d %d", x2, y2);
		System.out.printf(" %d\n", b);

	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			gcd(a,b);
		}
		

	}
}