import java.util.Scanner;
//10162 - Last Digit
class LastDigit2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		String st = new String();
		

		while(sc.hasNext())
		{
			st = sc.next();
			if(st.equals("0"))
				break;

			int[][] table = {{0,1,4,7,6,5,6,3,6,9},{0,1,6,3,6,5,6,7,4,9}};

			int length = st.length();

			int ten;
			if(length >= 2)
				ten = Character.getNumericValue(st.charAt(length-2));
			else 
				ten = 0;

			int result;

			result = ten * 7;

			for(int i = 1; i <= Character.getNumericValue(st.charAt(length-1)); i++)
			{
				result = result + table[ten%2][i];
			}

			System.out.println(result%10);
		}
	}
}