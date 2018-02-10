import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimePalindromes {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = br.readLine();
		int n;
		n = Integer.parseInt(s);
		while (true) {
			if (isPalindromes(n)) {
				if (isPrime(n)) {
					System.out.println(n);
					break;
				} else {
					n++;
				}
			} else
				n++;
		}
	}

	private static boolean isPalindromes(int n) {
		int i = 0, rev = 0;
		for (i = n; i > 0; i = i / 10) {
			rev = rev * 10 + i % 10;
		}
		if (rev == n) {
			return true;
		}
		return false;
	}

	private static boolean isPrime(int n) {
		int i = 1, flag = 1;
		if (n == 1 || n == 2 || n == 3)
			return true;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1) {
			return true;
		}
		return false;
	}

}
