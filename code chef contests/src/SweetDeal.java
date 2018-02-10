import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SweetDeal {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, x;
		int[] cost;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			x = Integer.parseInt(temp.nextToken());

			cost = new int[n];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < cost.length; j++) {
				cost[j] = Integer.parseInt(temp.nextToken()) - x;
			}

		}
	}
}
