import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GurupandhisSweetHeart {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		long n, m, current_freq, next_freq, flag;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Long.parseLong(br.readLine());
			current_freq = next_freq = 0;
			flag = 1;
			long j = 2;
			m = n;

			while (n > 0) {
				if (n % j == 0) {
					break;
				} else
					j++;
				if (j >= Math.sqrt(n) + 1)
					break;
			}

			while (n % j == 0) {
				current_freq++;
				n = n / j;
			}

			if (n == 1 && current_freq > 1)
				System.out.println("YES");
			else if (j > Math.sqrt(m) + 1 || m == 2)
				System.out.println("NO");
			else {
				while (n > 1) {
					if (n % j == 0) {
						while (n % j == 0) {
							next_freq++;
							n = n / j;
						}
						j++;
						m = gcd(next_freq, current_freq);
						if (m < 2) {
							flag = 0;
							break;
						} else
							current_freq = m;
					} else if (j >= Math.sqrt(n) + 1)
						break;
					else
						j++;
				}
				if (flag == 1 && n < 2)
					System.out.println("YES");
				else
					System.out.println("NO");

			}
		}
	}

	private static long gcd(long n1, long n2) {
		if (n2 == 0)
			return n1;
		else if (n2 > n1)
			return gcd(n2, n1);
		else
			return gcd(n2, n1 % n2);
	}
}
