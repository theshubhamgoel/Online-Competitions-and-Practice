import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CorrectnessofKnightMove {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0;
		String temp;
		String source, destination;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			if (temp.length() != 5 || temp.charAt(2) != '-') {
				pw.println("Error");
				continue;
			}

			source = "" + temp.charAt(0) + temp.charAt(1);
			destination = "" + temp.charAt(3) + temp.charAt(4);

			if (!check_string(source) || !check_string(destination)) {
				pw.println("Error");
				continue;
			}

			int n1, n2;
			n1 = Math.abs(source.charAt(0) - destination.charAt(0));
			n2 = Math.abs(source.charAt(1) - destination.charAt(1));

			if ((n1 == 1 && n2 == 2) || (n1 == 2 && n2 == 1))
				pw.println("Yes");
			else
				pw.println("No");
		}
		pw.flush();
	}

	private static boolean check_string(String x) {
		if (x.charAt(0) > 104 || x.charAt(0) < 97 || x.charAt(1) > 56
				|| x.charAt(1) < 49) {
			return false;
		}
		return true;
	}
}
