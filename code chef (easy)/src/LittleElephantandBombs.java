import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantandBombs {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, safe_buildings;
		char[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = br.readLine().toCharArray();

			safe_buildings = 0;

			for (int j = 1; j < n - 1 && j > 0; j++) {
				if (temp[j] == '1') {
					temp[j - 1] = '2';
					if (temp[j + 1] != '1')
						temp[j + 1] = '2';
				}

			}

			if (temp[0] == '1' && n > 1)
				temp[1] = '2';
			if (temp[n - 1] == '1' && n > 1)
				temp[n - 2] = '2';

			for (int j = 0; j < temp.length; j++) {
				if (temp[j] == '0')
					safe_buildings++;
			}
			System.out.println(safe_buildings);

		}
	}
}
