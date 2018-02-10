import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestIncreasingPath {

	static int n, m, calulate[][];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a[][], result;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			a = new int[n][m];
			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < m; j2++) {
					a[j][j2] = Integer.parseInt(temp.nextToken());
				}
			}

			calulate = new int[n][m];
			result = cal(a, 0, 0);
			System.out.println(result);
		}

	}

	private static int cal(int[][] a, int i, int j) {
		int count = 1;
		if (calulate[i][j] != 0)
			return calulate[i][j];

		if (i == n - 1 && j == m - 1) {
			return count;
		} else if (i == n - 1) {
			for (int j2 = j; j2 < m; j2++) {
				if ((j2 + 1) != m)
					if (a[i][j2] < a[i][j2 + 1])
						count++;
					else
						break;
			}
			return count;
		} else if (j == m - 1) {
			for (int j2 = j; j2 < n - 1; j2++) {
				if ((j2 + 1) != n)
					if (a[j2][j] < a[j2 + 1][j])
						count++;
					else
						break;
			}
			return count;
		} else {
			int x, y;
			if (a[i][j] > a[i + 1][j])
				x = 0;
			else
				x = cal(a, i + 1, j);
			if (a[i][j] > a[i][j + 1])
				y = 0;
			else
				y = cal(a, i, j + 1);
			count = 1 + Math.max(x, y);
			calulate[i][j] = count;
			return count;
		}
	}

}
