import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoyandCodeStreak {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, s[], r[], count, n, max, result[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			s = new int[n];
			r = new int[n];
			result = new int[1000001];

			count = 0;
			max = 0;
			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				s[j] = Integer.parseInt(temp.nextToken());
				r[j] = Integer.parseInt(temp.nextToken());

				if (r[j] == 0) {
					if (max < count)
						max = count;
					count = 0;
					continue;
				}

				if (result[s[j]] != 1) {
					result[s[j]] = r[j];
					count++;
				}

			}

			if (max < count)
				max = count;
			System.out.println(max);
		}
	}
}
