import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Missingsomechairs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			System.out.println(power(2, n));
		}
	}

	public static long power(long a, long b) {
		if (a == 0)
			return 0;
		if (b == 0)
			return 1;
		long ans = 1;
		while (b > 0) {
			if (b % 2 == 1) {
				ans = ans * a;
				ans = ans % 1000000007;
			}
			a = a * a;
			a = a % 1000000007;
			b = b / 2;
		}
		return ans;
	}
}
