import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringsAwesomeness {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int q = 0, l, r;
		int[] o, t, res;
		StringTokenizer temp;
		String s, orignal_string, temp_string;
		s = br.readLine();
		s = s.toLowerCase();
		orignal_string = "hackerearth";
		o = new int[26];
		t = new int[26];

		res = new int[s.length()];
		check_pattern(o, orignal_string);

		// calculating.......
		for (int i = 10; i < s.length(); i++) {
			temp_string = s.substring(i - 10, i + 1);
			Arrays.fill(t, 0);
			check_pattern(t, temp_string);
			if (check_for_array_equalness(o, t)) {
				res[i] += res[i - 1] + 1;
			} else
				res[i] = res[i - 1];
		}

		// System.out.println(Arrays.toString(res));

		q = Integer.parseInt(br.readLine());

		for (int i = 0; i < q; i++) {
			temp = new StringTokenizer(br.readLine());
			l = Integer.parseInt(temp.nextToken()) - 1;
			r = Integer.parseInt(temp.nextToken()) - 1;

			if (r + 10 >= s.length())
				System.out.println(res[r]);
			else
				System.out.println(res[r] - res[l + 10]);
		}
	}

	private static boolean check_for_array_equalness(int[] o, int[] t) {
		for (int i = 0; i < t.length; i++) {
			if (o[i] != t[i])
				return false;
		}
		return true;
	}

	private static void check_pattern(int[] a, String s) {
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 97]++;
		}
	}

}
