import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class DhoniandPracticeSessions {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		double a, b, c, r;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Double.parseDouble(temp.nextToken());
			b = Double.parseDouble(temp.nextToken());
			c = Double.parseDouble(temp.nextToken());

			r = (a * b * c)
					/ (Math.sqrt((a + b + c) * (b + c - a) * (c + a - b)
							* (a + b - c)));

			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(df.format(r));
		}
	}
}
