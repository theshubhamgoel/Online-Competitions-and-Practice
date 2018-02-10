import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SherlockandTheBeast {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, n, no_of_three, no_of_five;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			no_of_five = n;
			no_of_three = 0;
			int flag = 0;
			while (no_of_five >= 0) {
				if (no_of_five % 3 == 0 && no_of_three % 5 == 0) {
					flag = 1;
					break;
				} else {
					no_of_five -= 5;
					no_of_three += 5;
				}
			}

			if (flag == 0)
				pw.print("-1");
			else {
				for (int j = 0; j+19 < no_of_five; j += 20)
					pw.print("55555555555555555555");

				for (int j = 0; j < no_of_five%20; j++)
					pw.print("5");

				for (int j = 0; j+19 < no_of_three; j += 20)
					pw.print("33333333333333333333");

				for (int j = 0; j < no_of_three%20; j++)
					pw.print("3");

			}
			pw.println();
			pw.flush();
		}
	}
}
