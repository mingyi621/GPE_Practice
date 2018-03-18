import java.util.Scanner;

class Eleven
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String st = sc.next();
			if(st.equals("0"))
				break;
			int num = 0;
			int odd = 0;
			int even = 0;
			for(int i = 0; i<st.length();i++)
			{
				if(i%2 == 0)
					even = even + st.charAt(i) - 48;
				else
					odd = odd + st.charAt(i) - 48;
			}
			num = even - odd;
			if(num%11 == 0)
			{
				System.out.printf("%s is a multiple of 11.\n", st);
			}
			else
			{
				System.out.printf("%s is not a multiple of 11.\n",st);
			}

		}
	}
}