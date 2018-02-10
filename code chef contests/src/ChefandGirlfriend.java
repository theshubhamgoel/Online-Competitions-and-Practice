import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandGirlfriend {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, time1, time2;
		String[] temp;
		float out1, out2,temptime,dist;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(":");
			time1 = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

			temp = br.readLine().split(":");
			time2 = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);

			dist = Integer.parseInt(br.readLine());

			out1 = time1 - time2 + dist;
			temptime = time2 + dist;

			if (temptime < time1) {
				if (temptime + dist <= time1) {
					temptime += dist;
					temptime += time1 - temptime;
				} else {
					temptime += (time1 - temptime);
					dist = dist - (time1 - temptime);
					temptime += dist / 2.0;

				}
			} else {
				dist = dist - (temptime - time1);
				temptime += dist / 2.0;
			}
			out2 = (temptime - time2);
			System.out.printf("%.1f %.1f", out1, out2);
			System.out.println();
		}

	}
}
