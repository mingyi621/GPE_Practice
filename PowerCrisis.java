import java.util.Scanner;

class PowerCrisis
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0) break;

			boolean[] table = new boolean[n];
			for(int m = 1; ; m++)
			{
				for(int i = 1; ; i = (i + m) % n)
				{
					

				} 
			}

	}
}