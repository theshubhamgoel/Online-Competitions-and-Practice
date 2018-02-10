import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FittoPlay {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, max_diff, t;
		int[] no;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			max_diff = 0;

			no = new int[n];
			t = Integer.parseInt(temp.nextToken());
			for (int j = 1; j < n; j++) {
				no[j] = Integer.parseInt(temp.nextToken());
				if (max_diff < no[j] - t)
					max_diff = no[j] - t;

			}
			
			if (max_diff > 0)
				System.out.println(max_diff);
			else
				System.out.println("UNFIT");
		}
	}

}
