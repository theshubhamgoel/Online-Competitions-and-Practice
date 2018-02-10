import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SplittingCandies {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long test_cases = 0, n, k;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (long i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Long.parseLong(temp.nextToken());
			k = Long.parseLong(temp.nextToken());

			try {
				System.out.println(n / k + " " + n % k);
			} catch (Exception e) {
				System.out.println("0 " + n);
			}

		}
	}
}
