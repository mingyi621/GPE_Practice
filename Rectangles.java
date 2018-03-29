import java.util.Scanner;

class Rectangles
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			int m = sc.nextInt();
			int[][] rectans = new int[m][4];

			int maxLeft = -10000;
			int minRight = 10000;
			int maxDown = -10000;
			int minUp = 10000;

			for(int j = 0; j < m; j++)
			{
				rectans[j][0] = sc.nextInt();
				if(rectans[j][0]>maxLeft)
					maxLeft = rectans[j][0];

				rectans[j][1] = sc.nextInt();
				if(rectans[j][1]>maxDown)
					maxDown = rectans[j][1];

				rectans[j][2] = sc.nextInt();
				if(rectans[j][2]<minRight)
					minRight = rectans[j][2];

				rectans[j][3] = sc.nextInt();
				if(rectans[j][3]<minUp)
					minUp = rectans[j][3];
			}

			int area = (minRight-maxLeft)*(minUp-maxDown);
			if(minRight-maxLeft > 0 && minUp-maxDown > 0)
				area = area;
			else 
				area = 0;

			System.out.printf("Case %d: %d\n", i+1, area);
		}
	}
}