import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubtractionGame1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, x;
		String[] temp;
		int sequence[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = br.readLine().split(" ");

			sequence = new int[n];

			x = sequence[0] = Integer.parseInt(temp[0]);
			for (int j = 1; j < sequence.length; j++) {
				sequence[j] = Integer.parseInt(temp[j]);
				x = gcd(x, sequence[j]);
			}
			
			System.out.println(x);

		}
	}

	private static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else if (y > x)
			return gcd(y, x);
		else
			return gcd(y, x % y);

	}

}
