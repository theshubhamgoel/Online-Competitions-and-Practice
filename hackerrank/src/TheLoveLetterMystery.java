import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLoveLetterMystery {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, count;
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			s = br.readLine();
			count = 0;

			for (int j = 0; j < s.length() / 2; j++) {
				count += Math.abs(s.charAt(j) - s.charAt(s.length() - 1 - j));
			}
			System.out.println(count);
		}
	}

}
