import java.util.Scanner;
import java.util.Arrays;

class ExactSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			int[] values = new int[n];
			for(int i = 0; i < n; i++)
			{
				values[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			
			Arrays.sort(values);
			int left = 0;
			int right = n-1;

			int result_i = -1;
			int result_j = -1;
			for(left = 0; left < n; left++)
			{
				while(left<right)
				{
					if(values[left] + values[right] == m)
					{
						result_i = values[left];
						result_j = values[right];
					}
					right--;	
				}
				right = n - 1;
			}
			System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", result_i, result_j);
		}
	}
}