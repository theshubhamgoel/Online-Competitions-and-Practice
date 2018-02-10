import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeCrazyMinions {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, no_of_instructions, buffer_value;
		String temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			no_of_instructions = 2;
			buffer_value = temp.charAt(0);
			for (int j = 1; j < temp.length(); j++) {
				if (buffer_value > temp.charAt(j)) {
					no_of_instructions += 'z' - buffer_value;
					no_of_instructions += temp.charAt(j) - 'a' + 2;
					buffer_value = temp.charAt(j);

				} else {
					no_of_instructions += temp.charAt(j) - buffer_value + 1;
					buffer_value = temp.charAt(j);
				}
			}
			//System.out.println(no_of_instructions + " " + temp.length());
			if (no_of_instructions > temp.length() * 11)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
