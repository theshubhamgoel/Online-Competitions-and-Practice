import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XORwithSubset {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, max, length;
		int[] a;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			a = new int[n];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}
		
			
			
		}
	}

	
}
