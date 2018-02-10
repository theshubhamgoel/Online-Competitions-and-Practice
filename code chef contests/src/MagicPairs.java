import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MagicPairs {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		test_cases = Integer.parseInt(br.readLine());
		BigInteger x,y;

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			x = new BigInteger("" + n);
			y = new BigInteger("" + (n-1));
			br.readLine();
			x = x.multiply(y);
			x = x.divide(new BigInteger("2"));
			System.out.println(x);
		}
	}
}
