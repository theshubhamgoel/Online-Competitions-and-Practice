import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximandDividers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, count, x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			count = 0;
			for (int j = 1; j * j <= n; j++) {
				if (n % j == 0) {
					if (String.valueOf(j).contains("4")
							|| String.valueOf(j).contains("7"))
						count++;
					x = n / j;
					if (x != j
							&& (String.valueOf(x).contains("4") || String
									.valueOf(x).contains("7")))
						count++;
				}
			}

			System.out.println(count);

		}
	}
}
