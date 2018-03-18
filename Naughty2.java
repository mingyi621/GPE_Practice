import java.util.Scanner;
// 10427 Naughty Sleepy Boys
class Naughty2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int all_count = 1;
		while(sc.hasNextInt() && all_count <= 11000)
		{
			int n = sc.nextInt();

			if(n == 0)
				break;

			int count = 0;
			int num_digit = 1;
			int i;

			for(i = 1; count < n; i++)
			{
				if(i == 10 || i == 100 || i == 1000 || i == 10000 || i == 100000 || i == 1000000 || i == 10000000)
					num_digit++;
				count += num_digit;
			}

			i = i - 1;

			int which_digit = 0;
			count = count - num_digit;
			which_digit = n - count;
			which_digit = num_digit - which_digit;

			while(which_digit != 0)
			{
				i = i / 10;
				which_digit = which_digit - 1;
			}

			System.out.println(i%10);

			// String st = new String();
			// st = Integer.toString(i-1);
			// char result = st.charAt(which_digit-1);

			// System.out.println(result);
			all_count += 1;
		}
	}
}