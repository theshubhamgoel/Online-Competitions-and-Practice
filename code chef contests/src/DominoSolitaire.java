import java.io.IOException;
import java.util.Scanner;

public class DominoSolitaire {

	static int[] row1, row2, dp;
	static int n;

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);

		n = sc.nextInt();
		row1 = new int[n];
		row2 = new int[n];
		dp = new int[n];

		
		for (int j = 0; j < row1.length; j++) {
			row1[j] = sc.nextInt();
		}

		for (int j = 0; j < row1.length; j++) {
			row2[j] = sc.nextInt();
		}

		int max = new DominoSolitaire().solve(0);
		System.out.println(max);

	}

	private int solve(int i) {

		int max = 0;
		if (i >= n)
			return 0;

		int d1, d2;

		if (dp[i] != 0)
			return dp[i];

		d1 = solve(i + 1) + Math.abs(row1[i] - row2[i]);

		if (i + 1 >= n)
			d2 = 0;
		else
			d2 = solve(i + 2) + Math.abs(row1[i] - row1[i + 1])
					+ Math.abs(row2[i] - row2[i + 1]);

		dp[i] = max = Math.max(d1, d2);

		return max;
	}
}
