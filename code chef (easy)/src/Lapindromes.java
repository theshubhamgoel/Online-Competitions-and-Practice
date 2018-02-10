import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lapindromes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String temp;
		int a[], b[];

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			a = new int[256];
			b = new int[256];

			for (int j = 0; j < temp.length() / 2; j++) {
				a[temp.charAt(j)]++;
			}

			for (int j = (int) Math.ceil(temp.length() / 2.0); j < temp.length(); j++) {
				b[temp.charAt(j)]++;
			}

			if (Arrays.toString(a).equals(Arrays.toString(b)))
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
