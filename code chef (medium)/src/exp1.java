import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exp1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		long n, m;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			n = Long.parseLong(temp[0]);
			m = Long.parseLong(temp[1]);
			System.out.println((long)(n * 100.0) % m);
		}
	}

	private static double combination(double e, double j) {
		double u, d, x;
		j = Math.min(j, e - j);
		u = 1;
		for (int k = 0; k < j; k++) {
			u = (u * e);
			e--;
		}

		d = 1;
		x = j;
		for (int k = 0; k < j - 1; k++) {
			d = d * x;
			x--;
		}
		return u / d;
	}
}
