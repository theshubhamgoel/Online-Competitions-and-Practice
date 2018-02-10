import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedJohnisBack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, count;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			count = 1;

			while (n > 3) {
				count += n - 4 + 1;
				n = n - 4;
			}

			System.out.println(count_prime(count));
		}
	}

	private static int count_prime(int count) {
		int c = 0;
		for (int i = 2; i <= count; i++) {
			if (isPrime(i))
				c++;
		}
		return c;
	}

	static boolean isPrime(int n) {
		if (n == 2)
			return true;

		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
