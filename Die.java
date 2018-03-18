import java.util.Scanner;

class Die
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)
				break;
			
			int[] die = new int[6];
			die[0] = 1;
			die[1] = 4;
			die[2] = 3;
			die[3] = 5;
			die[4] = 2;
			die[5] = 6;

			String[] st = new String[n];
			for(int i = 0; i < n; i++)
			{
				st[i] = sc.next();

				int[] temp = new int[6];
				

				if(st[i].equals("east"))
				{
					temp[0] = die[2];
					temp[1] = die[0];
					temp[2] = die[5];
					temp[3] = die[3];
					temp[4] = die[4];
					temp[5] = die[1];
				}
				else if(st[i].equals("west"))
				{
					temp[0] = die[1];
					temp[1] = die[5];
					temp[2] = die[0];
					temp[3] = die[3];
					temp[4] = die[4];
					temp[5] = die[2];
				}
				else if(st[i].equals("south"))
				{
					temp[0] = die[4];
					temp[1] = die[1];
					temp[2] = die[2];
					temp[3] = die[0];
					temp[4] = die[5];
					temp[5] = die[3];
				}
				else if(st[i].equals("north"))
				{
					temp[0] = die[3];
					temp[1] = die[1];
					temp[2] = die[2];
					temp[3] = die[5];
					temp[4] = die[0];
					temp[5] = die[4];
				}
				else;
				die = temp;
			}
			System.out.printf("%d\n", die[0]);
		}
	}
}