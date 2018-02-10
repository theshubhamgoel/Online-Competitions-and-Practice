import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CAOStage1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, r, w, count;
		String map[], temp[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			r = Integer.parseInt(temp[0]);
			w = Integer.parseInt(temp[1]);

			count = 0;
			map = new String[r];
			for (int j = 0; j < r; j++)
				map[j] = br.readLine();

			for (int j = 2; j < map.length - 2; j++) {
				for (int j2 = 2; j2 < map[j].length() - 2; j2++) {
					try {
						if (map[j].charAt(j2) == '^')
							if (map[j].charAt(j2 + 1) == '^'
									&& map[j].charAt(j2 + 2) == '^'
									&& map[j].charAt(j2 - 1) == '^'
									&& map[j].charAt(j2 - 2) == '^') {
								if (map[j - 2].charAt(j2) == '^'
										&& map[j - 1].charAt(j2) == '^'
										&& map[j + 1].charAt(j2) == '^'
										&& map[j + 2].charAt(j2) == '^') {
									count++;
								}
							}
					} catch (Exception e) {
						// do nothing
					}
				}
			}

			System.out.println(count);
		}
	}
}
