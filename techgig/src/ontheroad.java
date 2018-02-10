import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ontheroad {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m;
		int a[][];
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());

		a = new int[n][m];

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(temp.nextToken());
			}
		}

		System.out.println(solve(a, 0, 0));

	}

	private static int solve(int[][] a, int i, int j) {

		if (i == a.length - 1 && j == a[0].length - 1)
			return a[i][j];

		if (i == a.length - 1)
			return a[i][j] + solve(a, i, j + 1);

		if (j == a[0].length - 1)
			return a[i][j] + solve(a, i + 1, j);

		return Math.min(a[i][j] + solve(a, i + 1, j), a[i][j]
				+ solve(a, i, j + 1));
	}

	public static int leastAmount(String[] input1) {
		int n, m;
		int a[][];
		StringTokenizer temp;

		n = input1.length;
		m = new StringTokenizer(input1[0], "#").countTokens();

		a = new int[n][m];

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(input1[i], "#");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(temp.nextToken());
			}
		}

		int x;
		x = solve(a, 0, 0);
		return x;
	}
}
