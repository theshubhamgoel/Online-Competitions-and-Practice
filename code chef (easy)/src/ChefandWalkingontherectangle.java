import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandWalkingontherectangle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, m, k;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			if (n == 1 && m == 1)
				System.out.println("0");
			else if (n == 1) {
				if (m > 2)
					System.out.println(k);
				else
					System.out.println("0");
			} else if (m == 1) {
				if (n > 2)
					System.out.println(k);
				else
					System.out.println("0");
			} else
				System.out.println((int) Math.ceil(k / 2.0));

		}
	}
}
