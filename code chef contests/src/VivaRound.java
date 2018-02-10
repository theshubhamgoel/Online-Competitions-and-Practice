import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VivaRound {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, q, type, x, y, val;
		long[] a, sum,s;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			q = Integer.parseInt(temp.nextToken());

			a = new long[n];
			sum = new long[n];
			s=new long[n];

			for (int j = 0; j < q; j++) {
				temp = new StringTokenizer(br.readLine());
				type = Integer.parseInt(temp.nextToken());
				x = Integer.parseInt(temp.nextToken()) - 1;
				y = Integer.parseInt(temp.nextToken()) - 1;

				if (type == 0) {
					val = Integer.parseInt(temp.nextToken());

					a[x] += val;
					if (y != n - 1)
						a[y + 1] -= val;

				} else {
					//System.out.println(Arrays.toString(a));
					s[0]=sum[0] = a[0];
					for (int j2 = 1; j2 < a.length; j2++) {
						s[j2] = s[j2 - 1] + a[j2];
						sum[j2] = sum[j2 - 1] + s[j2];
					}
					
					//System.out.println(Arrays.toString(sum));
					if (x == 0)
						System.out.println(sum[y]);

					else
						System.out.println(sum[y] - sum[x - 1]);

				}
			}

		}
	}
}
