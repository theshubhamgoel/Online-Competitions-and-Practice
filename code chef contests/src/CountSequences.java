import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CountSequences {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		int len, l, r, N, R;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			len = Integer.parseInt(temp.nextToken());
			l = Integer.parseInt(temp.nextToken());
			r = Integer.parseInt(temp.nextToken());

			int no_of_digit = r - l + 1;
			N = len + no_of_digit;
			R = len;

			R = R > (N - R) ? (N - R) : R;

			int ans = cal(N, R) - 1;
			System.out.println(ans);

		}
	}

	public static int comb(int n, int r) {

		if (n <= 1 || r <= 1)
			return n;
		
		if(n==r)
			return 1;

		return (comb(n - 1, r) + comb(n - 1, r - 1)) % 1000003;
	}

	private static int cal(long n, long r) {
		BigInteger b1 = BigInteger.ONE;
		for (int i = (int) n; i > n - r; i--) {
			b1 = b1.multiply(new BigInteger("" + i));
		}

		BigInteger b2 = BigInteger.ONE;
		for (int i = (int) r; i > 1; i--) {
			b2 = b2.multiply(new BigInteger("" + i));
		}

		b1 = b1.divide(b2);
		b1 = b1.mod(new BigInteger("" + 1000003));

		return b1.intValue();
	}
}
