import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ReduceTime {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;

		n = Integer.parseInt(br.readLine());

		System.out.println(new BigInteger("2").pow(n));
	}
}
