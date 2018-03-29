import java.util.Scanner;

class FourthPoint
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble())
		{
			double[][] points = new double[4][2];
			points[0][0] = sc.nextDouble();
			points[0][1] = sc.nextDouble();
			points[1][0] = sc.nextDouble();
			points[1][1] = sc.nextDouble();
			points[2][0] = sc.nextDouble();
			points[2][1] = sc.nextDouble();
			points[3][0] = sc.nextDouble();
			points[3][1] = sc.nextDouble();

			double[] theFirst = new double[2];
			double[] theSecond = new double[2];
			double[] theThird = new double[2];
			int i = 0, j = 0, k = 0;
			boolean isBreak = false;
			for(i = 0; i < 3; i++)
			{
				for(j = i + 1; j < 4; j++)
				{
					if(points[i][0] == points[j][0] && points[i][1] == points[j][1])
					{	
						theThird[0] = points[i][0];
						theThird[1] = points[i][1];
						isBreak = true;
						break;
					}
				}
				if(isBreak == true)
					break;
			}
//			System.out.printf("%d,%d,%.3f,%.3f\n", i, j, theThird[0], theThird[1]);
			for(k = 0; k < 4; k++)
			{
				if(k != i && k != j)
				{
					theFirst[0] = points[k][0];
					theFirst[1] = points[k][1];
					break;
				}
			}
			for(int l = 0; l < 4; l++)
			{
				if(l != i && l != j && l != k)
				{
					theSecond[0] = points[l][0];
					theSecond[1] = points[l][1];
					break;
				}
			}

			double[] theMiddle = new double[2];
			theMiddle[0] = (theFirst[0] + theSecond[0]) / 2;
			theMiddle[1] = (theFirst[1] + theSecond[1]) / 2;

			double[] theFourth = new double[2];
			theFourth[0] = 2 * theMiddle[0] - theThird[0];
			theFourth[1] = 2 * theMiddle[1] - theThird[1];

			System.out.printf("%.3f %.3f\n", theFourth[0], theFourth[1]);

		}
	}
}