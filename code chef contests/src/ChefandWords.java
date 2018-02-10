import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ChefandWords {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, log1;
		StringTokenizer temp;
		String s, x;
		String[] data;
		double d[][][];
		double[][] final_mat;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			log1 = (int) (Math.log10(k) / Math.log10(2)) + 1;
			
			d = new double[log1][26][26];
			final_mat = new double[26][26];
			s = br.readLine();

			for (int j = 0; j < d[0].length; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < d[0].length; j2++) {
					d[0][j][j2] = Double.parseDouble(temp.nextToken());
				}
			}

			data = new String[n];

			HashSet<String> h = new HashSet<String>();
			for (int j = 0; j < data.length; j++) {
				h.add(br.readLine());
			}

			for (int j = 1; j < log1; j++) {
				cal_prob(d, j);
			}

			String ss = Integer.toBinaryString(k);

			for (int j = 0; j < final_mat.length; j++) {
				final_mat[j][j] = 1;
			}

			for (int j = ss.length() - 1; j >= 0; j--) {
				if (ss.charAt(j) == '1') {
					matrix_multiply(final_mat, d[ss.length() - 1 - j]);
				}
			}

			/*
			 * for (int j = 1; j < k; j++) { cal_prob(d, j); }
			 */

			double final_p = 0, p_for_alphabets;

			Iterator<String> ii = h.iterator();

			while (ii.hasNext()) {

				x = ii.next();
				if (s.length() != x.length())
					continue;

				p_for_alphabets = 1;
				for (int j2 = 0; j2 < s.length(); j2++) {
					p_for_alphabets *= final_mat[s.charAt(j2) - 97][x
							.charAt(j2) - 97];
				}
				final_p += p_for_alphabets;
			}

			System.out.println(final_p);
		}

	}

	private static void matrix_multiply(double[][] finalMat, double[][] ds) {
		double[][] f = new double[26][26];

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				for (int k = 0; k < 26; k++) {
					f[i][j] = f[i][j] + finalMat[i][k] * ds[k][j];
				}

			}
		}

		for (int i = 0; i < f.length; i++) {
			finalMat[i] = f[i];
		}
	}

	private static void cal_prob(double[][][] d, int c) {

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < 26; j++) {
				for (int k = 0; k < 26; k++) {
					d[c][i][j] = d[c][i][j] + d[c - 1][i][k] * d[c - 1][k][j];
				}
			}
		}
	}
}