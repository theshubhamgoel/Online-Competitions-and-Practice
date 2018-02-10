import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecreasingString {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a = 0, j = 0;
		String out = "", out1 = "";
		String s = "zyxwvutsrqponmlkjihgfedcba";
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			out = "";
			a = Integer.parseInt(br.readLine());

			while (a > 25) {
				out += s;
				a = a - 25;
			}
			for (j = 25 - a; j < 26; j++) {
				out1 += s.charAt(j);
			}
			out = out1 + out;
			out1 = "";
			System.out.println(out);
		}
	}
}
