import java.math.BigInteger;
import java.util.Scanner;

public class Smallfactorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = 0;

		test_case = sc.nextInt();
		for (int j = 0; j < test_case; j++) {
			BigInteger answer = new BigInteger("1");
			int n = sc.nextInt();
			while (n > 1) {
				answer = answer.multiply(new BigInteger("" + n));
				n--;
			}
			System.out.println(answer);
		}
	}
}
