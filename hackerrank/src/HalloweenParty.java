import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalloweenParty {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			long x = n / 2;
			if (n % 2 == 0)
				System.out.println(x * x);
			else
				System.out.println(x * (x + 1));

		}

	}

}
