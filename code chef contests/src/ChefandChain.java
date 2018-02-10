import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandChain {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, c1, c2;
		String temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();

			c1 = c2 = 0;
			for (int j = 0; j < temp.length(); j++) {
				if (j % 2 == 0) {
					if (temp.charAt(j) == '-')
						c1++;
					else
						c2++;
				} else {
					if (temp.charAt(j) == '+')
						c1++;
					else
						c2++;
				}
			}

			System.out.println(Math.min(c1, c2));

		}
	}
}
