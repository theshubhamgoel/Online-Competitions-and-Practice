import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Luckyluckynumber {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, j, out;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			out = -1;
			while (n > 0) {
				if (n % 7 == 0) {
					out = n;
					break;
				} else if (n == 4) {
					out = 0;
					break;
				} else {
					n = n - 4;
				}
			}
			System.out.println(out);
		}

	}

}
