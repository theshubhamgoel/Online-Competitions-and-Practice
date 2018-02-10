import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TheWarIsON {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, m, arr[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());
			arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(br.readLine()); 
			}

			Arrays.sort(arr);

			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j] - arr[j - 1];
			}

			arr[n - 1] = 1000000001;
			Arrays.sort(arr);

			if (m != 0)
				System.out.println(arr[n - m]);
			else
				System.out.println(arr[n - 1]);

		}
	}
}
