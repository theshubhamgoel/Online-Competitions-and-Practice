import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantandDivisors {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, num1, num2, flag;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			
			temp = br.readLine().split(" ");
			flag = 1;
			num1 = Integer.parseInt(temp[0]);

			for (int j = 1; j < n; j++) {
				num2 = Integer.parseInt(temp[j]);
				num1 = gcd(num1, num2);
				if (num1 == 1) {
					flag = 0;
					break;
				}
			}

			for (int j = 2; j <= num1 / 2; j++) {
				if (num1 % j == 0) {
					num1 = j;
					break;
				}
			}

			if (flag == 1)
				System.out.println(num1);
			else
				System.out.println("-1");
		}

	}

	private static int gcd(int num1, int num2) {
		if (num2 == 0)
			return num1;
		else if (num2 > num1)
			return gcd(num2, num1);
		else
			return gcd(num1 % num2, num2);
	}

}
