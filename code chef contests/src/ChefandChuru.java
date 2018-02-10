import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefandChuru {

	static long[] sum;
	static long[] fun_sum, li, ri;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int no, m, n, x, y, q, type;
		long result;
		long[] arr;
		StringTokenizer temp;
		no = Integer.parseInt(br.readLine());

		temp = new StringTokenizer(br.readLine());
		arr = new long[no];
		sum = new long[no];
		fun_sum = new long[no];
		li = new long[no];
		ri = new long[no];

		arr[0] = Integer.parseInt(temp.nextToken());
		sum[0] = arr[0];
		for (int j = 1; j < arr.length; j++) {
			arr[j] = Integer.parseInt(temp.nextToken());
			sum[j] = arr[j] + sum[j - 1];
		}

		for (int j = 0; j < no; j++) {
			temp = new StringTokenizer(br.readLine());
			li[j] = Integer.parseInt(temp.nextToken()) - 1;
			ri[j] = Integer.parseInt(temp.nextToken()) - 1;
		}

		// Calculating function sum
		cal_fun_sum();

		q = Integer.parseInt(br.readLine());

		for (int j = 0; j < q; j++) {
			temp = new StringTokenizer(br.readLine());
			type = Integer.parseInt(temp.nextToken());
			// System.out.println(Arrays.toString(fun_sum));

			if (type == 1) {
				x = Integer.parseInt(temp.nextToken()) - 1;
				y = Integer.parseInt(temp.nextToken());

				long diff = y - arr[x];
				arr[x] = y;
				for (int j2 = x; j2 < sum.length; j2++) {
					sum[j2] += diff;
				}

				cal_fun_sum();
			} else {

				result = 0;
				m = Integer.parseInt(temp.nextToken()) - 1;
				n = Integer.parseInt(temp.nextToken()) - 1;

				if (m == 0) {
					System.out.println(fun_sum[n]);
				} else {
					result = fun_sum[n] - fun_sum[m - 1];
					System.out.println(result);
				}
			}
		}

	}

	private static void cal_fun_sum() {
		int a, b;

		a = (int) li[0];
		b = (int) ri[0];
		if (a == 0) {
			fun_sum[0] = sum[b];
		} else {
			fun_sum[0] = sum[b] - sum[a - 1];
		}

		for (int j2 = 1; j2 < sum.length; j2++) {
			a = (int) li[j2];
			b = (int) ri[j2];

			if (a == 0) {
				fun_sum[j2] = sum[b] + fun_sum[j2 - 1];
			} else {
				fun_sum[j2] = sum[b] - sum[a - 1] + fun_sum[j2 - 1];
			}

		}

	}

}
