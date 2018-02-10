import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class items implements Comparable<items> {
	int a, b;
	double c;

	items(int A, int B, double C) {
		a = A;
		b = B;
		c = C;
	}

	public int compareTo(items o) {
		// TODO Auto-generated method stub
		return this.c > o.c ? 1 : (this.c < o.c ? -1 : 0);
	}

}

public class MaximiseValue {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, n;
		int[] a, b;
		double[] c;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		x = Integer.parseInt(temp.nextToken());
		n = Integer.parseInt(temp.nextToken());
		a = new int[n];
		b = new int[n];

		c = new double[n];
		items product[] = new items[n];
		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(temp.nextToken());
			b[i] = Integer.parseInt(temp.nextToken());
			c[i] = 1.0 * b[i] / a[i];
			product[i] = new items(a[i], b[i], c[i]);
		}

		// Arrays.sort(product);

		for (int i = 0; i < product.length; i++) {
			// System.out.println(product[i].a + " " + product[i].b + " "+
			// product[i].c);
		}

		System.out.println(knapSack(x, a, b, n));

	}

	static int knapSack(int W, int wt[], int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]],
							K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][W];
	}
}
