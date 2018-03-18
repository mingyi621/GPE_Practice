import java.util.Scanner;

class Infinite
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			long s = sc.nextLong();
			long d = sc.nextLong();
			long total = 0;
			long i;
			for(i = s;; i++)
			{
				total = total+i;
				if(total>=d)
				{
					break;
				}
			}
			System.out.printf("%d\n", i);
		}
	}
}