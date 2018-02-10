import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissingNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[], b[], n, m;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new int[20001];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(temp.nextToken()) + 10000]++;
		}

		m = Integer.parseInt(br.readLine());
		b = new int[20001];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			b[Integer.parseInt(temp.nextToken()) + 10000]++;
		}

		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i])
				System.out.print((i - 10000) + " ");
		}
	}

}
