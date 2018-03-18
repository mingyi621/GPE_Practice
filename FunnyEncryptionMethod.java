import java.util.Scanner;

class FunnyEncryptionMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] all = new int[N][2];
		for(int i = 0; i < N; i++)
		{
			int count1 = 0, count2 = 0, r = 0;
			int a = sc.nextInt();
			int a_hex = a;
			while(a > 0)
			{
				r = a % 2;
				a = a / 2;
				if(r == 1)
					count1++;
			}
			a = a_hex;
			a_hex = (a % 10) * 1 + ((a % 100) - (a % 10))/10 * 16 + ((a % 1000) - (a % 100))/100 * 256 + ((a % 10000) - (a % 1000))/1000 * 256 * 16;
//			System.out.println(a_hex);
			while(a_hex > 0)
			{
				r = a_hex % 2;
				a_hex = a_hex / 2;
				if(r == 1)
					count2++;
			}
			all[i][0] = count1;
			all[i][1] = count2;
		}

		for(int i = 0; i < N; i++)
		{
			System.out.println(all[i][0]+" "+all[i][1]);
		}

	}
}