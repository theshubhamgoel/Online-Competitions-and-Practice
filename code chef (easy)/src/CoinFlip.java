import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinFlip {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, g, i, n, q, k;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (k = 0; k < test_cases; k++) {
			g = Integer.parseInt(br.readLine());
			for (int j = 0; j < g; j++) {
				temp = br.readLine().split(" ");
				i = Integer.parseInt(temp[0]);
				n = Integer.parseInt(temp[1]);
				q = Integer.parseInt(temp[2]);

				if (i == 1) {
					if (q == 1)
						System.out.println((int) (n / 2));
					if (q == 2)
						System.out.println((int) Math.ceil(n / 2.0));
				} else {
					if (q == 1)
						System.out.println((int) Math.ceil(n / 2.0));
					if (q == 2)
						System.out.println((int) (n / 2));
				}

			}

		}
	}
}
