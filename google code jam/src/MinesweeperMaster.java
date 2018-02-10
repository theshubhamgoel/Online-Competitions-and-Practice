import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MinesweeperMaster {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, r, c, m, x1, x2;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			pw.println("Case #:" + (i + 1));

			temp = new StringTokenizer(br.readLine());

			r = Integer.parseInt(temp.nextToken());
			c = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			if (r == 1 || c == 1) {

			} else {
				x1 = r * c - m;
				if (m < 4) {
					pw.println("Impossible");
				} else {
					for (int j = 0; j < r; j++) {
						for (int j2 = 0; j2 < c; j2++) {
							if (j == r - 1 && j2 == c - 1)
								pw.print("c");
							else if (j == r - 2 && j2 == c - 1)
								pw.print(".");
							else if (j == r - 1 && j2 == c - 2)
								pw.print(".");
							else if (m != 0) {
								pw.print("*");
								m--;
							} else
								pw.print(".");
						}
						pw.println();
					}
				}
			}

		}
	}
}
