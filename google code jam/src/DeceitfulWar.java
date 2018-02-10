import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class DeceitfulWar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int test_cases = 0, n, x1, x2;
		double a[], b[], c[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			a = new double[n];
			b = new double[n];
			c = new double[n];
			x1 = x2 = 0;

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[j] = Double.parseDouble(temp.nextToken());
			}

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				b[j] = Double.parseDouble(temp.nextToken());
				c[j] = b[j];
			}

			double t1, d;
			int index;
			for (int j = 0; j < a.length; j++) {
				t1 = a[j];
				index = -1;
				d = 2;
				for (int j2 = 0; j2 < b.length; j2++) {
					if (t1 < b[j2]) {
						if (d > (b[j2] - t1)) {
							d = b[j2] - t1;
							index = j2;
						}
					}
				}
				if (index == -1)
					x2++;
				else
					b[index] = 0;

			}

			Arrays.sort(c);
			for (int j = 0; j < c.length; j++) {
				b[b.length - 1 - j] = c[j];
			}

			Arrays.sort(a);

			int k1 = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[j] > a[a.length - 1]) {
					a[k1] = 0;
					k1++;
				} else {
					d = 2;
					index = -1;
					for (int j2 = 0; j2 < b.length; j2++) {
						if (b[j] <= a[j2]) {
							if (d > (a[j2]-b[j])) {
								index = j2;
								d = a[j2]-b[j];
							}
						}
					}
					x1++;
					a[index]=0;
				}
				Arrays.sort(a);
			}
			pw.println("Case #" + (i + 1) + ": " + x1 + " " + x2);
		}
		
		pw.flush();
	}
}
