import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsFibo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long test_cases = 0, n, fib1, fib2, t;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Long.parseLong(br.readLine());
			fib1 = 0;
			fib2 = 1;
			if (n == fib1 || n == fib2)
				System.out.println("IsFibo");
			else {
				int flag = 0;
				while (n > fib2) {
					t = fib1 + fib2;
					fib1 = fib2;
					fib2 = t;
					if (t == n) {
						flag = 1;
						break;
					}
				}
				if (flag == 1)
					System.out.println("IsFibo");
				else
					System.out.println("IsNotFibo");

			}
		}

	}
}
