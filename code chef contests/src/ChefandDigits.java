import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandDigits {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m, n, t, a[], digits[], ans[];
		StringTokenizer temp;
		String x;
		temp = new StringTokenizer(br.readLine());

		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());

		x = br.readLine();
		a = new int[n];
		digits = new int[10];
		ans = new int[n];

		for (int i = 0; i < x.length(); i++) {
			a[i] = x.charAt(i) - 48;
			digits[a[i]]++;

			for (int j = 0; j < digits.length; j++) {
				if (a[i] > j)
					ans[i] = ans[i] + (a[i] - j) * digits[j];
				else
					ans[i] = ans[i] + (j - a[i]) * digits[j];
			}

		}
		for (int i = 0; i < m; i++) {
			t = Integer.parseInt(br.readLine());
			System.out.println(ans[t - 1]);
		}
	}
}
