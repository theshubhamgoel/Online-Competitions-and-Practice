import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Possiblesums {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, count, s, a[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		int sum[];

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			a = new int[n];

			s = 0;
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
				s += a[j];
			}
			sum = new int[s + 1];

			sum[0] = sum[s] = 1;

			for (int j = 0; j < n; j++) {
				sum[s - a[j]] = 1;
			}
		}
	}

}
