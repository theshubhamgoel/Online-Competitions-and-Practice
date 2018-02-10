import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KaliandDevtas {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		int[] x, y, res;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			x = new int[n];
			y = new int[n];
			res = new int[n];

			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				x[j] = Integer.parseInt(temp.nextToken());
				y[j] = Integer.parseInt(temp.nextToken());
				res[j] = j + 1;
			}

			insertionSort(x, y, res);
			int c1 = 1, c2 = 0, i1 = 0, i2 = -1;
			for (int j = 0; j < n - 1; j++) {
				if (c1 % 2 == 0)
					i1++;
				if (c2 % 2 == 0)
					i2++;

				System.out.println(res[i1] + " " + res[n - 1 - i2]);
				c1++;
				c2++;
			}

		}
	}

	public static void insertionSort(int x[], int y[], int z[]) {
		int n = x.length;
		for (int j = 1; j < n; j++) {
			int key = x[j];
			int key1 = y[j];
			int key2 = z[j];
			int i = j - 1;
			while ((i > -1) && (x[i] > key)) {
				x[i + 1] = x[i];
				y[i + 1] = y[i];
				z[i + 1] = z[i];
				i--;
			}

			if ((i > -1) && (x[i] == key)) {
				while ((i > -1) && (y[i] > key1)) {
					x[i + 1] = x[i];
					y[i + 1] = y[i];
					z[i + 1] = z[i];
					i--;
				}
			}

			x[i + 1] = key;
			y[i + 1] = key1;
			z[i + 1] = key2;

		}
	}
}
