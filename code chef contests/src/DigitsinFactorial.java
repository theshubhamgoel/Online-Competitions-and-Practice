import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DigitsinFactorial {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		int[] digits;
		double[] sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		digits = new int[25001];
		sum = new double[25001];
		digits[0] = digits[1] = 1;
		for (int i = 2; i < digits.length; i++) {
			sum[i]+=sum[i-1]+Math.log10(i);
			digits[i]=(int) Math.ceil(sum[i]);
		}
		

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				System.out.print(digits[Integer.parseInt(temp.nextToken())]
						+ " ");
			}
			System.out.println();
		}
	}
}
