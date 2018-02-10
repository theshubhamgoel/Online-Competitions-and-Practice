import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelBytelandia {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, j, count = 0, max = 1, k;
		String[] temp;
		int arrival_time[], departure_time[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			arrival_time = new int[n];
			departure_time = new int[n];

			temp = br.readLine().split(" ");
			for (j = 0; j < n; j++) {
				arrival_time[j] = Integer.parseInt(temp[j]);
			}

			temp = br.readLine().split(" ");
			for (j = 0; j < n; j++) {
				departure_time[j] = Integer.parseInt(temp[j]);
			}

			max = 0;
			for (k = 1; k < 1001; k++) {
				count=0;
				for (j = 0; j < n; j++) {
					if (arrival_time[j] <= k && k < departure_time[j]) {
						count++;
					}
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}
}
