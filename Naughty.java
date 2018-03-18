import java.util.Scanner;

class Naughty
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n==0) break;
			int count = 0;

			char result = '0';

			for(int i = 1; count < n; i++)
			{
				int temp = i;
				int st_length = 0;
				while(temp != 0)
				{
					temp = temp / 10;
					st_length = st_length+1;
				}
				// String st = Integer.toString(i);
				// int st_length = st.length();
				count = count + st_length;

				if(count >= n)
				{
					count = count - st_length;
					String st = Integer.toString(i);
					result = st.charAt(n - count-1);
					break;
				}

			}
			System.out.printf("%c\n", result);
		}
	}
}