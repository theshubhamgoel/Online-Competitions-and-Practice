import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Approximately {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, k, a, b;
		test_cases = Integer.parseInt(br.readLine());
		PrintWriter pw = new PrintWriter(System.out);

		for (int i = 0; i < test_cases; i++) {
			k = Integer.parseInt(br.readLine());
			a = 4687;
			b = 33102;

			if (k == 0)
				pw.print("3");
			else {
				pw.print("3.");
				for (int j = 0; j < k; j++) {
					a = a * 10;
					if (a < b) {
						pw.print("0");
					} else {
						pw.print(a / b);
						a = a % b;
					}
				}
			}
			pw.println();
			pw.flush();
		}
	}
}
