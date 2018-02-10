import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class GCD2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			BigInteger a = new BigInteger("" + Integer.parseInt(temp[0]));
			BigInteger b = new BigInteger("" + Integer.parseInt(temp[1]));

			System.out.println(a.gcd(b));
		}
	}
}
