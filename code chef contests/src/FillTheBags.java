import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FillTheBags {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		long w1, w2, n1, n2, ans, x, y;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			w1 = Integer.parseInt(temp.nextToken());
			w2 = Integer.parseInt(temp.nextToken());
			n1 = Integer.parseInt(temp.nextToken());
			n2 = 1L * Integer.parseInt(temp.nextToken()) * 2;

			// System.out.println(w1);

			ans = 0;
			if (n2 <= w1) {
				ans += n2;
				w1 = w1 - n2;
				n2 = 0;
			} else if (n2 <= w2) {
				ans += n2;
				w2 = w2 - n2;
				n2 = 0;
			} else {

				n2 = n2 - (w1 / 2) * 2;
				ans += (w1 / 2) * 2;
				w1 = w1 - (w1 / 2) * 2;

				if (n2 <= w2) {
					ans += n2;
					w2 = w2 - n2;
					n2 = 0;
				} else {
					n2 = n2 - (w2 / 2) * 2;
					ans += (w2 / 2) * 2;
					w2 = w2 - (w2 / 2) * 2;
				}
			}

			ans += Math.min(w1 + w2, n1);
			System.out.println(ans);
		}
	}
}
