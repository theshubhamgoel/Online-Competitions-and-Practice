import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JungleRun {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, currenti, currentj;
		currenti = currentj = 0;
		int visited[][];
		char a[][];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new char[n][n];
		visited = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(visited[i], 10000);
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[i][j] = temp.nextToken().charAt(0);
				if (a[i][j] == 'S') {
					currenti = i;
					currentj = j;
				}
			}
		}

		int distance = 0;
		distance = solve(a, visited, currenti, currentj, 0);
		System.out.println(distance);

	}

	private static int solve(char[][] a, int[][] visited, int currenti,
			int currentj, int x) {
		int distance;

		if (a[currenti][currentj] == 'E')
			return 0;

		if (currenti >= 0 && currenti < visited[0].length && currentj >= 0
				&& currentj < visited[0].length) {
			if (visited[currenti][currentj] < x || a[currenti][currentj] == 'T')
				return 10000;
		} else {
			return 10000;
		}

		int d1, d2, d3, d4;
		d1 = d2 = d3 = d4 = 10000;

		visited[currenti][currentj] = x;
		if (currenti + 1 != visited[0].length)
			d1 = 1 + solve(a, visited, currenti + 1, currentj, ++x);

		if (currenti - 1 >= 0)
			d2 = 1 + solve(a, visited, currenti - 1, currentj, ++x);

		if (currentj + 1 != visited[0].length)
			d3 = 1 + solve(a, visited, currenti, currentj + 1, ++x);

		if (currentj - 1 >= 0)
			d4 = 1 + solve(a, visited, currenti, currentj - 1, ++x);

		//System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

		d1 = Math.min(d1, d2);
		d2 = Math.min(d3, d4);

		distance = Math.min(d1, d2);

		return distance;
	}
}
