import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicRankings {

	static int length;
	static int t[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, s1;
		StringTokenizer temp;
		int s[][];
		double sum;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			s = new int[n][n];
			t = new int[n][n];
			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < n; j2++) {
					s[j][j2] = Integer.parseInt(temp.nextToken());
				}
			}
			length = n;
			s1 = sumcal(0, 0, s);

			sum = s1 / (2 * n - 3.0);
			if (sum >= 0)
				System.out.println(sum);
			else
				System.out.println("Bad Judges");
		}
	}

	private static int sumcal(int n, int m, int[][] s) {

		int sum = 0;
		if (n == length - 1 && m == length - 1)
			return sum;

		else if (n == length - 1) {
			for (int i = m; i < s.length; i++) {
				sum += s[n][i];
			}
			return sum;

		} else if (m == length - 1) {
			for (int i = n; i < s.length; i++) {
				sum += s[i][m];
			}
			return sum;

		} else if (t[n][m] != 0) {
			return t[n][m];

		} else {
			sum += s[n][m] + Math.max(sumcal(n, m + 1, s), sumcal(n + 1, m, s));
			t[n][m] = sum;
			return sum;
		}

	}

}
