import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AndrewandtheMeatballs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, j;
		StringTokenizer temp;
		long p[], m, sum;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Long.parseLong(temp.nextToken());

			p = new long[n];
			temp = new StringTokenizer(br.readLine());
			for (j = 0; j < n; j++)
				p[j] = Long.parseLong(temp.nextToken());

			sum = 0;
			Arrays.sort(p);
			for (j = 0; j < p.length; j++) {
				sum += p[p.length - j - 1];
				if (sum >= m)
					break;
			}

			if (sum >= m)
				System.out.println(j + 1);
			else
				System.out.println("-1");

		}
	}
}
