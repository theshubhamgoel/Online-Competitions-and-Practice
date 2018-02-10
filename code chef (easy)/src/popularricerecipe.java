import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class popularricerecipe {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, count = 0;
		String[] userid, vote, temp;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			userid = new String[n];
			vote = new String[n];
			count = 0;
			for (int j = 0; j < n; j++) {
				temp = br.readLine().split(" ");

				for (int j2 = 0; j2 < j; j2++) {
					if (userid[j2].equals(temp[0])) {

						if (vote[j2].equals("+"))
							count--;
						else if (vote[j2].equals("-"))
							count++;
						vote[j2] = "0";
					}
				}
				userid[j] = temp[0];
				vote[j] = temp[1];
				if (vote[j].equals("+"))
					count++;
				else if (vote[j].equals("-"))
					count--;
			}

			System.out.println(count);
		}
	}

}
