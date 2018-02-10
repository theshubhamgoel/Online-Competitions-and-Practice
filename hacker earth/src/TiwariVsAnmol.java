import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TiwariVsAnmol {

	static boolean[] primes = new boolean[100001];
	static ArrayList<Integer> p = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, l, r;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		int lowest_prime_fac[] = new int[100001];

		fillSieve();

		int sum[] = new int[100001];
		for (int i = 2; i < lowest_prime_fac.length; i++) {
			int j = 2;
			for (int j2 = 0; j2 < p.size(); j2++) {
				j = p.get(j2);
				if (j == i)
					break;

				if (i % j == 0) {
					lowest_prime_fac[i] = j;
					break;
				}
				j++;
			}
			sum[i] = (lowest_prime_fac[i] + sum[i - 1]) % 1000000007;
		}

		// System.out.println(Arrays.toString(lowest_prime_fac));

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			l = Integer.parseInt(temp.nextToken());
			r = Integer.parseInt(temp.nextToken());

			System.out.println(sum[r] - sum[l - 1]);
		}
	}

	public static void fillSieve() {
		Arrays.fill(primes, true); // assume all integers are prime.
		primes[0] = primes[1] = false; // we know 0 and 1 are not prime.
		for (int i = 2; i < primes.length; i++) {
			// if the number is prime,
			// then go through all its multiples and make their values false.
			if (primes[i]) {
				p.add(i);
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = false;
				}
			}
		}
	}
}
