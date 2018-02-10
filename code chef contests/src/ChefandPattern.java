import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ChefandPattern {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k;
		long pow;
		BigInteger b1;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			k = Integer.parseInt(temp.nextToken());
			n = Integer.parseInt(temp.nextToken());

			if (n == 1)
				System.out.println("1");
			else if (n == 2 || n == 3)
				System.out.println(k);
			else {
				pow = (n - 3) * 2;
				b1 = new BigInteger("" + k);
				b1 = b1.modPow(new BigInteger("" + pow), new BigInteger(
						"" + 1000000007));
				System.out.println(b1);
			}
		}
	}
}
