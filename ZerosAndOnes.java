import java.util.Scanner;

class ZerosAndOnes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(sc.hasNext())
		{
			String st = sc.next();
			int n = sc.nextInt();
			
			System.out.printf("Case %d:\n", count);

			for(int i = 0; i < n; i++)
			{
				
				int a = sc.nextInt();
				int b = sc.nextInt();

				if(a>b)
				{
					int temp = a;
					a = b;
					b = temp;
				}

				boolean isTrue = true;
				char theOne = st.charAt(a);

				for(int j = a; j <= b; j++)
				{
					if(st.charAt(j) != theOne)
					{
						isTrue = false;
						break;
					}
				}
				if(isTrue)
					System.out.printf("Yes\n");
				else
					System.out.printf("No\n");

			}
			count++;
		}


	}
}