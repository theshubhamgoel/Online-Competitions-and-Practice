import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBestBox {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, p, s;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			p = Integer.parseInt(temp[0]);
			s = Integer.parseInt(temp[1]);
			
		}
	}

}
