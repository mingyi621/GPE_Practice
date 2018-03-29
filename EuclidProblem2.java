import java.util.Scanner;

class EuclidProblem2
{
	public static int[] theEquation(int a, int b)
	{
		int quotient = a / b;
		int remainder = a % b;

		int[] result = new int[2];
		result[0] = quotient;
		result[1] = remainder;

		return result;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			boolean isExchange = false;

			if(a < b)
			{
				int temp = a;
				a = b;
				b = temp;
				isExchange = true;
			}

			int[] result = new int[2];
			result[0] = 1;
			result[1] = 1;

			int count = 0;

			int tempA = a;
			int tempB = b;
			while(result[1] != 0)
			{
				result = theEquation(tempA, tempB);
				tempA = tempB;
				tempB = result[1];
				//System.out.print(result[1]);
				count++;
			}
//			System.out.print(count);

			int[][] qAndr = new int[count][2];
			tempA = a;
			tempB = b;
			result[0] = 1;
			result[1] = 1;
			for(int i = 0; tempB != 0 && i < count; i++)
			{
				qAndr[i] = theEquation(tempA, tempB);
				tempA = tempB;
				tempB = qAndr[i][1];
			}
			if(count == 1)
			{
				System.out.printf("%d %d %d\n",0,1,b);
			}
			else if(count >= 2)
			{
				int x = 1, y = (-1) * qAndr[count-2][0];
				if(count >= 3)
				{
					for(int j = count - 3; j >= 0; j--)
					{
						int temp = y;
						y = x - y * qAndr[j][0];
						x = temp;
					}
				}
				System.out.printf("%d %d %d\n", x, y, qAndr[count-2][1]);
			}

//			int x = 1, y = -1;
//			x = x + y * 




		}
	}
}