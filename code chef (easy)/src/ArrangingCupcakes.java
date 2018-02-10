import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangingCupcakes {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, x, y, min,a;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			x = 1;
			y = n;
			a=(int) Math.sqrt(n);
			min = y - x;
			for (int k = 2; k <= a; k++) {
				if (n % k == 0) {
					x = k;
					y = n / x;

					if (y >= x && y - x < min) {
						min = y - x;
					}
				}
			}
			System.out.println(min);
		}
	}
}
