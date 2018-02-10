import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MMORPGDoata2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int ms, mt, lt, n, ans = 0;

		ms = sc.nextInt();
		mt = sc.nextInt();
		lt = sc.nextInt();

		n = sc.nextInt();
		int x[] = new int[n];
		int noOfPoint[] = new int[2002];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);

		for (int i = 0; i < noOfPoint.length; i++) {
			noOfPoint[i] = 0;
		}

		for (int i = 0; i < x.length; i++) {
			noOfPoint[x[i]] = 1;
		}

		for (int i = 1; i < noOfPoint.length; i++) {
			noOfPoint[i] += noOfPoint[i - 1];
		}

		// System.out.println(Arrays.toString(noOfPoint));
		int costBySun, costByTornando;
		for (int i = x[0]; i <= x[n - 1]; i = i + lt) {
			costByTornando = mt;
			if (i > 0)
				costBySun = (noOfPoint[i + lt - 1] - noOfPoint[i - 1]) * ms;
			else
				costBySun = noOfPoint[lt - 1] * ms;
			ans += Math.min(costByTornando, costBySun);
		}

		System.out.println(ans);

	}

}
