import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Twoarrays {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k;
		Integer a[], b[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			a = new Integer[n];
			b = new Integer[n];

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				b[j] = Integer.parseInt(temp.nextToken());
			}

			Arrays.sort(a);
			Arrays.sort(b,Collections.reverseOrder());
		
			int j;
			for (j = 0; j < n; j++) {
				if (a[j] + b[j] < k)
					break;
			}
			
			if(j==n)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
