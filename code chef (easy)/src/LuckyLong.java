import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LuckyLong {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String temp;
		BigInteger result;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			result = new BigInteger("0");

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) != '4' && temp.charAt(j) != '7')
					result = result.add(new BigInteger("1"));
			}
			System.out.println(result);
		}

	}

}
