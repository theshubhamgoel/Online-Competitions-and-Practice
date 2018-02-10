import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class RectangularQueries {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, n, j, x1, y1, x2, y2, k, x;
		StringTokenizer temp;
		Set<Integer> set = new HashSet<Integer>();

		n = Integer.parseInt(br.readLine());
		int matrix[][][] = new int[n][n][11];

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			for (j = 0; j < n; j++) {
				x = Integer.parseInt(temp.nextToken());
				matrix[i][j][x]++;
			}
		}

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			set.clear();

			x1 = Integer.parseInt(temp.nextToken()) - 1;
			y1 = Integer.parseInt(temp.nextToken()) - 1;
			x2 = Integer.parseInt(temp.nextToken()) - 1;
			y2 = Integer.parseInt(temp.nextToken()) - 1;

			for (k = x1; k <= x2; k++) {
				for (j = y1; j <= y2; j++) {
					//set.add(matrix[k][j][]);
				}
			}
			pw.println(set.size());
		}
		pw.flush();
	}
}
