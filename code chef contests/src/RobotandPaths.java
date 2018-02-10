import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RobotandPaths {

	static int n, m, p, x, y;
	static int mat[][], dp[][];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());

		m = Integer.parseInt(temp.nextToken());
		n = Integer.parseInt(temp.nextToken());
		p = Integer.parseInt(temp.nextToken());

		dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			Arrays.fill(dp[i], -1);
		}

		mat = new int[m--][n--];
		for (int i = 0; i < p; i++) {
			temp = new StringTokenizer(br.readLine());
			x = Integer.parseInt(temp.nextToken()) - 1;
			y = Integer.parseInt(temp.nextToken()) - 1;
			mat[x][y] = 1;
		}

		int ans = solve(0, 0);
		System.out.println(ans);
	}

	private static int solve(int i, int j) {

		int count = 0;

		if (i > m || j > n || mat[i][j] == 1)
			return 0;

		if (i == m && j == n)
			return 1;

		if (dp[i][j] != -1)
			return dp[i][j];

		dp[i][j] = count = (int) ((0L + count % 1000000007 + solve(i, j + 1) % 1000000007 + solve(
				i + 1, j) % 1000000007) % 1000000007);
		return count;
	}
}
