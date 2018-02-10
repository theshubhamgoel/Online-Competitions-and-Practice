import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandFeedback {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			if (temp.contains("010") || temp.contains("101"))
				System.out.println("Good");
			else
				System.out.println("Bad");
		}
	}
}
