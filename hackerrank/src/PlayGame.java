import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			a = new int[n];

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			System.out.println(mymove(a, 0));

		}

	}

	private static int mymove(int[] a, int i) {

		if (i >= a.length)
			return 0;

		int d1, d2, d3, x = 0;

		d1 = d2 = d3 = 0;

		d1 = mymove(a, i + 1) + a[i];

		if (i + 1 < a.length)
			d2 = mymove(a, i + 2) + a[i] + a[i + 1];

		if (i + 2 < a.length)
			d3 = mymove(a, i + 3) + a[i] + a[i + 1] + a[i + 2];

		d1 = Math.max(d1, d2);
		
		
		x = Math.max(d1, d3);

		// System.out.println(d1+" "+d2+" "+d3);

		return x;
	}

	private static int opmove(int[] a, int i, int j) {

		if (i >= a.length)
			return 0;

		int d1, d2, d3, x = 0;

		d1 = d2 = d3 = 0;

		if (j == 0) {
			d1 = opmove(a, i + 1, (j + 1) % 2) + a[i];

			if (i + 1 < a.length)
				d2 = opmove(a, i + 2, (j + 1) % 2) + a[i] + a[i + 1];

			if (i + 2 < a.length)
				d3 = opmove(a, i + 3, (j + 1) % 2) + a[i] + a[i + 1] + a[i + 2];

			d1 = Math.max(d1, d2);
			x = Math.max(d1, d3);

			// System.out.println(d1+" "+d2+" "+d3);
		} else {

			d1 = opmove(a, i + 1, (j + 1) % 2) + a[i];

			if (i + 1 < a.length)
				d2 = opmove(a, i + 2, (j + 1) % 2) + a[i] + a[i + 1];

			if (i + 2 < a.length)
				d3 = opmove(a, i + 3, (j + 1) % 2) + a[i] + a[i + 1] + a[i + 2];

			d1 = Math.max(d1, d2);
			d1 = Math.max(d1, d3);

		}
		return x;
	}

}
