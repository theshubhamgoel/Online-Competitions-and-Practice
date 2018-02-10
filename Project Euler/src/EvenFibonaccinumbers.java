import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenFibonaccinumbers {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long test_cases = 0, n;
		long ans, a, b, c;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Long.parseLong(br.readLine());
			ans = 0;
			a = 1;
			b = 2;
			while (b <= n) {
				if (b % 2 == 0)
					ans += b;
				c = a;
				a = b;
				b = a + c;
			}
			
			System.out.println(ans);
		}
	}
}
