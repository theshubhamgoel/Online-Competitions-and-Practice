import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RacingHorses {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, diff, k, key;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());
		int s[];

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = br.readLine().split(" ");

			s = new int[n];
			for (int j = 0; j < s.length; j++) {
				s[j] = Integer.parseInt(temp[j]);
				key = s[j];
				k = j - 1;
				while (k >= 0 && key < s[k]) {
					s[k + 1] = s[k];
					k--;
				}
				s[k + 1] = key;
			}

			diff = 1000000001;
			for (int j = 1; j < s.length; j++) {
				if (diff > s[j] - s[j - 1]) {
					diff = s[j] - s[j - 1];
				}
			}
			 System.out.println(diff);
		}
	}

}
