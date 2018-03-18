import java.util.Scanner;

class Necklace
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int v = sc.nextInt();
			int v0 = sc.nextInt();

			if(v == 0 && v0 == 0)
				break;

			double length = 0.0;
			double max = 0;
			int which_num = 0;

			for(int i = 1; ; i++)
			{
				double v_now = (double)v / i;
				length = i * 0.3 * Math.sqrt(v_now - v0);
				if(v_now - v0 <= 0)
					break;
				if(length > max)
				{
					max = length;
					which_num = i;
				}
				else if(length == max)
				{
					which_num = 0;
					break;
				}
			}
			System.out.println(which_num);
		}
	}
}