import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class GameOfRotation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a[];
		long sum;
		BigInteger max, total_sum;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new int[n];

		temp = new StringTokenizer(br.readLine());
		sum = 0;
		total_sum = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
			total_sum = total_sum.add(new BigInteger("" + (i + 1))
					.multiply(new BigInteger("" + a[i])));
			sum += a[i];

		}

		max = total_sum;
		for (int i = 1; i < a.length; i++) {
			total_sum = total_sum.subtract(new BigInteger("" + sum));
			total_sum = total_sum.add(new BigInteger("" + (a[i - 1]))
					.multiply(new BigInteger("" + n)));

			if (max.compareTo(total_sum) < 0)
				max = total_sum;
		}

		System.out.println(max);
	}
}
