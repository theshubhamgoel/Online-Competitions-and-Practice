import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManasaandStones {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a, b, t, c, d;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());

			if (a == b) {
				System.out.println(a * (n - 1));
				continue;
			}
			if (a > b) {
				t = a;
				a = b;
				b = t;
			}

			c = a * (n - 1);
			d = b * (n - 1);

			for (int j = c; j <= d;) {
				System.out.print(j+" ");
				j = j - a + b;
			}
			System.out.println();
		}
	}

}
