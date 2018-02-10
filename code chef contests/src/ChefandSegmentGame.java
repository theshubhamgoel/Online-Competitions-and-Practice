import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandSegmentGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long test_cases = 0, x, k, n;
		double result, xx;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			x = Long.parseLong(temp.nextToken());
			k = Long.parseLong(temp.nextToken());

			n = (long) (Math.floor(Math.log10(k) / Math.log10(2)) + 1);

			xx = Math.pow(2, n);
			result = (2 * k / xx - 1 + 1 / xx) * x;
			System.out.println(result);

		}
	}
}
