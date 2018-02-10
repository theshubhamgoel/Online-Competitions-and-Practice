import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exponential {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			x = Integer.parseInt(br.readLine());
			// System.out.println(Math.exp(x));
			if (x == 0)
				System.out.println(1);
			else
				System.out.println((int) Math.ceil(x * Math.log10(Math.E)));
		}
	}
}
