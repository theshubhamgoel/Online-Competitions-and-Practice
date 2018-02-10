import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepresentativeSelection {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		String a[];
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			a = new String[n];
			for (int j = 0; j < a.length; j++) {
				a[j] = br.readLine();
			}

			s = br.readLine();

			int flag = 0;
			for (int j = 0; j < a.length; j++) {
				if (s.equals(a[j])) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
