import java.util.Scanner;

class AllRoadsLeadWhere
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++)
		{
			int input = sc.nextInt();
			int output = sc.nextInt();

			int[] roads = new int[26];

			for(int j = 0; j < input; j++)
			{
				char from = sc.next().charAt(0);
				char to = sc.next().charAt(0);
				
				roads[(int)to - 65] = (int)from - 65;
			}

			for(int j = 0; j < output; j++)
			{
				char from = sc.next().charAt(0);
				char to = sc.next().charAt(0);

				int[] array1 = new int[26];
				int[] array2 = new int[26];

				array1[0] = (int)from - 65;
				array2[0] = (int)to - 65;

				int thisHop1 = (int)from - 65;
				int thisHop2 = (int)to - 65;
				int k = 0, l = 0;

				while(thisHop1 != 82 - 65)
				{
					k = k + 1;
					array1[k] = roads[thisHop1];
					thisHop1 = roads[thisHop1];
				}
				while(thisHop2 != 82 - 65)
				{
					l = l + 1;
					array2[l] = roads[thisHop2];
					thisHop2 = roads[thisHop2];
				}
				int check1 = k, check2 = l;
				while(true)
				{
					if(array1[check1] == array2[check2])
					{
						check1--;
						check2--;
						if(check1 == -1 || check2 == -1)
							break;	
					}
					else
						break;
				}
				for(int m = 0; m <= check1 + 1; m++)
				{
					System.out.printf("%c", (char)(array1[m]+65));

				}
				for(int p = check2; p >= 0; p--)
				{
					System.out.printf("%c", (char)(array2[p]+65));
				}
				System.out.printf("\n");
			}
			if(i != n-1)
				System.out.println();
		}
	}
}