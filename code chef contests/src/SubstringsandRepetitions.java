import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringsandRepetitions {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		String out;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			out = "";
			n = Integer.parseInt(br.readLine());

			if (360 % n == 0)
				out += "y ";
			else
				out += "n ";

			if (n > 360)
				out += "n ";
			else
				out += "y ";

			if (n > 26)
				out += "n";
			else
				out += "y";
			
			System.out.println(out);

		}

	}
}
