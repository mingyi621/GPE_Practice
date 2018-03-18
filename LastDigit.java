import java.util.Scanner;

class LastDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)
				break;

			double s = 0.0;

			for(double i = 1; i <= n; i++)
			{
				double temp = i;
				//Math.pow(i%10,i) % 10;

				for(double j = 1; j < i; j++)
				{
					temp = temp * i;
					temp = temp % 10;
				}

				s = s + temp;
				s = s % 10;
			}
			System.out.printf("%d\n",(int)s);
			
		}

	}
}