import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyandCipherDisk {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, t[];
		String x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			x = br.readLine();
			t = new int[x.length()];
			int n, a, b, pre = 0;
			for (int j = 0; j < x.length(); j++) {
				n = x.charAt(j) - 97;

				if (pre == n) {
					t[j] = 0;
				} else if (pre < n) {
					a = n - pre;
					b = 26 - a;

					if (a <= b)
						t[j] = a;
					else
						t[j] = -b;
				} else if (pre > n) {
					a = pre - n;
					b = 26 - a;

					if (b <= a)
						t[j] = b;
					else
						t[j] = -a;

				}

				pre = n;
			}
			for (int j = 0; j < t.length-1; j++) {
				System.out.print(t[j]+" ");
			}
			
			System.out.println(t[t.length-1]);
		}
	}
}
