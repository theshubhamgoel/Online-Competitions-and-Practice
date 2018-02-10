import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fombinatorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, q, r, result;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());
			q = Integer.parseInt(temp.nextToken());

			result = 0;
			for (int j = 0; j < q; j++) {
				temp = new StringTokenizer(br.readLine());
				r = Integer.parseInt(temp.nextToken());

				result = calculate(n) / (calculate(r) * calculate(n - r));
				result = result % m;
				System.out.println(result);
			}

		}
	}

	private static int calculate(int n) {

		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= Math.pow(i, i);
		}
		return res;
	}

}
