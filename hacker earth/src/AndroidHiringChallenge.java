import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AndroidHiringChallenge {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n;
		int dic[], given[];
		test_cases = Integer.parseInt(br.readLine());
		String temp, out;

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			dic = new int[26];
			for (int j = 0; j < temp.length(); j++)
				dic[temp.charAt(j) - 97] = j;

			n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				temp = br.readLine();
				given = new int[temp.length()];
				for (int j2 = 0; j2 < temp.length(); j2++) {
					given[j2] = dic[temp.charAt(j2) - 97];
				}
				
				Arrays.sort(given);
				out = "";
				for (int j2 = 0; j2 < given.length; j2++)
					out += (char) (given[j2] + 97);

				System.out.println(out);
			}
		}
	}
}
