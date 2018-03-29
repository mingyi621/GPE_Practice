import java.util.Scanner;

class AverageSpeed
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		double distance = 0.0;
		double speed = 0.0;
		int time_now = 0;

		while(sc.hasNextLine())
		{
			String st = sc.nextLine();

			String[] input = st.split(" ");

			if(input.length == 1)
			{
				String timeSting[] = input[0].split(":");
				int timeInSecond = Integer.parseInt(timeSting[0]) * 3600
								 + Integer.parseInt(timeSting[1]) * 60
								 + Integer.parseInt(timeSting[2]);
				double temp = distance + speed * (timeInSecond - time_now);

				System.out.printf("%s %.2f km\n",input[0],temp);
			}
			else if(input.length == 2)
			{
				String timeSting[] = input[0].split(":");
				int timeInSecond = Integer.parseInt(timeSting[0]) * 3600
								 + Integer.parseInt(timeSting[1]) * 60
								 + Integer.parseInt(timeSting[2]);

				distance = distance + speed * (timeInSecond - time_now);
				speed = Double.parseDouble(input[1]) / 3600;
				time_now = timeInSecond;
			}
			else;
		}
	}
}