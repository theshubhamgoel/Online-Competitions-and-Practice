import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ConsecutiveSubsequences {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, a[], sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());
			a = new int[n];
			sum = 0;
			long count, c;
			count = 0;

			int s[] = new int[n];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
				sum += a[j];
				s[j] = sum % k;
				if (s[j] == 0)
					count++;
			}

			if (n == 1) {
				if (a[0] % k == 0)
					System.out.println("1");
				else
					System.out.println("0");
				continue;
			}

			Arrays.sort(s);
			c = 1;
			for (int j = 1; j < s.length; j++) {
				if (s[j] == s[j - 1])
					c++;
				else {
					count += (c * (c - 1)) / 2;
					c = 1;
				}
			}

			if (c != 1)
				count += (c * (c - 1)) / 2;

			System.out.println(count);
		}

	}
}
