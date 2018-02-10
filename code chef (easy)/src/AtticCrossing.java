import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtticCrossing {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, no_of_days, current_length, x;
		String p;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			p = br.readLine();
			no_of_days = 0;
			current_length = 0;
			for (int j = 0; j < p.length(); j++) {
				x = 0;
				if (p.charAt(j) == '.') {
					while (j < p.length() && p.charAt(j) == '.') {
						x++;
						j++;
					}
					j--;
					if (current_length < x) {
						no_of_days++;
						current_length = x;
					}
				}
			}
			System.out.println(no_of_days);
		}

	}

}
