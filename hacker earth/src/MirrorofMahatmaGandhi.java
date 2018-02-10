import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorofMahatmaGandhi {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			x = br.readLine();
			StringBuilder s = new StringBuilder(x);
			if (s.reverse().toString().equals(x)) {
				if (x.contains("2") || x.contains("3") || x.contains("4")
						|| x.contains("5") || x.contains("6")
						|| x.contains("7") || x.contains("9"))
					System.out.println("NO");
				else
					System.out.println("YES");
			} else
				System.out.println("NO");
		}
	}
}
