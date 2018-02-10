import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Thiruttupasanga2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, count;
		int[] id;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			id = new int[1001];

			count = 0;
			for (int j = 0; j < n; j++) {
				id[br.read()]++;
			}

			for (int j = 0; j < id.length; j++) {
				if (id[j] > 1)
					count++;
			}
			
			System.out.println(count);
		}
	}
}
