import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ChefandAppleTrees {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, count;
		StringTokenizer temp;
		int[] apples;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			apples = new int[100001];

			for (int j = 0; j < n; j++) {
				apples[Integer.parseInt(temp.nextToken())]++;
			}

			count = 0;
			for (int j = 0; j < apples.length; j++) {
				if (apples[j] != 0)
					count++;
			}
			System.out.println(count);

		}
	}
}
