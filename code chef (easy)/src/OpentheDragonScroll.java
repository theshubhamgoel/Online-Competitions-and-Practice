import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OpentheDragonScroll {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a, b, c1, c2, d;
		String x;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());
			c1 = c2 = 0;

			x = Integer.toBinaryString(a);
			for (int j = 0; j < x.length(); j++) {
				if (x.charAt(j) == '1')
					c1++;
			}

			x = Integer.toBinaryString(b);
			for (int j = 0; j < x.length(); j++) {
				if (x.charAt(j) == '1')
					c2++;
			}

			x = "";

			if (c1 + c2 <= n)
				d = c1 + c2;
			else
				d = 2 * n - c1 - c2;

			for (int j = 0; j < d; j++) {
				x = "1" + x;
			}

			for (int j = 0; j < n - d; j++) {
				x += "0";
			}

			System.out.println(Integer.parseInt(x, 2));
		}

	}
}
