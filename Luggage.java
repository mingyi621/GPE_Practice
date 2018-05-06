import java.util.Scanner;
import java.util.Arrays;

class Luggage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++)
		{
			String values = sc.nextLine();
			String[] v = values.split(" ");
			int[] suitcase = new int[v.length];
			int sum = 0;
			for(int j = 0; j < v.length; j++)
			{
				suitcase[j] = Integer.parseInt(v[j]);
				sum = sum + suitcase[j];
			}
			if(sum % 2 == 1)
			{
				System.out.println("NO");
				continue;
			}
			Arrays.sort(suitcase);
			int s = 0;
			for(int right = suitcase.length - 1; right >= 0; right--)
			{
				s = s + suitcase[right];
				if(s > sum / 2)
				{
					s = s - suitcase[right];
				}
				else if(s == sum/2)
				{
					System.out.println("YES");
					break;
				}
				else;
			}
		}
	}
}