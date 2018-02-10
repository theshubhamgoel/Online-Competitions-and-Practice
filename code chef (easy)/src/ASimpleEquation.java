import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASimpleEquation {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a, b, c, m, l;
		long count; 
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");

			n = Integer.parseInt(temp[0]);
			a = Integer.parseInt(temp[1]);
			b = Integer.parseInt(temp[2]);
			c = Integer.parseInt(temp[3]);

			count = 0;
			for (int j = 0; j <= a; j++) {
				if (j > n)
					break;
				if (j == n) {
					count++;
					continue;
				}
				m = n - j;
				for (int j2 = 0; j2 <= b; j2++) {
					if (j2 > m)
						break;
					if (j2 == m) {
						count++;
						continue;
					}
					l = m - j2;
					if (c <= l)
						count += c + 1;
					else
						count += l + 1;
				}
			}
			System.out.println(count);
		}
	}
}
