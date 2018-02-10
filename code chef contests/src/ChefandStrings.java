import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefandStrings {

	static long[][] final_arr;
	static String s;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		s = br.readLine();
		int q, l, r;
		char a, b;

		int[] c, h, e, f;
		c = new int[s.length()];
		h = new int[s.length()];
		e = new int[s.length()];
		f = new int[s.length()];

		if (s.charAt(0) == 'c')
			c[0]++;
		else if (s.charAt(0) == 'h')
			h[0]++;
		else if (s.charAt(0) == 'e')
			e[0]++;
		else
			f[0]++;

		for (int i = 1; i < f.length; i++) {
			if (s.charAt(i) == 'c')
				c[i]++;
			else if (s.charAt(i) == 'h')
				h[i]++;
			else if (s.charAt(i) == 'e')
				e[i]++;
			else
				f[i]++;

			c[i] += c[i - 1];
			h[i] += h[i - 1];
			e[i] += e[i - 1];
			f[i] += f[i - 1];
		}

		// System.out.println(Arrays.toString(f));

		final_arr = new long[12][s.length()];

		solve(c, 'h', 0);
		solve(c, 'e', 1);
		solve(c, 'f', 2);
		solve(h, 'c', 3);
		solve(h, 'e', 4);
		solve(h, 'f', 5);
		solve(e, 'c', 6);
		solve(e, 'h', 7);
		solve(e, 'f', 8);
		solve(f, 'c', 9);
		solve(f, 'h', 10);
		solve(f, 'e', 11);

		// System.out.println(Arrays.toString(final_arr[2]));

		StringTokenizer temp;
		q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			temp = new StringTokenizer(br.readLine());
			a = temp.nextToken().charAt(0);
			b = temp.nextToken().charAt(0);
			l = Integer.parseInt(temp.nextToken()) - 1;
			r = Integer.parseInt(temp.nextToken()) - 1;

			int index = getindex(a, b);
			long count,ans;

			ans = final_arr[index][r];
			if (l > 0) {

				if (b == 'c')
					count = c[r] - c[l - 1];
				else if (b == 'h')
					count = h[r] - h[l - 1];
				else if (b == 'e')
					count = e[r] - e[l - 1];
				else
					count = f[r] - f[l - 1];

				if (a == 'c')
					count *= c[l - 1];
				else if (a == 'h')
					count *= h[l - 1];
				else if (a == 'e')
					count *= e[l - 1];
				else
					count *= f[l - 1];

				ans = ans - final_arr[index][l - 1] - count;
			}
			pw.println(ans);
		}
		pw.flush();
	}

	private static int getindex(char a, char b) {

		if (a == 'c' && b == 'h')
			return 0;
		else if (a == 'c' && b == 'e')
			return 1;
		else if (a == 'c' && b == 'f')
			return 2;
		else if (a == 'h' && b == 'c')
			return 3;
		else if (a == 'h' && b == 'e')
			return 4;
		else if (a == 'h' && b == 'f')
			return 5;
		else if (a == 'e' && b == 'c')
			return 6;
		else if (a == 'e' && b == 'h')
			return 7;
		else if (a == 'e' && b == 'f')
			return 8;
		else if (a == 'f' && b == 'c')
			return 9;
		else if (a == 'f' && b == 'h')
			return 10;
		else if (a == 'f' && b == 'e')
			return 11;

		return 0;
	}

	private static void solve(int[] arr, char d, int index) {
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == d) {
				final_arr[index][i] = final_arr[index][i - 1] + arr[i];
			} else
				final_arr[index][i] = final_arr[index][i - 1];
		}
	}
}
