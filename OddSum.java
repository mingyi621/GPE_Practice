import java.util.Scanner;

class OddSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int y[] = new int[total];
		for(int i = 0; i < total; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;
			for(int j = a; j <= b; j = j + 2)
			{
				if(j%2 != 1)
					j++;
				sum = sum + j;
			}
			y[i] = sum;
		}
		for(int i = 0; i < total; i++)
		{
			System.out.printf("Case %d: %d\n", i+1, y[i]);
		}
	}
}