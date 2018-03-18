import java.util.Scanner;
// 10038 Jolly Jumpers
class Jolly2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();

			int[] input = new int[n];
			for(int i = 0; i < n; i++)
			{
				input[i] = sc.nextInt();
			}

			int diff = 0;
			boolean result = true;
			boolean[] output = new boolean[input.length];
			for(int i = 0; i < n; i++)
			{
				output[i] = false;
			}
			output[0] = true;

			for(int i = 0; i < input.length - 1; i++)
			{
				diff = Math.abs(input[i] - input[i+1]);
				if(diff >= n || output[diff] == true)
				{
					result = false;
					break;
				}
				else
				{	
					output[diff] = true;
					result = true;
				}
			}
			
			if(result)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
	}
}
