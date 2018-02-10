import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnapeandLadder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, b, ls;
		float min_rs, max_rs;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			b = Integer.parseInt(temp.nextToken());
			ls = Integer.parseInt(temp.nextToken());

			min_rs = (float) Math.sqrt(ls * ls - b * b);
			max_rs = (float) Math.sqrt(ls * ls + b * b);

			System.out.println(min_rs + " " + max_rs);

		}

	}

}
