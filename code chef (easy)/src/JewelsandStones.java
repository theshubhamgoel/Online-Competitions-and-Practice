import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JewelsandStones {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, count;
		String j, s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			j = br.readLine();
			s = br.readLine();

			count = 0;
			for (int k = 0; k < s.length(); k++) {
				if (j.indexOf(s.charAt(k)) >= 0) 
					count++;
			}
			System.out.println(count);
		}
	}

}
