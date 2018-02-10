import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindHackerRank {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			x = br.readLine();

			if (x.startsWith("hackerrank") && x.endsWith("hackerrank")) {
				System.out.println(0);
			} else if (x.startsWith("hackerrank")) {
				System.out.println(1);
			} else if (x.endsWith("hackerrank")) {
				System.out.println(2);
			} else {
				System.out.println(-1);
			}
		}
	}
}
