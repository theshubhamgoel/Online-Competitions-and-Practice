import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Labelmaker {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, j, lenght_of_output;
		BigInteger n, x, y, z;
		String[] temp;
		String l = "";
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			l = temp[0];
			n = new BigInteger(temp[1]);
			
			
			x = new BigInteger("0");
			z = new BigInteger("1");
			lenght_of_output = 0;
			while (x.compareTo(n) < 0) {

				z = z.multiply(new BigInteger("" + l.length()));
				x = x.add(z);
				lenght_of_output++;
			}
			System.out.println(lenght_of_output);
			x=x.subtract(z);
			
			n=n.subtract(x);
			System.out.println(n);
			
			
		}

	}

}
