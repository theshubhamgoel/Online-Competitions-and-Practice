import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Twinsandkidsisland {

	static boolean[] primes = new boolean[10000001];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		fillSieve();

		for (int i = 0; i < test_cases; i++) {
			System.out.println(br.readLine());
			//temp = new StringTokenizer(br.readLine());

		}
	}

	public static void fillSieve() {
		Arrays.fill(primes, true); // assume all integers are prime.
		primes[0] = primes[1] = false; // we know 0 and 1 are not prime.
		for (int i = 2; i < primes.length; i++) {
			// if the number is prime,
			// then go through all its multiples and make their values false.
			if (primes[i]) {
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = false;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		return primes[n]; // simple, huh?
	}
}
