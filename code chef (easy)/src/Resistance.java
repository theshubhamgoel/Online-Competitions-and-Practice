import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		String[] temp;
		double m, p, q, x, y;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			n = Integer.parseInt(temp[0]);
			m = Double.parseDouble(temp[1]);

			p = q = x = y = 1;
			for (int j = 1; j < n; j++) {
				y = x + y;
				p = x * y;
				q = x + y;
				y = p / q;
			}
			System.out.println(p + "/" + q);

		}
	}

}
