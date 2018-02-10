import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplesof3and5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n, test_cases = 0, sum;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine()) - 1;
			sum = 0;

			long l, s, no;
			int a;

			a = 3;
			no = n / a;
			l = n - n % a;
			s = (no * (a + l)) / 2;
			sum += s;

			a = 5;
			no = n / a;
			l = n - n % a;
			s = (no * (a + l)) / 2;
			sum += s;

			a = 15;
			no = n / a;
			l = n - n % a;
			s = (no * (a + l)) / 2;
			sum -= s;

			System.out.println(sum);
		}

	}
}
