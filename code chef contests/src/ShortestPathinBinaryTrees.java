import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShortestPathinBinaryTrees {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a, b, l1, l2, dis;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());

			l1 = (int) (Math.log(a) / Math.log(2));
			l2 = (int) (Math.log(b) / Math.log(2));
			dis = 0;

			if (l1 > l2) {
				while (l1 > l2) {
					a = a / 2;
					l1--;
					dis++;
				}
			} else {
				while (l2 > l1) {
					b = b / 2;
					l2--;
					dis++;
				}
			}

			while (a != b) {
				a = a / 2;
				b = b / 2;
				dis += 2;
			}

			System.out.println(dis);
		}
	}
}
