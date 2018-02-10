import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WinningatSports {

	static int[][] dp;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, a, b;
		int res1, res2;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine(), "-");
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());

			dp = new int[2005][2005];
			for (int j = 0; j < dp.length; j++) {
				Arrays.fill(dp[j], -1);
			}

			res1 = solve_stress_free(1, 0, a, b);

			dp = new int[2005][2005];
			for (int j = 0; j < dp.length; j++) {
				Arrays.fill(dp[j], -1);
			}
			
			res2 = solve_stress_full(0, 0, a, b);

			pw.println("Case #" + (i + 1) + ": " + res1 + " " + res2);
			
		}
		pw.flush();
	}

	private static int solve_stress_free(int i, int j, int a, int b) {

		if (i <= j)
			return 0;

		if (i == a && j == b)
			return 1;

		if (i > a || j > b)
			return 0;

		if (i == a || j == b)
			return 1;

		if (dp[i][j] != -1)
			return dp[i][j];

		dp[i + 1][j] = solve_stress_free(i + 1, j, a, b);
		dp[i][j + 1] = solve_stress_free(i, j + 1, a, b);
		dp[i][j] = (dp[i + 1][j] % 1000000007 + dp[i][j + 1] % 1000000007) % 1000000007;
		return dp[i][j];
	}

	private static int solve_stress_full(int i, int j, int a, int b) {

		
		if (i == a || j == b)
			return 1;

		if (i > a || j > b)
			return 0;

		if (i > j && j == b)
			return 1;

		if (i > j && j < b)
			return 0;
		
		if (dp[i][j] != -1)
			return dp[i][j];

		
		dp[i + 1][j] = solve_stress_full(i + 1, j, a, b);
		dp[i][j + 1] = solve_stress_full(i, j + 1, a, b);
		dp[i][j] = (dp[i + 1][j] % 1000000007 + dp[i][j + 1] % 1000000007) % 1000000007;
		
		//System.out.println(dp[i][j]);
		return dp[i][j];
	}

}
