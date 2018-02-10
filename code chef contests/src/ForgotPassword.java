import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForgotPassword {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		char c[], p[];
		String s, d;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) {
				s = br.readLine();
				d = removezeros(s);
			} else {
				c = new char[n];
				p = new char[n];
				for (int j = 0; j < n; j++) {
					temp = new StringTokenizer(br.readLine());
					c[j] = temp.nextToken().charAt(0);
					p[j] = temp.nextToken().charAt(0);
				}

				d = "";
				s = br.readLine();

				int j2, flag;
				for (int j = 0; j < s.length(); j++) {
					flag = 0;
					for (j2 = 0; j2 < c.length; j2++) {
						if (s.charAt(j) == c[j2]) {
							flag = 1;
							break;
						}
					}
					if (flag == 1)
						d += p[j2];
					else
						d += s.charAt(j);
				}
				d = removezeros(d);
			}
			System.out.println(d);
		}
	}

	private static String removezeros(String s) {
		int i, j, sign = 2;
		String t = "";
		
		if (s.charAt(0) == '-')
			sign = 0;
		if (s.charAt(0) == '+')
			sign = 1;

		if (sign != 2) {
			for (int k = 1; k < s.length(); k++) {
				t += s.charAt(k);
			}
			s = t;
		}
		
		
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0')
				break;
		}

		for (j = s.length() - 1; j >= i; j--) {
			if (s.charAt(j) != '0')
				break;
		}

		for (int k = i; k <= j; k++) {
			t += s.charAt(k);
		}

		if (t.equals("."))
			return "0";

		if (i == s.length())
			return "0";

		if (sign == 0)
			t = "-" + t;

		s = t;
		int l = t.length() - 1;
		t = "";
		if (s.charAt(s.length() - 1) == '.') {
			for (int k = 0; k < l; k++) {
				t += s.charAt(k);
			}
			s = t;
		}
		return s;
	}

}
