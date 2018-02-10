import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Towers {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, current_max;
		int[] tower;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			tower = new int[n];
			for (int j = 0; j < tower.length; j++) {
				tower[j] = Integer.parseInt(temp.nextToken());
			}

			int count = 0;
			for (int j = 0; j < tower.length; j++) {
				count = 0;
				current_max = 0;
				for (int j2 = j + 1; j2 < tower.length; j2++) {
					if (current_max < tower[j2]) {
						current_max = tower[j2];
						count++;
					} else if (tower[j] > current_max) {
						count++;
					}

				}
				System.out.print(count + " ");
			}

			System.out.println();

		}
	}
}
