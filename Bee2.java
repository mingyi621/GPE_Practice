import java.util.Scanner;

class Bee2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int N = sc.nextInt();
			if(N == -1)
				break;
			long male = 0;
			long female = 1;
			long total = 1;

			for(int i = 1; i <= N; i++)
			{
				female = male + 1;
				male = total;
				total = male + female;
			}
			System.out.printf("%d %d\n", male, total);
		}
	}
}