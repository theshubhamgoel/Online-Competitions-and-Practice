import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChhotaBheemandtheGameofAnagrams {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = n - Integer.parseInt(temp.nextToken());
			System.out.println(fact(n, k));
		}
	}

	static int fact(int n, int k) {
		int d = 1;
		for (int i = k + 1; i <= n; i++) {
			d = (int) ((1L * d * i) % 1000000007);
		}

		return d;
	}
}
