import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockandthePerfectArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, k, count, zero, min_index, max_index;
		long a[], max, min;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			a = new long[n];
			max = 0;
			zero = 0;
			min = 1000000001;
			min_index = 0;
			max_index = 0;

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Long.parseLong(temp.nextToken());
				if (max < a[j]) {
					max = a[j];
					max_index = j;
				}
				if (a[j] == 0)
					zero = 1;
				if (min > a[j]) {
					min = a[j];
					min_index = j;
				}
			}

			if (zero == 1) {
				System.out.println("-1");
				continue;
			}

			if (min > k) {
				System.out.println("0");
				continue;
			}

			if (max == 1) {
				if (k > 1)
					System.out.println("-1");
				else if (k == 1) {
					System.out.println("-1");
				} else if (k == 0) {
					if (min == 0)
						System.out.println("-1");
					else
						System.out.println("0");
				}
				continue;
			}

			if (k == 0) {
				System.out.println("0");
				continue;
			}

			count = 0;

			if (max_index == 0) {
				for (int j = 1; j < a.length; j++) {
					if (j == min_index)
						continue;
					while (a[j] <= k) {
						a[j] *= max;
						max = max > a[j] ? max : a[j];
						count++;
					}
				}
				while (a[max_index] <= k) {
					a[max_index] *= max;
					max = max > a[max_index] ? max : a[max_index];
					count++;
				}

			} else
				for (int j = 0; j < a.length; j++) {
					if (j == min_index)
						continue;
					while (a[j] <= k) {
						a[j] *= max;
						max = max > a[j] ? max : a[j];
						count++;
					}
				}

			System.out.println(count);
		}

	}
}
