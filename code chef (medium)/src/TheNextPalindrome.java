import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TheNextPalindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String temp;
		BigInteger b;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			try {
				b = new BigInteger(br.readLine());
				b = b.add(new BigInteger("1"));
				temp = String.valueOf(b);
				while (!temp.equals((new StringBuilder(temp).reverse())
						.toString())) {
					b = b.add(new BigInteger("1"));
					temp = String.valueOf(b);
				}
				System.out.println(b);
			} catch (Exception e) {
				System.out.println();
			}
		}
	}
}
