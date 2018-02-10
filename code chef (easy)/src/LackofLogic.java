import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LackofLogic {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases, flag, j;
		String temp;
		test_cases = Integer.parseInt(br.readLine());
		int word[];

		while (test_cases-- > 0) {
			temp = br.readLine().toLowerCase();
			word = new int[255];

			for (j = 0; j < temp.length(); j++)
				word[temp.charAt(j)]++;

			flag = 0;
			for (j = 97; j <= 122; j++) {
				if (word[j] == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				pw.println((char) j);
			else
				pw.println("~");
		}
		pw.flush();
	}
}
