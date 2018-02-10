import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CatsofSchrodinger {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, h, totalCat, totalCatBelowH;
		BigInteger b;
		long d;
		StringTokenizer temp;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			h = Integer.parseInt(temp.nextToken());
			d = Long.parseLong(temp.nextToken());

			if (d == 0) {
				System.out.println("0");
				continue;
			}

			b = new BigInteger("2");
			b = b.modPow(new BigInteger("" + d),
					new BigInteger("" + 1000000007));

			totalCat = b.intValue();
			System.out.println(totalCat);
			totalCatBelowH = 0;
			for (int j = 0; j < h; j++) {
				totalCatBelowH = (totalCatBelowH + comb(d, j)) % 1000000007;
			}

			System.out.println(totalCatBelowH);
			int x = (int) ((0L + totalCat + 1000000007 - totalCatBelowH) % 1000000007);

			if (x > 0)
				System.out.println(x);
			else
				System.out.println("0");

		}
	}

	private static int comb(long N, int K) {
		// TODO Auto-generated method stub

		BigInteger ret = BigInteger.ONE;
		for (int k = 0; k < K; k++) {
			ret = ret.multiply(BigInteger.valueOf(N - k)).divide(
					BigInteger.valueOf(k + 1));
		}

		ret = ret.mod(new BigInteger("" + 1000000007));
		return ret.intValue();
	}
}
