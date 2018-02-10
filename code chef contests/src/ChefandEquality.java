import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandEquality {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		int[] arr;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			
			arr = new int[100001];
			temp = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arr[Integer.parseInt(temp.nextToken())]++;
			}

			int max = 0;
			for (int j = 0; j < arr.length; j++) {
				if (max < arr[j])
					max = arr[j];
			}

			System.out.println(n - max);

		}
	}
}
