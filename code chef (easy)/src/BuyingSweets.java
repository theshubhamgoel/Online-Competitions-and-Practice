import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingSweets {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, sum, min, y;
		int note_value[];
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");

			n = Integer.parseInt(temp[0]);
			k = Integer.parseInt(temp[1]);

			note_value = new int[n];
			temp = br.readLine().split(" ");

			sum = min = note_value[0] = Integer.parseInt(temp[0]);
			for (int j = 1; j < n; j++) {
				note_value[j] = Integer.parseInt(temp[j]);
				sum += note_value[j];
				if (min > note_value[j])
					min = note_value[j];
			}

			y = sum % k;
			if (y == 0) {
				System.out.println(sum / k);
			} else {
				if (min <= y)
					System.out.println("-1");
				else
					System.out.println((int) (sum / k));
			}
		}
	}
}
