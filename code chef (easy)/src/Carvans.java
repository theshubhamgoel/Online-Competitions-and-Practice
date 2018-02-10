import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Carvans {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, j, count, current_max;
		String[] temp;
		int[] speeds_of_cars;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = br.readLine().split(" ");

			speeds_of_cars = new int[n];
			count = 1;
			current_max = Integer.parseInt(temp[0]);
			for (j = 1; j < n; j++) {
				speeds_of_cars[j] = Integer.parseInt(temp[j]);
				if (speeds_of_cars[j] <= current_max) {
					count++;
					current_max = speeds_of_cars[j];
				}
			}
			System.out.println(count);
		}

	}

}
