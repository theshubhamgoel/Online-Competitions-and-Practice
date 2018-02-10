import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class RecipeReconstruction {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, no_of_place, x;
		String temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();

			no_of_place = 0;
			x = (int) Math.ceil(temp.length() / 2.0);
			for (int j = 0; j < x; j++) {
				if (temp.charAt(j) == '?'
						&& temp.charAt(temp.length() - 1 - j) == '?')
					no_of_place++;
			}

			int flag = 1;

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == temp.charAt(temp.length() - 1 - j)
						|| temp.charAt(j) == '?'
						|| temp.charAt(temp.length() - 1 - j) == '?') {
					continue;
				} else {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				BigInteger b = new BigInteger("26");
				b = b.modPow(new BigInteger("" + no_of_place), new BigInteger(
						"10000009"));
				System.out.println(b);
			} else
				System.out.println("0");

		}
	}
}
