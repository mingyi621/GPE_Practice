import java.util.Scanner;

class RotatingSentences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] st = new String[100];

		int lines = 0;
		int max_length = 0; 

		while(sc.hasNextLine() && lines < 100)
		{
			st[lines] = sc.nextLine();
			
			if(st[lines].length() > max_length)
				max_length = st[lines].length();
			if(st[lines].equals(""))
				break;
			lines++;	
		}
//		System.out.println(i);

		for(int j = 0; j < max_length; j++)
		{
			for(int i = lines - 1; i >= 0; i--)
			{
				if(j < st[i].length())
					System.out.printf("%c", st[i].charAt(j));
				else
					System.out.printf(" ");
			}
			System.out.printf("\n");
		}
	}
}