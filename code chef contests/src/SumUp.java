import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumUp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, a, b, base = 0;
		StringTokenizer temp;
		String t1, t2, x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			t1 = temp.nextToken();
			t2 = temp.nextToken();

			for (int j = 9; j >= 0; j--) {
				x = String.valueOf(j);
				if (t1.contains(x)) {
					base = j + 1;
					break;
				}
			}

			a = 0;
			b = 0;
			for (int j = t1.length() - 1; j >= 0; j--) {
				a += (int) (Math.pow(base, t1.length() - j - 1) * (t1.charAt(j) - 48));
			}

			for (int j = 9; j >= 0; j--) {
				x = String.valueOf(j);
				if (t2.contains(x)) {
					base = j + 1;
					break;
				}
			}

			for (int j = t2.length() - 1; j >= 0; j--) {
				b += (int) (Math.pow(base, t2.length() - j - 1) * (t2.charAt(j) - 48));
			}

			System.out.println(a + b);

		}
	}
}
