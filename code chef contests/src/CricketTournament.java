import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CricketTournament {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, max;
		int[] a;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			a = new int[n];

			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			max = -1000000001;

			for (int j = n - 1; j >= 0; j--) {
				for (int j2 = 0; j2 < j; j2++) {
					if ((a[j] - a[j2]) > max)
						max = a[j] - a[j2];
				}
			}

			System.out.println(max);

		}
	}
}
