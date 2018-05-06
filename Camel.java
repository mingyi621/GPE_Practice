import java.util.Scanner;

class Camel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++)
		{
			int[] records = new int[12];
			for(int j = 0; j < 12; j++)
			{
				records[j] = 0;
			}

			String st = sc.next();

			int k = 0;
			int temp = 0;

			for(int j = 0; j < st.length(); j++)
			{
				char c = st.charAt(j);

			//	System.out.println(c);

				if(c == '+')
				{
					if(temp != 0 && records[k] != 0)
					{
						records[k] = records[k] * temp;
					}
					else
					{
						records[k] = temp;
					}
					temp = 0;
//					System.out.printf("k = %d, records[k] = %d\n", k,  records[k]);
					k++;

				}
				else if(c == '*')
				{
					if(records[k] == 0)
					{
						records[k] = temp;
//						System.out.printf("k = %d, records[k] = %d\n", k,  records[k]);
					}
					else
					{
						records[k] = records[k] * temp;
//						System.out.printf("k = %d, records[k] = %d\n", k,  records[k]);
					}
					temp = 0;
				}
				else
				{
					if(temp == 0)
					{
						temp = Character.getNumericValue(c);
					}
					else
					{
						temp = temp * 10 + Character.getNumericValue(c);
					}
//					System.out.println(temp);
				}
			}
			records[k] = temp;

			int min = 0;
			for(int s = 0; s <= k; s++)
			{
				System.out.println(records[s]);
				min = min + records[s];
			}
			System.out.printf("min = %d\n", min);

			

		}
	}
}