import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ChefandPrimeDivisors {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0;
		long a, b, c;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		BigInteger A, B, C;

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Long.parseLong(temp.nextToken());
			b = Long.parseLong(temp.nextToken());

			if (b == 1) {
				pw.println("Yes");
				continue;
			} else if (a == 1 && b != 1) {
				pw.println("No");
				continue;
			}

			int flag = 0;
			A = new BigInteger("" + a);
			B = new BigInteger("" + b);
			C = A;

			for (int j = 0; j < 65; j++) {
				if (C.mod(B) == BigInteger.ZERO) {
					flag = 1;
					break;
				}

				C = C.multiply(A);

			}

			if (flag == 1)
				pw.println("Yes");
			else
				pw.println("No");

		}
		pw.flush();
	}
}
