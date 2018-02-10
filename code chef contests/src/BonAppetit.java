import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BonAppetit {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, count;
		String[] temp;
		int s[], f[], p[];
		String sorting[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			n = Integer.parseInt(temp[0]);
			k = Integer.parseInt(temp[1]);

			s = new int[n];
			f = new int[n];
			p = new int[n];

			sorting = new String[n];
			for (int j = 0; j < n; j++) {
				temp = br.readLine().split(" ");
				s[j] = Integer.parseInt(temp[0]);
				f[j] = Integer.parseInt(temp[1]);
				p[j] = Integer.parseInt(temp[2]);
				sorting[j] = temp[1] + " " + temp[2] + " " + temp[0];
			}
			Arrays.sort(sorting);

			count = 1;
			int i1 = 0;
			for (int j = 1; j < n; j++) {
				
				if (s[j] >= f[i1]) {
					count++;
					i1 = j;
				}
			}
			System.out.println(count);

		}
	}
}
