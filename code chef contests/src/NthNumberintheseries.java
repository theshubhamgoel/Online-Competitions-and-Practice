import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthNumberintheseries {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, m, i = 1, length_needed = 0;
		m = n = Integer.parseInt(br.readLine());

		while (true) {
			int x = (int) Math.pow(2, i);
			if (n - x <= 0) {
				length_needed = i;
				break;
			}
			n = n - x;
			i++;
		}

		for (int j = 1; j < length_needed; j++) {
			m = (int) (m - Math.pow(2, j));
		}

		//System.out.println(length_needed + " " + m);

		String s = Integer.toBinaryString(m - 1), ans = "";

		while (s.length() < length_needed)
			s = "0" + s;

		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == '0')
				ans += "3";
			else
				ans += "4";
		}
		System.out.println(ans);
	}
}
