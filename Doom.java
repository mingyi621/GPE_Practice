import java.util.Scanner;

class Doom
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//4/4,monday
		int n = sc.nextInt();

		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] st = new String[7];

		st[0] = "Sunday";
		st[1] = "Monday";
		st[2] = "Tuesday";
		st[3] = "Wednesday";
		st[4] = "Thursday";
		st[5] = "Friday";
		st[6] = "Saturday";

		

		for(int i = 1; i <= n; i++)
		{
			int whichDay = 0;
			int m = sc.nextInt();
			int d = sc.nextInt();

			for(int j = 0; j < m - 1; j++)
			{
				whichDay = whichDay + days[j];
			}
			whichDay = whichDay + d +5;

			System.out.printf("%s\n",st[whichDay%7]);

		}
	}
}