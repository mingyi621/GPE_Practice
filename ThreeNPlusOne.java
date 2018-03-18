import java.util.Scanner;

class ThreeNPlusOne
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int min = Math.min(a,b);
			int max = Math.max(a,b);
		/*	int min, max;
			if(a<b)
			{
				min = a;
				max = b;
			}
			else
			{
				min = b;
				max = a;
			} */
			int count = 0;
			for(int i = min; i <= max; i++)
			{
				int num = i;
				int c = 1;
				while(num != 1)
				{
					if(num % 2 == 1)
						num = 3 * num + 1;
					else
						num = num / 2;
					c = c + 1;
				}
				if(c > count)
					count = c;
			}
			System.out.println(a+" "+b+" "+count);
		}
	}
}