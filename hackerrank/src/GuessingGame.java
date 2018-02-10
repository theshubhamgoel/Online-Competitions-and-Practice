import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GuessingGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long test_cases = 0, n, m, possible_odd_sums, possible_sums, total_even_no_in_a, total_odd_no_in_a, total_even_no_in_b, total_odd_no_in_b;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			total_even_no_in_a = n / 2;
			total_even_no_in_b = m / 2;

			total_odd_no_in_a = n - total_even_no_in_a;
			total_odd_no_in_b = m - total_even_no_in_b;

			possible_odd_sums = total_even_no_in_a * total_odd_no_in_b
					+ total_even_no_in_b * total_odd_no_in_a;

			possible_sums = n * m;

			long x = GCD(possible_sums, possible_odd_sums);
			possible_odd_sums /= x;
			possible_sums /= x;

			System.out.println(possible_odd_sums + "/" + possible_sums);

		}

	}

	public static long GCD(long a, long b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}
}
