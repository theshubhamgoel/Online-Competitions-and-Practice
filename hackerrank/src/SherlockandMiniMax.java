import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SherlockandMiniMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, p, q, a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		temp = new StringTokenizer(br.readLine());
		p = Integer.parseInt(temp.nextToken());
		q = Integer.parseInt(temp.nextToken());
		Arrays.sort(a);

		if (a[0] >= q)
			System.out.println(p);
		else if (a[n - 1] <= p)
			System.out.println(q);
		else {
			int x, max = 0;
			while (true) {
				x = (p + q) / 2;
				int t = max;
				if (Math.abs(x - a[0]) > Math.abs(x - a[n - 1])) {
					max = max < Math.abs(x - a[0]) ? Math.abs(x - a[0]) : max;
					p = x;
				} else {
					max = max < Math.abs(x - a[n - 1]) ? Math.abs(x - a[0])
							: max;
					q = x;
				}

				if (t == max)
					break;

				if (Math.abs(p - q) == 1) {
					x = Math.min(p, q);
					max = 0;
					if (Math.abs(x - a[0]) > Math.abs(x - a[n - 1])) {
						max = max < Math.abs(x - a[0]) ? Math.abs(x - a[0])
								: max;
					} else {
						max = max < Math.abs(x - a[n - 1]) ? Math.abs(x
								- a[n - 1]) : max;
					}

					t = max;
					if (Math.abs(x + 1 - a[0]) > Math.abs(x + 1 - a[n - 1])) {
						max = max < Math.abs(x + 1 - a[0]) ? Math.abs(x + 1
								- a[0]) : max;
					} else {
						max = max < Math.abs(x + 1 - a[n - 1]) ? Math.abs(x + 1
								- a[n - 1]) : max;
					}

					if (t == max) {
						break;
					} else {
						x++;
						break;
					}

				}
			}

			System.out.println(x);
		}
	}
}
