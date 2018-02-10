import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockandtheCiphers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, a[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		char c[], d;

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			c = temp.nextToken().toCharArray();

			temp = new StringTokenizer(br.readLine());
			a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			for (int j = 0; j < c.length; j++) {
				d = c[a[j] - 1];
				c[a[j] - 1] = c[j];
				c[j] = d;
			}
			
			System.out.println(String.valueOf(c));
			
		}

	}

}
