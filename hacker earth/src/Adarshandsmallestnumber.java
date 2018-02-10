import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Adarshandsmallestnumber {

	static boolean[] primes = new boolean[500001];
	static ArrayList<Integer> p = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		test_cases = Integer.parseInt(br.readLine());

		fillSieve();

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			int ans = 1;
			for (int j = 0; j < p.size(); j++) {
				if (p.get(j) <= n) {
					ans = (int) ((1L * ans * p.get(j)) % 1000000007);
				}
				else
					break;
			}
			
			System.out.println(ans);

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
