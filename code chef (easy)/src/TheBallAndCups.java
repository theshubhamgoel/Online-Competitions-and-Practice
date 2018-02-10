import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBallAndCups {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, c, q, l, r;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			c = Integer.parseInt(temp[1]);
			q = Integer.parseInt(temp[2]);

			for (int j = 0; j < q; j++) {
				temp = br.readLine().split(" ");
				l = Integer.parseInt(temp[0]);
				r = Integer.parseInt(temp[1]);

				if (c > r || c < l)
					continue;

				c = r - c + l;
			}
			System.out.println(c);
		}
	}
}
