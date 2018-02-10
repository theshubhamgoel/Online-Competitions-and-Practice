import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class MazeWays {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y, m;
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		m = x > y ? x : y;
		m++;

		int a[] = new int[m];
		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			a[i] = 1;
		}

		if (x == 0) {
			System.out.println("1");
			return;
		}

		b[0] = 1;
		for (int j = 1; j <= x; j++) {
			for (int i = 1; i <= y; i++) {
				b[i] = (int) ((0L + b[i - 1] + a[i]) % 1000000007);
			}

			for (int i = 0; i < m; i++) {
				a[i] = b[i];
			}
		}

		System.out.println(b[y]);
	}
}
