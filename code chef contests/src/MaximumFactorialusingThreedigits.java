import java.io.IOException;
import java.math.BigInteger;

public class MaximumFactorialusingThreedigits {

	public static void main(String[] args) throws IOException {

		BigInteger b1 = new BigInteger("1");
		
		for (int i = 2; i < 1000; i++) {
			b1 = b1.multiply(new BigInteger("" + i));
		}
		
		System.out.println(b1.toString().length());
		System.out.println(b1);
	}
}
