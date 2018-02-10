import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NewYearsResolution {

	static int p_final, c_final, f_final, p_sum, c_sum, f_sum, n;
	static int[] p_food, c_food, f_food;
	static int [][]dp;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0;

		StringTokenizer temp;
		String ans;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			p_final = Integer.parseInt(temp.nextToken());
			c_final = Integer.parseInt(temp.nextToken());
			f_final = Integer.parseInt(temp.nextToken());

			n = Integer.parseInt(br.readLine());

			p_food = new int[n];
			c_food = new int[n];
			f_food = new int[n];

			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				p_food[j] = Integer.parseInt(temp.nextToken());
				c_food[j] = Integer.parseInt(temp.nextToken());
				f_food[j] = Integer.parseInt(temp.nextToken());
			}

			dp=new int[2][n];
			
			Arrays.fill(dp[0], -1);
			Arrays.fill(dp[1], -1);
			
			int x = solve(0, 0, 0, 0);
			if (x == 1)
				ans = "yes";
			else
				ans = "no";

			pw.println("Case #" + (i + 1) + ": " + ans);
		}
		pw.flush();
	}

	private static int solve(int i, int temp_sum_p, int temp_sum_c,
			int temp_sum_f) {

		if (temp_sum_p == p_final && temp_sum_c == c_final
				&& temp_sum_f == f_final)
			return 1;

		if (i == n)
			return 0;

		if (solve(i + 1, temp_sum_p, temp_sum_c, temp_sum_f) == 1
				|| solve(i + 1, temp_sum_p + p_food[i], temp_sum_c + c_food[i],
						temp_sum_f + f_food[i]) == 1)
			return 1;
		
		return 0;
	}
}
