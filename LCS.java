import java.util.Scanner;

class LCS
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String st1 = sc.next();
			String st2 = sc.next();

			int st1Length = st1.length();
			int st2Length = st2.length();

			char[][] arrow = new char[st1Length+1][st2Length+1];
			int[][] number = new int[st1Length+1][st2Length+1];

			for(int i = 0; i < st2Length+1; i++)
			{
				arrow[0][i] = 'X';
				number[0][i] = 0;
			}
			for(int i = 0; i < st1Length+1; i++)
			{
				arrow[i][0] = 'X';
				number[i][0] = 0;
			}
			if(st1Length>=1 && st2Length>=1)
			{
				for(int i = 1; i < st1Length+1; i++)
				{
					for(int j = 1; j < st2Length+1; j++)
					{
						if(st1.charAt(i-1) == st2.charAt(j-1))
						{
							arrow[i][j] = 'S';
							number[i][j] = number[i-1][j-1] + 1;
						}
						else
						{
							if(number[i][j-1]>number[i-1][j])
							{
								arrow[i][j] = 'L';
								number[i][j] = number[i][j-1];
							}
							else
							{
								arrow[i][j] = 'U';
								number[i][j] = number[i-1][j];
							}
						}
					}
				}
			}
			System.out.printf("%d\n", number[st1Length][st2Length]);

			char[] result = new char[number[st1Length][st2Length]];
			int point = number[st1Length][st2Length] - 1;

			int x = st1Length;
			int y = st2Length;
			while(x>0 && y>0)
			{
				if(arrow[x][y] == 'S')
				{
					result[point] = st1.charAt(x-1);
					x--;
					y--;
					point--;
				}
				else if(arrow[x][y] == 'U')
				{
					x--;
				}
				else if(arrow[x][y] == 'L')
				{
					y--;
				}
			}
			System.out.println(result);
		}
	}	
}