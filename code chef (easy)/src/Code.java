import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, answer, k;
		String temp[], operator;
		test_cases = Integer.parseInt(br.readLine());
		int a[];

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			n = Integer.parseInt(temp[0]);
			k = Integer.parseInt(temp[1]);
			answer = Integer.parseInt(temp[2]);

			a = new int[n];
			temp = br.readLine().split(" ");
			for (int j = 0; j < a.length; j++)
				a[j] = Integer.parseInt(temp[j]);

			operator = br.readLine();

			if (operator.contains("AND"))
				for (int j2 = 0; j2 < a.length; j2++)
					answer = answer & a[j2];
			else if (operator.contains("OR"))
				for (int j2 = 0; j2 < a.length; j2++)
					answer = answer | a[j2];

			System.out.println(answer);
		}
	}
}
