import java.util.Scanner;

class Guard
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();

			int strong = 0;
			int weak = 0;
			int no = 0;

			if(x1 > x3)
			{
				int temp = x1;
				x1 = x3;
				x3 = temp;
				temp = y1;
				y1 = y3;
				y3 = temp;
				temp = x2;
				x2 = x4;
				x4 = temp;
				temp = y2;
				y2 = y4;
				y4 = temp;
			}

			// Case 1: 1, 2, 3, 4
			if(x2<=x3)
			{
				strong = 0;
				weak = (x2-x1)*(y2-y1)+(x4-x3)*(y4-y3) - 2 * strong;
				no = 10000 - weak;
			}

			// Case 2: 1, 3, 2, 4
			else if(x2>=y3 && x4>=x2)
			{
				// Case 2.1: 1, 2, 3, 4
				if(y3>=y2 && y4>=y2)
				{
					strong = 0;
					weak = (x2-x1)*(y2-y1)+(x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 2.2: 1, 3, 2, 4
				else if(y3<=y2 && y4>=y2)
				{
					strong = (x2-x3)*(y2-y3);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 2.3: 1, 3, 4, 2
				else if(y3<=y2 && y4<=y2)
				{
					strong = (x2-x3)*(y4-y3);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 2.4: 3, 1, 2, 4
				else if(y3<=y1 && y4>=y2)
				{
					strong = (x2-x3)*(y2-y1);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 2.5: 3, 1, 4, 2
				else if(y3<=y1 && y4<=y2)
				{
					strong = (x2-x3)*(y4-y1);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 2.6: 3, 4, 1, 2
				else if(y4<=y1)
				{
					strong = 0;
					weak = (x2-x1)*(y2-y1)+(x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
			}
			// Case 3: 1, 3, 4, 2
			else if(x2>=x3 && x4<=x2)
			{
				// Case 3.1: 1, 2, 3, 4
				if(y3>=y2 && y4>=y2 && y1<=y3)
				{
//					System.out.println("Case 3.1");
					strong = 0;
					weak = (x2-x1)*(y2-y1)+(x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 3.2: 1, 3, 2, 4
				else if(y2>=y3 && y4>=y2 && y1<=y3)
				{
//					System.out.println("Case 3.2");
					strong = (x4-x3)*(y2-y3);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 3.3: 1, 3, 4, 2
				else if(y2>=y3 && y4<=y2 && y1<=y3)
				{
//					System.out.println("Case 3.3");
					strong = (x4-x3)*(y4-y3);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 3.4: 3, 1, 2, 4
				else if(y4>=y2 && y3<=y1)
				{
//					System.out.println("Case 3.4");
					strong = (x4-x3)*(y2-y1);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 3.5: 3, 1, 4, 2
				else if(y3<=y1 && y4<=y2)
				{
//					System.out.println("Case 3.5");
					strong = (x4-x3)*(y4-y1);
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
				// Case 3.6: 3, 4, 1, 2
				else if(y4<=y1)
				{
//					System.out.println("Case 3.6");
					strong = 0;
					weak = (x2-x1)*(y2-y1) + (x4-x3)*(y4-y3) - 2 * strong;
					no = 10000 - weak - strong;
				}
			}
			System.out.printf("Night %d: %d %d %d\n", i+1, strong, weak, no);

		}
	}
}