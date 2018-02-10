import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncleJohny {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, pos, x;
		String temp[];

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = (br.readLine()).split(" ");

			k = Integer.parseInt(br.readLine()) - 1;
			pos = 1;
			for (int j = 0; j < n; j++) {
				x = Integer.parseInt(temp[j]);
				if (x < Integer.parseInt(temp[k]))
					pos++;
			}

			System.out.println(pos);
		}
	}
}
