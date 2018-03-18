import java.util.Scanner;
class Robot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
			int n = sc.nextInt();
			int[] instruction = new int[n];
			int result = 0;
			for(int j = 0; j < n; j++)
			{
				String line = sc.nextLine();
				if(line == "LEFT")
				{
					result = result - 1;
					instruction[j] = -1;
				}
				if(line == "RIGHT")
				{
					result = result + 1;
					instruction[j] = -1;
				}
				else
				{
					String[] split_line = line.split(" ");
					int k = Integer.valueOf(split_line[2]);
					instruction[j] = instruction[k-1];
					result = result + instruction[j];
				}
			}
			System.out.printf("%d\n", result);
		}
	}
}