import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FireEscapeRoutes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, m, n, x, y, j;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		int[] l;
		int a[], b[], c;

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			a = new int[m];
			b = new int[m];
			c = 0;

			if (m == 0) {
				System.out.println(n);
				continue;
			}

			l = new int[n + 1];
			int d = 1, group = 0, z = 1;
			for (j = 0; j < m; j++) {
				temp = new StringTokenizer(br.readLine());
				x = Integer.parseInt(temp.nextToken());
				y = Integer.parseInt(temp.nextToken());
				if (l[x] == 0 && l[y] == 0) {
					l[x] = d;
					l[y] = d;
					d++;
				} else if (l[x] == 0) {
					l[x] = l[y];
				} else if (l[y] == 0) {
					l[y] = l[x];
				} else {
					if (l[x] < l[y]) {
						a[c] = l[x];
						b[c] = l[y];
						c++;
					} else {
						a[c] = l[y];
						b[c] = l[x];
						c++;
					}
				}
			}

			int[] order = new int[d];

			for (int k = 0; k < order.length; k++) {
				order[k] = k;
			}

			
			insertionSort(a, b);
			for (int k = m-c-1; k < m; k++)
				order[b[k]] = order[a[k]];

			System.out.println(Arrays.toString(order));
			for (int k = 0; k < l.length; k++) {
				l[k] = order[l[k]];
			}

			System.out.println(Arrays.toString(l));

			Arrays.sort(l);

			group = 0;
			for (j = 1; j < l.length; j++) {
				if (l[j] != 0)
					break;
				else
					group++;
			}

			BigInteger b1 = BigInteger.ONE;
			for (int j1 = j + 1; j1 < l.length; j1++) {
				if (l[j1] != l[j1 - 1]) {
					group++;
					b1 = b1.multiply(new BigInteger("" + z));
					z = 1;
				} else {
					z++;
				}
			}
			group++;
			b1 = b1.multiply(new BigInteger("" + z));

			System.out.println(group + " " + b1);
		}
	}

	public static void insertionSort(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			int value = a[i],value1=b[i];
			int j = i - 1;
			while (j >= 0 && a[j] > value) {
				a[j + 1] = a[j];
				b[j+1]=b[j];
				j = j - 1;
			}
			a[j + 1] = value;
			b[j+1]=value1;

		}
	}

}
