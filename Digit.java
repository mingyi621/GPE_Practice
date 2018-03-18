import java.util.Scanner;
class Digit
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt())
		{
			int i = scanner.nextInt();
			if(i==0)
				break;
			int result = 0;
			do{
				while(i>0)
				{
					result = result + i % 10;
					i = i / 10;
				}
				i = result;
				result = 0;
			}while(i>=10);
			System.out.printf("%d\n", i);
		}
	}

}