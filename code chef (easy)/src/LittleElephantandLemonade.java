import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LittleElephantandLemonade {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, x, volume;
		int bottel[][];
		StringTokenizer temp, temp1;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			temp = new StringTokenizer(br.readLine());
			bottel = new int[n][];

			for (int j = 0; j < n; j++) {
				temp1 = new StringTokenizer(br.readLine());
				x = Integer.parseInt(temp1.nextToken());
				bottel[j] = new int[x];
				for (int j2 = 0; j2 < x; j2++) {
					bottel[j][j2] = Integer.parseInt(temp1.nextToken());
				}
				Arrays.sort(bottel[j]);
			}

			volume = 0;
			for (int j = 0; j < m; j++) {
				x = Integer.parseInt(temp.nextToken());
				for (int j2 = bottel[x].length - 1; j2 >= 0; j2--) {
					if (bottel[x][j2] != 0) {
						volume += bottel[x][j2];
						bottel[x][j2] = 0;
						break;
					}
				}
			}
			
			System.out.println(volume);

		}
	}
}
