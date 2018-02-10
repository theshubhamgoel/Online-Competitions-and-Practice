import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bytelandiangoldcoins {

	static int[] ans = new int[10000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n;
		for (int i = 0; i < 10; i++) {
			try {
				n = Long.parseLong(br.readLine());
				n = Math.max(n, check(n));
				System.out.println(n);
			} catch (Exception e) {
				break;
			}
		}
	}

	private static long check(long n) {
		if (n < 5)
			return n;
		else {
			if (n < 10000) {
				if (ans[(int) n] == 0) {
					ans[(int) n] = (int) Math.max(n, check(n / 2)
							+ check(n / 3) + check(n / 4));
				}
				return ans[(int) n];
			} else {
				return Math.max(n, check(n / 2) + check(n / 3) + check(n / 4));
			}
		}
	}
}
