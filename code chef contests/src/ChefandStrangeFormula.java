import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChefandStrangeFormula {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int n, m, ans;
		int[] fact, fun;
		long p;
		// StringTokenizer temp;
		// temp = new StringTokenizer(br.readLine());
		// n = Integer.parseInt(temp.nextToken());
		// m = Integer.parseInt(temp.nextToken());

		n = sc.nextInt();
		m = sc.nextInt();

		fact = new int[m + 1];
		fun = new int[m + 1];

		fact[0] = fact[1] = 1;
		fun[0] = 0;
		fun[1] = 1;
		for (int i = 2; i < fact.length; i++) {
			fact[i] = (int) ((1L * i * fact[i - 1]) % m);
			fun[i] = (int) ((fun[i - 1] + 1L * i * fact[i]) % m);
		}

		// System.out.println(Arrays.toString(fun));

		ans = 0;
		// temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			// p = Long.parseLong(temp.nextToken());
			p = sc.nextLong();
			int additional = 0;

			additional = cal_additional(p, m);
			// System.out.println(additional);

			if (p > m)
				p = m;

			ans = (ans + fun[(int) p] + additional) % m;
		}

		System.out.println(ans);
	}

	private static int cal_additional(long n, int m) {

		BigInteger b = new BigInteger("" + n);

		b = b.multiply(new BigInteger("" + n));
		b = b.multiply(new BigInteger("" + (n + 1)));

		// System.out.println(b);
		b = b.divide(new BigInteger("2"));
		b = b.mod(new BigInteger("" + m));

		return b.intValue();
	}
}
