import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheMinimumNumberOfMoves {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, min, sum, n, x;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			sum = 0;
			min = 100000;

			for (int j = 0; j < n; j++) {
				x = Integer.parseInt(temp.nextToken());
				sum += x;
				if (min > x)
					min = x;
			}
			
			System.out.println(sum-n*min);
		}
	}
}
