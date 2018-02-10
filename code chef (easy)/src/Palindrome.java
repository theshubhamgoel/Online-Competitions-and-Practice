import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n;
		long sum;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			sum = 0;
			for (int j = 1; j <= n; j++)
				sum += power(26, (long) Math.ceil(j / 2.0));

			System.out.println(sum);
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
