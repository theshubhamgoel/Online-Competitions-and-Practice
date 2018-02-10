import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Risingpopulation {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		int[] a1, a2;
		String a, b;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = temp.nextToken();
			b = temp.nextToken();

			a1 = new int[26];
			a2 = new int[26];

			for (int j = 0; j < a.length(); j++) {
				a1[a.charAt(j) - 97]++;
			}
			
			for (int j = 0; j < b.length(); j++) {
				a2[b.charAt(j) - 97]++;
			}

			if(Arrays.toString(a1).equals(Arrays.toString(a2)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
