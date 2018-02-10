import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PrimeGenerator {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int m, n, test_cases;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			m = Integer.parseInt(temp.nextToken());
			n = Integer.parseInt(temp.nextToken());

			for (int j = m; j <= n; j++) {
				if (isPrime(j))
					pw.println(j);
			}
			pw.println();
		}
		pw.flush();
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		int m = (int) Math.sqrt(n);

		for (int i = 3; i <= m; i += 2)
			if (n % i == 0)
				return false;

		return true;
	}
}