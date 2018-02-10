import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversingdirections {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		String temp, temp1, output;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			output = "";
			temp1 = "";
			temp = br.readLine();
			for (int j = 1; j < n; j++) {
				temp1 = br.readLine();

				if (temp1.contains("Right")) {
					temp = temp.replace("Right", "Left");
					temp = temp.replace("Begin", "Left");
					output = "\n" + temp + output;
				} else {
					temp = temp.replace("Left", "Right");
					temp = temp.replace("Begin", "Right");
					output = "\n" + temp + output;
				}
				temp = temp1;
			}
			temp1 = temp1.replace("Right", "Begin");
			temp1 = temp1.replace("Left", "Begin");

			output = temp1 + output;
			System.out.println(output);
		}

	}
}
