import java.util.Scanner;

class Soundex
{
	public static int checkDigit(char d)
	{
		if(d == 'B' || d == 'F' || d == 'P' || d == 'V')
			return 1;
		else if(d == 'C' || d == 'G' || d == 'J' || d == 'K' || d == 'Q' || d == 'S' || d == 'X' || d == 'Z')
			return 2;
		else if(d == 'D' || d == 'T')
			return 3;
		else if(d == 'L')
			return 4;
		else if(d == 'M' || d == 'N')
			return 5;
		else if(d == 'R')
			return 6;
		else
			return 0;

	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			String st = sc.next();
			int length = st.length();

			for(int i = 0; i < length; i++)
			{
				char d = st.charAt(i);
				if(i > 0 && checkDigit(st.charAt(i-1)) == checkDigit(st.charAt(i)))
					continue;
				if(checkDigit(d) != 0)
					System.out.print(checkDigit(d));
			}
			System.out.printf("\n");
		}
	}
}