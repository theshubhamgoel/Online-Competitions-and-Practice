import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaximumWeightDifference {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, sum, w = 0;
		int weight[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());
			weight = new int[n];
			temp = new StringTokenizer(br.readLine());

			sum = 0;
			for (int j = 0; j < n; j++) {
				weight[j] = Integer.parseInt(temp.nextToken());
				sum += weight[j];
			}

			Arrays.sort(weight);
			w = 0;
			if (k > n / 2)
				k = n - k;

			for (int j = 0; j < k; j++) {
				w += weight[j];
			}

			System.out.println(Math.abs(sum - 2 * w));

		}
	}
}
