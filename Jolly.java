import java.util.Scanner;
class Jolly
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String st = new String();

			st = sc.nextLine();

			String[] inputS = st.split(" ");

	//		System.out.printf("%d", inputS.length);

			int[] input = new int[inputS.length];

			for(int i = 0; i < input.length; i++)
			{	
				input[i] = Integer.valueOf(inputS[i]);
			}

			int diff = 0;
			boolean result = true;
			for(int i = 0; i < input.length - 1; i++)
			{
				diff = Math.abs(input[i] - input[i+1]);
				if(diff >= input.length || diff == 0)
				{
					result = false;
				}
			}
			if(result)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");


			// int[] input = new int[3000];
			// int i;
			// for(i = 0;sc.hasNextInt(); i++)
			// {
			// 	input[i] = sc.nextInt();
			// }
			// int n = 5;
			// boolean result = true;
			// for(i = 0; i < n-1; i++)
			// {	
			// 	if(Math.abs(input[i]-input[i+1]) >= n)
			// 		result = false;
			// }
			// if(result)
			// 	System.out.println("Jolly");
			// else
			// 	System.out.println("Not jolly");
		}
	}
}