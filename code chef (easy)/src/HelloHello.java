import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelloHello {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, best_plan;
		double d, r, curret_value, after_value, n, u, m, c;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			d = Double.parseDouble(temp.nextToken());
			u = Double.parseDouble(temp.nextToken());
			n = Double.parseDouble(temp.nextToken());

			best_plan = 0;
			curret_value = d * u;

			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				m = Double.parseDouble(temp.nextToken());
				r = Double.parseDouble(temp.nextToken());
				c = Double.parseDouble(temp.nextToken());
				after_value = u * r + c / m;
				if (after_value < curret_value) {
					best_plan = j + 1;
					curret_value = after_value;
				}
			}

			System.out.println(best_plan);
		}
	}
}
