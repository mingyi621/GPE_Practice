import java.util.Scanner;

class MineSweeper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int game = sc.nextInt();

		for(int i = 0; i < game; i++)
		{
			int n = sc.nextInt();

			boolean isExploded = false;

			char[][] mines = new char[n][n];

			for(int j = 0; j < n; j++)
			{
				String st = sc.next();
				for(int k = 0; k < n; k++)
				{
					mines[j][k] = st.charAt(k);
				}
			}

			char[][] touched = new char[n][n];
			for(int j = 0; j < n; j++)
			{
				String st = sc.next();
				for(int k = 0; k < n; k++)
				{
					touched[j][k] = st.charAt(k);
					if(touched[j][k] == 'x' && mines[j][k] == '*')
					{
						isExploded = true;
						break;
					}
				}
				if(isExploded)
					break;
			}

			if(isExploded)
			{
				for(int j = 0; j < n; j++)
					System.out.println(mines[j]);
			}
			else
			{
				for(int j = 0; j < n; j++)
				{
					for(int k = 0; k < n; k++)
					{
						if(touched[j][k] == 'x')
						{
							int count = 0;
							if(j-1 >= 0 && k-1 >= 0 && mines[j-1][k-1] == '*')
								count++;
							if(j-1 >= 0 && mines[j-1][k] == '*')
								count++;
							if(j-1 >= 0 && k+1 < n && mines[j-1][k+1] == '*')
								count++;
							if(k-1 >= 0 && mines[j][k-1] == '*')
								count++;
							if(k+1 < n && mines[j][k+1] == '*')
								count++;
							if(j+1 < n && k-1 >= 0 && mines[j+1][k-1] == '*')
								count++;
							if(j+1 < n && mines[j+1][k] == '*')
								count++;
							if(j+1 < n && k+1 < n && mines[j+1][k+1] == '*')
								count++;
							System.out.printf("%d",count);
						}
						else
							System.out.printf(".");
					}
					System.out.printf("\n");
				}
			}
			if(i<game-1)
				System.out.println();
		}
	}
}