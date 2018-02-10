import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpooninMatrix {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, r, c, flag;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		String t[], x;

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			r = Integer.parseInt(temp.nextToken());
			c = Integer.parseInt(temp.nextToken());

			flag = 0;
			t = new String[r];
			for (int j = 0; j < t.length; j++) {
				t[j] = br.readLine().toLowerCase();

				if (t[j].contains("spoon"))
					flag = 1;
			}

			if (flag == 1) {
				System.out.println("There is a spoon!");
				continue;
			} else {
				for (int j = 0; j < c; j++) {
					x = "";
					for (int j2 = 0; j2 < r; j2++)
						x += t[j2].charAt(j);

					if (x.contains("spoon")) {
						flag = 1;
						break;
					}
				}
			}

			if (flag == 1)
				System.out.println("There is a spoon!");
			else
				System.out.println("There is indeed no spoon!");
		}

	}
}
