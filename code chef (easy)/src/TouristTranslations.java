import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TouristTranslations {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		StringTokenizer temp;
		String x;
		StringBuilder y;
		temp = new StringTokenizer(br.readLine());
		test_cases = Integer.parseInt(temp.nextToken());
		x = temp.nextToken();
		int p[] = new int[26];
		for (int i = 0; i < p.length; i++)
			p[i] = x.charAt(i) - 97;

		for (int i = 0; i < test_cases; i++) {
			y = new StringBuilder(br.readLine());
			for (int j = 0; j < y.length(); j++) {
				if ((y.charAt(j) > 64 && y.charAt(j) < 93))
					y.setCharAt(j, (char) (p[y.charAt(j)-65] + 65));
				else if (y.charAt(j) > 96 && y.charAt(j) < 123) {
					y.setCharAt(j, (char) (p[y.charAt(j)-97] + 97));
				} else if (y.charAt(j) == '_')
					y.setCharAt(j, ' ');
			}
			System.out.println(y);
		}
	}
}
