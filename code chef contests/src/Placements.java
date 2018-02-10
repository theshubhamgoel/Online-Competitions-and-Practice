import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Placements {

	static int a[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, c, min;

		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			c = Integer.parseInt(temp.nextToken());

			a = new int[n];
			
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			String s;

			min = 1000000001;
			int count = (int) Math.pow(2, n);
			for (int j = 0; j < count; j++) {
				s = Integer.toBinaryString(j);
				while (s.length() != n)
					s = "0"+s;

				 //System.out.println(s);
				long sum = 0;
				for (int j2 = 0; j2 < s.length(); j2++) {
					if (s.charAt(j2) == '1')
						sum += a[j2];
				}

				 //System.out.println(sum);
				if (sum <= c)
					if (min > (c - sum)) {
						min = (int) (c - sum);
					}
			}

			System.out.println(min);
			// min = solve(0, 0, c);

			// System.out.println(c - min);
		}
	}

	private static int solve(int i, int current, int reuired) {

		if (i >= a.length || current == reuired)
			return 0;

		int d1, d2;
		if (current + a[i] < reuired)
			d1 = a[i] + solve(i + 1, current + a[i], reuired);
		else
			d1 = 0;

		d2 = solve(i + 1, current, reuired);

		return Math.max(d1, d2);
	}
}
