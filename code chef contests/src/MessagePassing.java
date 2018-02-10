import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MessagePassing {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		int[] a, b;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			a = new int[n];
			b = new int[n];

			for (int j = 0; j < a.length; j++) {
				temp = new StringTokenizer(br.readLine());
				a[j] = Integer.parseInt(temp.nextToken());
				b[j] = Integer.parseInt(temp.nextToken());
			}
			
			

		}
	}
}
