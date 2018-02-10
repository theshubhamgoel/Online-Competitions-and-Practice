import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Submatrixcontainingones {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, m, n;
		int[][] mat, S;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			m = Integer.parseInt(temp.nextToken());
			n = Integer.parseInt(temp.nextToken());

			mat = new int[m][n];
			S = new int[m][n];
			for (int j = 0; j < m; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < n; j2++) {
					mat[j][j2] = Integer.parseInt(temp.nextToken());
				}
			}

			/* Set first column of S[][] */
			for (int j = 0; j < m; j++)
				S[j][0] = mat[j][0];

			/* Set first row of S[][] */
			for (int j = 0; j < n; j++)
				S[0][j] = mat[0][j];

			int max = -1;
			for (int j = 1; j < m; j++) {
				for (int j2 = 1; j2 < n; j2++) {
					if (mat[j][j2] == 1)
						S[j][j2] = min(S[j][j2 - 1], S[j - 1][j2],
								S[j - 1][j2 - 1]) + 1;
					else
						S[j][j2] = 0;
				}
			}

			
			for (int j = 0; j < m; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					if (max < S[j][j2])
						max = S[j][j2];
				}
			}

			System.out.println(max);
		}
	}

	static int min(int a, int b, int c) {
		int m = a;
		if (m > b)
			m = b;
		if (m > c)
			m = c;
		return m;
	}
}
