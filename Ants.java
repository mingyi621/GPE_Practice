import java.util.Scanner;

class Ants
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();

		for(int i = 1; i <= cases; i++)
		{
			int l = sc.nextInt();
			int n = sc.nextInt();

			int[] ants = new int[n];

			for(int j = 0; j < n; j++)
			{
				ants[j] = sc.nextInt();
			}
			
			int[] ants_min = new int[n];
			int min = 0;
			for(int j = 0; j < n; j++)
			{
				if(ants[j] > l / 2)
					ants_min[j] = l - ants[j];
				else
					ants_min[j] = ants[j];
				if(ants_min[j] > min)
					min = ants_min[j];
			}

			int[] ants_max = new int[n];
			int max = 0;
			for(int j = 0; j < n; j++)
			{
				if(ants[j] < l / 2)
					ants_max[j] = l - ants[j];
				else
					ants_max[j] = ants[j];
				if(ants_max[j] > max)
					max = ants_max[j];
			}
			System.out.printf("%d %d\n", min, max);

		}
	}
}