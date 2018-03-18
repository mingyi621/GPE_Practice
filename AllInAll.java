import java.util.Scanner;

class AllInAll
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s1 = new String();
			String s2 = new String();
			s1 = sc.next();
			s2 = sc.next();

			char[] c1 = new char[s1.length()];
			char[] c2 = new char[s2.length()];

			for(int i = 0; i < s1.length(); i++)
			{
				c1[i] = s1.charAt(i);
			}
			for(int i = 0; i < s2.length(); i++)
			{
				c2[i] = s2.charAt(i);
			}
			int i ,j;
			

			for(i = 0, j = 0; i < s1.length() && j < s2.length();)
			{
				if(c1[i]!=c2[j])
					j++;

				else if(c1[i]==c2[j])
				{
					i++;
					j++;
				}	
			}
			if(i==s1.length())
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}