import java.util.Scanner;

class AboveAverage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i = 1; i <= c; i++)
		{
			int n = sc.nextInt();
			if(n==0)
				continue;
			long[] score = new long[n];
			for(int j = 0; j < score.length; j++)
			{
				score[j] = 0;
			}

			long total = 0;
			for(int j = 1; j <= n; j++)
			{
				score[j-1] = sc.nextInt();
				total = total + score[j-1];
			}
			double average = (double)total/n;
			int numberOfAboveAverage = 0;

			for(int j = 1; j <= n; j++)
			{
				if(score[j-1]>average)
					numberOfAboveAverage++;
			}

			System.out.printf("%.3f%%\n",(double)numberOfAboveAverage*100/n);
//			System.out.println(toPercentage((double)numberOfAboveAverage*100/average,3));
		}
	}
}