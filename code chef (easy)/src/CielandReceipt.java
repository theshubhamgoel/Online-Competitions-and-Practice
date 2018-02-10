import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CielandReceipt {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, temp, count, j;
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			count = 0;
			temp = Integer.parseInt(br.readLine());

			while (temp >= 2048) {
				count++;
				temp -= 2048;
			}
			s = Integer.toBinaryString(temp);

			for (j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1')
					count++;
			}

			System.out.println(count);
		}
	}
}
