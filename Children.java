import java.util.Scanner;
import java.util.*;

class Children
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)
				break;
			String[] st = new String[n];
			for(int i = 0; i < n; i++)
			{
				st[i] = sc.next();
			}

			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n - 1; j++)
				{
					if(Integer.valueOf(st[j] + st[j+1]) < Integer.valueOf(st[j+1]+st[j]))
					{	
						String temp = new String();
						temp = st[j];
						st[j] = st[j+1];
						st[j+1] = temp;
					}
				}
			}
			for(int i = 0; i < n; i++)
			{
				System.out.printf("%s",st[i]);
			}
			System.out.println();
		}
	}
}