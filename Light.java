import java.util.Scanner;

class Light
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			unsigned int n = sc.nextInt();
			if(n==0) break;
			boolean result = false;
			for(int i = 1; i <= n; i++)
			{
				if(n%i==0)
					result = switcher(result); 
			}
			if(result == true)
			 	System.out.println("yes");
			else
				System.out.println("no");
		}
	}

	public static boolean switcher(boolean input)
	{
		if(input == true)
			return false;
		else
			return true;
	}

}