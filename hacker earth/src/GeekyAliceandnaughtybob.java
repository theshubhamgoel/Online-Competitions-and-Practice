import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GeekyAliceandnaughtybob {
	public static int findsum(String b) {
		int s = 0, i;

		for (int j = 0; j < b.length(); j++) {
			s += b.charAt(j) - 48;
		}

		if (s >= 10) {
			s = findsum(String.valueOf(s));
		}
		return s;
	}

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a, b, t, sum = 0;
		BigInteger fact;
		int[] sumofdigit;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		sumofdigit = new int[10001];
		sumofdigit[0] = 0;
		sumofdigit[1] = 1;
		fact = BigInteger.ONE;
		for (int i = 2; i < sumofdigit.length; i++) {
			fact = fact.multiply(new BigInteger("" + i));
			sumofdigit[i] += sumofdigit[i - 1] + findsum(fact.toString());
		}

		// System.out.println(Arrays.toString(sumofdigit));
		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());

			System.out.println(sumofdigit[b] - sumofdigit[a - 1]);
		}

	}
}