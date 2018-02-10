import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UpsandDowns {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a[], n;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			a = new int[n];
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			Arrays.sort(a);

			int t;
			for (int j = 1; (j+1) < a.length; j += 2) {
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
			
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}

	}

}
