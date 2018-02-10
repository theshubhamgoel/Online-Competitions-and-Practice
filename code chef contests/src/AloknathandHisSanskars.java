import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AloknathandHisSanskars {

	static int count = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, count;
		long sum, avg, max;
		long[] a;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			temp = new StringTokenizer(br.readLine());
			sum = 0;
			max = -1;
			a = new long[n];
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
				sum += a[j];
				if (max < a[j])
					max = a[j];
			}

			if (sum % k != 0) {
				System.out.println("no");
				continue;
			}

			avg = sum / k;
			// System.out.println(avg);
			if (avg < max || k > n) {
				System.out.println("no");
				continue;
			}

			int x = (int) Math.pow(2, n) - 1;
			String b;

			count = 0;
			for (int j = 1; j <= x; j++) {
				b = Integer.toBinaryString(j);
				while (b.length() != n)
					b = "0" + b;

				sum = 0;
				// System.out.println(b);
				for (int j2 = 0; j2 < b.length(); j2++) {
					if (b.charAt(j2) == '1')
						sum += a[j2];
				}

				// System.out.println(sum);
				if (sum == avg)
					count++;
			}

			if (count >= k)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}
}
