import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockandInversions {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, q, l, r, a[],x;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());

		a = new int[n];
		long count;
		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(temp.nextToken());

		temp = new StringTokenizer(br.readLine());
		q = Integer.parseInt(temp.nextToken());

		for (int i = 0; i < q; i++) {
			temp = new StringTokenizer(br.readLine());
			l = Integer.parseInt(temp.nextToken());
			r = Integer.parseInt(temp.nextToken());
			count = 0;
			
			for (int j = l-1; j < r; j++) {
				x = a[j];
				for (int j2 = j + 1; j2 < r; j2++) {
					if (x > a[j2])
						count++;
				}
			}
			System.out.println(count);
		}
	}
}
