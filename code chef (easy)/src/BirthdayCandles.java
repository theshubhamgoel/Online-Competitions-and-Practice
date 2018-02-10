import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BirthdayCandles {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a[], min, min_index, flag, value = 0;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = new int[10];
			flag = 0;

			min = min_index = 10;
			for (int j = 0; j < a.length; j++)
				a[j] = Integer.parseInt(temp.nextToken());

			for (int j = 1; j < a.length; j++) {
				if (min > a[j]) {
					min = a[j];
					min_index = j;
				}
			}

			for (int j = 1; j < a.length; j++) {
				if (a[j] == 0) {
					flag = 1;
					value = j;
					break;
				}
			}

			if (flag == 1) {
				System.out.println(value);
				continue;
			}

			if (a[0] == 0) {
				System.out.println("1" + a[0]);
				continue;
			}

			value = min_index;
			for (int j = 1; j < min_index; j++) {
				if (a[j] <= min) {
					value = j;
					break;
				}
			}

			System.out.println(value + "" + min_index);

		}
	}
}
