import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abc {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, m, x = 0;
		test_cases = Integer.parseInt(br.readLine());
		int ans[] = new int[] { 0, 0, 79, 1021, 15621, 79917, 64396, 8327,
				40338, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < test_cases; i++) {
			m = Integer.parseInt(br.readLine());
			System.out.println(ans[m]);
		}

	}

}
