import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pleaselikeme {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double test_cases = 0, l, d, s, c, a;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			l = Integer.parseInt(temp[0]);
			d = Integer.parseInt(temp[1]);
			s = Integer.parseInt(temp[2]);
			c = Integer.parseInt(temp[3]);

			a = 0;
			for (int j = 1; j < d; j++) {
				a += combination(d - 1, j) * c;
				if (a >= l)
					break;
				c = c * c;
			}
			a = a * s;
			
			if (a >= l)
				System.out.println("ALIVE AND KICKING");
			else
				System.out.println("DEAD AND ROTTING");

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
