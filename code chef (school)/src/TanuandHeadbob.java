import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TanuandHeadbob {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		String gg;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			gg = br.readLine();

			int s = 0;
			for (int j = 0; j < n; j++) {
				if (gg.charAt(j) == 'Y') {
					s = 1;
					break;
				} else if (gg.charAt(j) == 'I') {
					s = 2;
					break;
				}
			}

			if (s == 0)
				System.out.println("NOT SURE");
			else if (s == 1)
				System.out.println("NOT INDIAN");
			else
				System.out.println("INDIAN");
		}
	}

}
