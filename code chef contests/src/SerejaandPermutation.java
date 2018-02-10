import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SerejaandPermutation {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, s, a[], p[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());
			s = Integer.parseInt(temp.nextToken());

			a = new int[n];
			p = new int[n];

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			for (int j = 0; j < p.length; j++) {
				p[j] = j + 1;
			}

			insertionSort(a, p);

			for (int j = 0; j < p.length - 1; j++) {
				System.out.print(p[j] + " ");
			}
			System.out.println(p[n - 1]);
		}
	}

	public static void insertionSort(int array[], int p[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j], k1 = p[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				p[i + 1] = p[i];
				i--;
			}
			array[i + 1] = key;
			p[i + 1] = k1;
		}
	}
}
