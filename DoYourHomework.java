import java.util.Scanner;

class DoYourHomework
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
			int n = sc.nextInt();
			String[] subject_name = new String[n];
			int[] subject_day = new int[n];

			for(int j = 0; j < n; j++)
			{
				subject_name[j] = sc.next();
				subject_day[j] = sc.nextInt();
			}

			int d = sc.nextInt();
			String target = sc.next();

			boolean isInside = false;
			for(int k = 0; k < n; k++)
			{
				if(target.equals(subject_name[k]))
				{
					if(subject_day[k] <= d)
						System.out.printf("Case %d: Yesss\n", i+1);
					else if(subject_day[k] <= d + 5)
						System.out.printf("Case %d: Late\n", i+1);
					else
						System.out.printf("Case %d: Do your own homework!\n", i+1);
					isInside = true;
					break;
				}
			}
			if(isInside == false)
				System.out.printf("Case %d: Do your own homework!\n", i+1);
		}
	}
}