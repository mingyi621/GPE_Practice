import java.util.Scanner;
import java.util.*;

class Trip
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)
				break;

			double[] money = new double[n];
			double total = 0.0, average = 0.0;

			for(int i = 0; i < n; i++)
			{
				money[i] = sc.nextDouble();
				total = total + money[i];
			} 

			average = total/n;

			Arrays.sort(money);

			double remain = average * 100 - (double)Math.floor(average * 100);

			int numberAbove = (int)Math.round(remain * n);

			double[] adjustedAverage = new double[n];

			for(int i = 0; i < n; i++)
			{
				if(numberAbove != 0)
				{
					if(i < n - numberAbove)
						adjustedAverage[i] = average - average % 0.01;
					else
						adjustedAverage[i] = average - average % 0.01 + 0.01;
				}
				else
					adjustedAverage[i] = average;
			}

			double result = 0.0;

			for(int i = 0; i < n; i++)
			{
				if(money[i] - adjustedAverage[i] > 0)
					result = result + money[i] - adjustedAverage[i];
			}
			System.out.printf("$%.2f\n", result);
		}
	}
}