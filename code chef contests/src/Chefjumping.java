import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chefjumping {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n;
		n = Long.parseLong(br.readLine());
		n = n % 6;

		if (n == 0 || n == 1 || n == 3)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
