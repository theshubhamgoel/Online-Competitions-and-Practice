import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctCharactersSubsequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		int[] c;
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			s = br.readLine();

			c = new int[26];
			for (int j = 0; j < s.length(); j++) {
				c[s.charAt(j) - 97]++;
			}

			int t = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[j] != 0) {
					t++;
				}
			}

			System.out.println(t);
		}

	}

}
