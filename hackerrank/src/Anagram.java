import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, count;
		String s;
		int[] a, b;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			s = br.readLine();

			if (s.length() % 2 != 0)
				System.out.println("-1");
			else {
				count = 0;
				a = new int[26];
				b = new int[26];

				for (int j = 0; j < s.length() / 2; j++) {
					a[s.charAt(j) - 97]++;
				}

				for (int j = s.length() / 2; j < s.length(); j++) {
					b[s.charAt(j) - 97]++;
				}

				for (int j = 0; j < a.length; j++) {
					if (b[j] != 0 && a[j] < b[j]) {
						count += b[j] - a[j];
					}
				}
				System.out.println(count);
			}
		}
	}
}
