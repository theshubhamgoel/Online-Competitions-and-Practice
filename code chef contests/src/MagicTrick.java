import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		long a, b, c;
		long l[];
		String temp[], s;
		double d;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			l = new long[n];
			temp = br.readLine().split(" ");

			for (int j = 0; j < n; j++)
				l[j] = Long.parseLong(temp[j]);
			temp = br.readLine().split(" ");
			a = Long.parseLong(temp[0]);
			b = Long.parseLong(temp[1]);
			c = Long.parseLong(temp[2]);
			s = br.readLine();

			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(j) == 'R') {
					long x;
					int e = 1, f = (l.length - j) / 2;

					for (int k = 0; k < f; k++) {
						x = l[k + j];
						l[k + j] = l[l.length - e];
						l[l.length - e] = x;
						e++;
					}

				} else if (s.charAt(j) == 'A') {
					d = a + 0.0;
					for (int j2 = j; j2 < l.length; j2++)
						l[j2] = (long) ((l[j2] + d) % c);

				} else if (s.charAt(j) == 'M') {
					d = b + 0.0;
					for (int j2 = j; j2 < l.length; j2++)
						l[j2] = (long) ((l[j2] * d) % c);
				}

				System.out.print(l[j]);
				if (j != s.length() - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
