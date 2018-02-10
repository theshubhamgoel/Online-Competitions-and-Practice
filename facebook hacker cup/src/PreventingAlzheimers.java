import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PreventingAlzheimers {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k;
		String[] temp;
		int[] age;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");

			n = Integer.parseInt(temp[0]);
			k = Integer.parseInt(temp[1]);

			temp = br.readLine().split(" ");

			age = new int[n];
			for (int j = 0; j < age.length; j++) {
				age[j] = Integer.parseInt(temp[j]);
			}

			System.out.println(max_gcd(age));

		}
	}

	public static int gcd(int[] arr) {
		int g = arr[0];
		for (int i = 1; i < arr.length; i++) {
			g = gcd(g, arr[i]);
		}
		return g;
	}

	public static int max_gcd(int[] arr) {
		int g = arr[0];
		for (int i = 1; i < arr.length; i++) {
			g = Math.max(g, gcd(g, arr[i]));
		}
		return g;
	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b; // base case
		return gcd(b, a % b);
	}

}
