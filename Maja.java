import java.util.Scanner;

class Maja
{
	public static int abs(int n)
	{
		if(n<0) n = (-1) * n;
		return n;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)
				break;

			if(n == 1)
				System.out.printf("0 0\n");

			else
			{
				int trace = 2;
				int i;
				for(i = 1; trace <= n; i++)
				{
					trace = trace + i * 6;
				}
				i--;
				trace = trace - i * 6;
				i--;

//				System.out.printf("trace = %d, x = %d\n", trace, i);

				int x = i;
				int y = 1;

				while(trace < n)
				{
					if(x>0 && y>0)
					{
						x--;
						y++;
					}
					else if( (x==0 && y>0) || (x<0 && y>0 && abs(x)<abs(y) ) )
					{
						x--;
					}
					else if(x<0 && y>0 && abs(x)>=abs(y))
					{
						y--;
					}
					else if((x<0 && y==0) || (x<0 && y<0))
					{
						x++;
						y--;
					}
					else if((x==0 && y<0) || (x>0 && y<0 && abs(x)<abs(y)))
					{
						x++;
					}
					else if(x>0 && y<0 && abs(x)>=abs(y))
					{
						y++;
					}
					else;
					trace++;
				}
				System.out.printf("%d %d\n", x, y);
			}
		}
	}
}