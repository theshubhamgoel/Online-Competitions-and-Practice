import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SerejaandPermutations {

	static int[] final_array;
	static StringTokenizer temp;
	static String[] data;
	static int test_cases = 0, n, x, index, flag, ex = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			final_array = new int[n];
			data = new String[n];

			String y = "";
			for (int j = 0; j < n; j++) {
				y += j;
			}

			for (int j = 0; j < data.length; j++) {
				data[j] = br.readLine();
			}

			permutation("", y);

		}

	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			//System.out.println(prefix);
			if (check_for_right_permutuation(prefix)) {
				ex = 1;
				return;
			}
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), str.substring(0, i)
						+ str.substring(i + 1));
				if(ex==1)
					return;
			}
		}
	}

	private static boolean check_for_right_permutuation(String d) {
		// System.out.println(d);
		flag = 0;
		Arrays.fill(final_array, -832321777);
		for (int j = 0; j < final_array.length; j++) {
			int q = d.charAt(j) - 48;
			temp = new StringTokenizer(data[q]);
			for (int j2 = 0; j2 < final_array.length - 1; j2++) {
				x = Integer.parseInt(temp.nextToken());

				if (j2 < q)
					index = j2;
				else
					index = j2 + 1;

				if (x < (q + 1)) {
					if (final_array[index] == -832321777
							|| final_array[index] == x) {
						final_array[index] = x;
					} else {
						flag = 1;
						break;
					}

				} else if (x > (q + 1)) {
					if (final_array[index] == -832321777
							|| final_array[index] == x + 1) {
						final_array[index] = x + 1;
					} else {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 1)
				return false;
		}

		for (int j = 0; j < final_array.length; j++) {
			System.out.print(final_array[j] + " ");
		}

		System.out.println();
		return true;
	}
}
