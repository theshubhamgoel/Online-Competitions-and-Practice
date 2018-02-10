import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManyChefs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String temp;
		StringBuilder t;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();

			for (int j = temp.length() - 1; j >= 3; j--) {
				if ((temp.charAt(j) == 'F' || temp.charAt(j) == '?')
						&& (temp.charAt(j - 1) == 'E' || temp.charAt(j - 1) == '?')
						&& (temp.charAt(j - 2) == 'H' || temp.charAt(j - 2) == '?')
						&& (temp.charAt(j - 3) == 'C' || temp.charAt(j - 3) == '?')) {
					t = new StringBuilder(temp);
					t.setCharAt(j, 'F');
					t.setCharAt(j - 1, 'E');
					t.setCharAt(j - 2, 'H');
					t.setCharAt(j - 3, 'C');
					temp = t.toString();
				}
			}

			temp = temp.replaceAll("[?]", "A");
			System.out.println(temp);
		}
	}
}
