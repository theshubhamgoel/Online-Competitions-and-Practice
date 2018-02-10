import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SerejaandGCD {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, l, r, flag, ans, a, power, no;
		StringTokenizer temp;
		ArrayList<Integer> d;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			d = new ArrayList<Integer>();
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());
			l = Integer.parseInt(temp.nextToken());
			r = Integer.parseInt(temp.nextToken());

			for (int j = l; j <= r; j++) {

				flag = 1;
				for (int j2 = 0; j2 < d.size(); j2++) {
					if (j % d.get(j2) == 0) {
						flag = 0;
						break;
					}
				}
				if (flag == 1)
					d.add(j);
			}

			long minus = 0;
			double mul, x;
			for (int j = 0; j < d.size(); j++) {
				for (int j2 = j + 1; j2 < d.size(); j2++) {
					mul = 1.0 * d.get(j) * d.get(j2);
					x = mul;
					while (x <= m * 1.0) {
						minus++;
						x += mul;
					}
				}
			}

			// System.out.println(d.size());

			ans = 0;
			for (int j = 0; j < d.size(); j++) {
				no = d.get(j);
				power = m / no;
				a = 1;
				for (int j2 = 0; j2 < n; j2++) {
					a = (int) ((1L * a * power) % 1000000007);
				}
				ans = (int) ((0L + ans + a) % 1000000007);
			}

			ans = (int) ((0L + ans - minus + 1000000007) % 1000000007);
			System.out.println(ans);
		}
	}
}
