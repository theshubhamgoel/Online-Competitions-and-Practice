import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LastDigitSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases;
		String a;
		int c;
		long d, e, ans, sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			d = Integer.parseInt(temp.nextToken());
			e = Integer.parseInt(temp.nextToken());

			sum = 0;
			for (long j = d; j <= e; j++) {
				a = String.valueOf(j);
				ans = 0;
				for (int j2 = 0; j2 < a.length(); j2++) {
					c = a.charAt(j2) - 48;
					if (c % 2 == 0)
						ans += 2 * c;
					else
						ans += c;
				}
				ans %= 10;
				sum += ans;
			}
			System.out.println(sum);
		}
	}
}
