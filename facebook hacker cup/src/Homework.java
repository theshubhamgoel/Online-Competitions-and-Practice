import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Homework {

	static int[] primacity;
	static boolean primes[] = new boolean[10000001];
	static ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, a, b, k, count;

		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		primacity = new int[10000001];

		fillSieve();

		for (int i = 0; i < primes.length; i++) {
			if (primes[i])
				al.add(i);
		}

		// System.out.println(al.size());
		// cal_primacity();

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			count = 0;
			for (int j = a; j <= b; j++) {
				if (cal(j) == k)
					count++;
			}

			pw.println("Case #" + (i + 1) + ": " + count);

		}
		
		pw.flush();
	}

	private static boolean isprime(int n) {
		return primes[n];
	}

	public static void fillSieve() {
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
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

	static int cal(int n) {
		int nn = n;
		if (primacity[n] != 0)
			return primacity[n];

		if (isprime(n))
			return 1;

		for (int i = 0; i < al.size(); i++) {
			if (n % al.get(i) == 0) {
				while (n % al.get(i) == 0)
					n = n / al.get(i);

				primacity[nn] = cal(n) + 1;
				return primacity[nn];
			}
		}

		return 0;
	}
}
