import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BrokenAmit {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, sum_l = 0, sum_d = 0;
		StringTokenizer temp;
		int[] l, d;
		n = Integer.parseInt(br.readLine());

		l = new int[n];
		d = new int[n];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			l[i] = Integer.parseInt(temp.nextToken());
			sum_l += l[i];
		}

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(temp.nextToken()) * i;
		}

		Arrays.sort(d);

		for (int i = d.length - 2; i >= 0; i--) {
			sum_d += d[i] * (i + 1);
		}

		int result = sum_l * n - sum_d;
		System.out.println(result);

	}
}
