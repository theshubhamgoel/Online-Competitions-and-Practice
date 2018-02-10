import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SquareDigitSquares {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_cases;
		long a, b, count, n1, n2;
		StringTokenizer temp;
		String num;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Long.parseLong(temp.nextToken());
			b = Long.parseLong(temp.nextToken());

			count = 0;

			n1 = (long) Math.sqrt(a);
			if (n1 * n1 < a)
				n1++;

			n2 = (long) Math.sqrt(b);
			if (n2 * n2 < b)
				n2++;

			for (long j = n1; j <= n2; j++) {
				num = String.valueOf(j * j);
				if (num.contains("2") || num.contains("3") || num.contains("5")
						|| num.contains("6") || num.contains("7")
						|| num.contains("8")) {
					// do nothing
				} else
					count++;
			}

			System.out.println(count);
			
		}
	}
}
