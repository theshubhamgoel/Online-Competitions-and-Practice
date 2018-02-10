import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Geekoandtree {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, sum;
		BigInteger b, b2, k1;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			k = Integer.parseInt(temp.nextToken());
			n = Integer.parseInt(temp.nextToken());
			b = BigInteger.ZERO;
			b2 = BigInteger.ONE;
			k1 = new BigInteger("" + k);
			if (k != 0) {
				for (int j = 1; j <= n; j++) {
					b2 = b2.multiply(k1);
					b = b.add(b2);
				}
				b=b.add(BigInteger.ONE);
			}
			else
				b=BigInteger.ONE;
			String s = String.valueOf(b);
			sum = 0;
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - 48;
			}
			System.out.println(sum);

		}

	}
}
