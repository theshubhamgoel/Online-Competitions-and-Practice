import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangingtheAppetizers {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, k, a;
		char c[], d[];
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			k = Integer.parseInt(temp[0]);
			c = temp[1].toCharArray();
			d = temp[1].toCharArray();
			StringBuilder x;
			for (int j = 1; j < c.length - 1; j++) {
				x = new StringBuilder(Integer.toBinaryString(j));
				for (int j2 = x.length(); j2 < k; j2++) {
					x.insert(0, "0");
				}
				x.reverse();
				a = Integer.parseInt(x.toString(), 2);
				d[a] = c[j];
			}
			System.out.println(String.valueOf(d));
		}
	}
}
