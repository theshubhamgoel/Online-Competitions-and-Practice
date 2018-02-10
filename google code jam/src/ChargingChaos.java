import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChargingChaos {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, n, l, flag, min;
		StringBuilder f[], t[];
		String in[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			flag = 0;
			min = 2000;
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			l = Integer.parseInt(temp.nextToken());

			in = new String[n];
			f = new StringBuilder[n];
			t = new StringBuilder[n];

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				in[j] = temp.nextToken();
			}

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				f[j] = new StringBuilder(temp.nextToken());
			}

			array_sort(f);

			long x =  (long) Math.pow(2, l);
			String a;

			for (long j = 0; j < x; j++) {
				a = Long.toBinaryString(j);

				for (long j2 = 0; j2 < l - a.length(); j2++) {
					a = "0" + a;
				}

				for (int j2 = 0; j2 < n; j2++) {
					t[j2] = new StringBuilder(in[j2]);
				}
				
				for (int j2 = 0; j2 < a.length(); j2++) {
					if (a.charAt(j2) == '1') {
						for (int k = 0; k < n; k++) {
							if (t[k].charAt(j2) == '0')
								t[k].setCharAt(j2, '1');
							else
								t[k].setCharAt(j2, '0');
						}
					}
				}
				
				
				array_sort(t);
				int count = 0;
				if (Arrays.toString(t).equals(Arrays.toString(f))) {
					for (int j2 = 0; j2 < a.length(); j2++) {
						if (a.charAt(j2) == '1')
							count++;
					}
					if (min > count)
						min = count;

					flag = 1;
				}
			}
			if (flag == 0)
				pw.println("Case #" + (i + 1) + ": NOT POSSIBLE");
			else
				pw.println("Case #" + (i + 1) + ": " + min);
		}

		pw.flush();
	}

	private static void array_sort(StringBuilder[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			String key = array[j].toString();
			int i = j - 1;
			while ((i > -1) && (array[i].toString().compareTo(key) > 0)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = new StringBuilder(key);
		}
	}
}
