import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Letusplaywithevenandoddnumbers {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long test_cases = 0, e, o, n, two, three, min;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			e = Integer.parseInt(temp.nextToken());
			o = Integer.parseInt(temp.nextToken());

			if ((e + o) % 5 != 0 || (e + o) == 0) {
				System.out.println("-1");
				continue;
			}

			n = (e + o) / 5;
			two = 2 * n;
			three = 3 * n;

			min = Math.min(Math.abs(two - e), Math.abs(three - o));

			System.out.println(min);

		}
	}
}
