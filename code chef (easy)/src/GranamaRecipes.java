import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GranamaRecipes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases;
		StringTokenizer temp;
		int with_frequence1[], without_frequency1[], with_frequence2[], without_frequency2[];
		test_cases = Integer.parseInt(br.readLine());
		String t;

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			with_frequence1 = new int[26];
			without_frequency1 = new int[26];
			with_frequence2 = new int[26];
			without_frequency2 = new int[26];

			t = temp.nextToken();
			for (int j = 0; j < t.length(); j++) {
				with_frequence1[t.charAt(j) - 97]++;
				without_frequency1[t.charAt(j) - 97] = 1;
			}

			t = temp.nextToken();
			for (int j = 0; j < t.length(); j++) {
				with_frequence2[t.charAt(j) - 97]++;
				without_frequency2[t.charAt(j) - 97] = 1;
			}

			if (Arrays.toString(without_frequency1).equals(
					Arrays.toString(without_frequency2))) {
				if (Arrays.toString(with_frequence1).equals(
						Arrays.toString(with_frequence2)))
					System.out.println("YES");
				else
					System.out.println("NO");
			} else
				System.out.println("YES");

		}
	}
}
