import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		BigInteger b1 = new BigInteger("" + sc.next());
		BigInteger b2 = new BigInteger("" + sc.next());
		System.out.println("Result = " + b1.add(b2));
	}
}
