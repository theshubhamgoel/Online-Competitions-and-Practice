import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		n = Integer.parseInt(br.readLine());

		BigInteger b = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			b=b.multiply(new BigInteger("" + i));
		}
		
		System.out.println(b);
	}
}
