import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtopianTree {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_cases, n, x;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			x = 1;

			for (int j = 0; j < n; j++) {
				if (j % 2 == 0)
					x *= 2;
				else
					x += 1;
			}
			
			System.out.println(x);
		}
	}
}
