import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class a2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x1, x2;
		x1 = br.readLine();
		x2 = br.readLine();
		fun(x1, x2);

	}

	public static void fun(String x1, String x2) {

		BigInteger b1 = new BigInteger("" + x1);
		b1=b1.gcd(new BigInteger(""+x2));
		
		System.out.println(b1.toString());

	}
}
