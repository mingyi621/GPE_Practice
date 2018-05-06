import java.util.Scanner;

class BitMask
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();
		int u = sc.nextInt();

		String n_s = Integer.toString(n,2);
		int n_length = n_s.length();

		System.out.printf(n_s);

		int comple = (int)Math.pow(2,n_length) - 1 - n;
		String comple_s = Integer.toString(comple,2);

		System.out.printf(comple_s);

		for(int i = n_length - 1; i >= 0; i--)
		{

		}
	}
}