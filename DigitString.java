import java.util.Scanner;

class DigitString
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
			while(st.length()!=1)
			{
				for(int i=0; i<st.length(); i++)
				{
					num = num + st.charAt(i) - 48;
				}
				st = Integer.toString(num);
				num = 0;
			}
			System.out.println(st);
		}
	}
}