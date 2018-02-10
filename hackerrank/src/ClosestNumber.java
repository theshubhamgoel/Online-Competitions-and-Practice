import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClosestNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a, b, x, e, d;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());
			x = Integer.parseInt(temp.nextToken());

			if (b < 0) {
				if (x == 1) {
					double d1 = Math.pow(a, b);
					if (1 - d1 < d1) {
						System.out.println("1");
					} else
						System.out.println("0");
				} else
					System.out.println("0");
				continue;
			}

			d = (int) Math.pow(a, b);
			e = d % x;

			if (d < x) {
				if (x - d < d)
					System.out.println(x);
				else
					System.out.println("0");
				continue;
			}

			if (x - e < e)
				System.out.println(d + x - e);
			else
				System.out.println(d - e);
		}

	}

}
