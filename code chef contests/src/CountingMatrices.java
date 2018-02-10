import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingMatrices {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a, j;
		int[] sum;
		test_cases = Integer.parseInt(br.readLine());

		sum = new int[2501];
		sum[2] = 1;
		for (int i = 3; i < 2501; i++) {
			sum[i] = sum[i - 1] + calulate(i);
		}

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			
			for (int k = 1; k < n; k++) {
				cal(k, n-k);
			}

			System.out.println(sum[i]);
		}

	}

	private static int calulate(int i) {
		for (int j = 1; j < i / 2; j++) {
			cal(j, i - j);
		}
		return 0;
	}

	private static int cal(int j, int n) {

		return 0;
	}
}
