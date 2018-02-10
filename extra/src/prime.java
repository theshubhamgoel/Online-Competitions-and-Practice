import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			if (isPrime(n))
				System.out.println("yes");
			else
				System.out.println("no");

		}

	}

	private static boolean isPrime(int n) {

		if (n < 4) {
			if (n == 2 || n == 3)
				return true;
			return false;

		} else if (n < 15) {
			if (n % 6 == 1 || n == 5)
				return true;
			else if (Math.abs(n - 6) == 3 || Math.abs(n - 6) == 2)
				return false;
			else
				return isPrime(Math.abs(n - 6));

		} else if (n < 110) {
			if (n % 30 == 1 || n == 29)
				return true;
			else if (Math.abs(n - 30) == 5 || Math.abs(n - 30) == 3
					|| Math.abs(n - 30) == 2 || n == 15)
				return false;
			else {
				return isPrime(Math.abs(n - 30));
			}
		} else if (n < 1210) {
			if (n % 210 == 1)
				return true;
		} else
			return false;

		return false;
	}
}
