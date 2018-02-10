import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopBatsmen {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, k, x, freq, n;
		String[] temp;
		int player_score[] = new int[11];

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");

			for (int j = 0; j < player_score.length; j++) {
				player_score[j] = Integer.parseInt(temp[j]);
			}

			k = Integer.parseInt(br.readLine());

			Arrays.sort(player_score);
			x = player_score[11 - k];

			freq = n = 0;
			for (int j = 0; j < player_score.length; j++) {
				if (player_score[j] == x) {
					freq++;
					if (j >= 11 - k)
						n++;
				}
			}

			System.out.println(combination(freq, n));
		}
	}

	private static int combination(int n, int freq) {
		int x = 1, y = 1;
		int t = freq;
		for (int i = 0; i < t; i++) {
			x = x * n;
			y = y * freq;
			n--;
			freq--;
		}
		return x / y;
	}
}
