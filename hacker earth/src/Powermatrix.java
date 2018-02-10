import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Powermatrix {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, lenght, mod = 1000000007;
		int[][] mat, result, t;
		int mul_mat[][][];
		StringTokenizer temp;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			m = Integer.parseInt(temp.nextToken());
			n = Integer.parseInt(temp.nextToken());

			mat = new int[m][m];
			result = new int[m][m];
			for (int j = 0; j < m; j++) {
				temp = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < m; j2++) {
					mat[j][j2] = Integer.parseInt(temp.nextToken());
				}
			}

			lenght = Integer.toBinaryString(n).length();
			mul_mat = new int[lenght + 1][m][m];

			mul_mat[1] = mat;

			for (int j = 2; j < mul_mat.length; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					for (int k = 0; k < m; k++) {
						long sum = 0;
						for (int k2 = 0; k2 < m; k2++) {
							sum += (1L * mul_mat[j - 1][j2][k2] * mul_mat[j - 1][k2][k])
									% mod;
						}

						mul_mat[j][j2][k] = (int) (sum % mod);
					}
				}

			}

			String data = Integer.toBinaryString(n);
			// System.out.println(data);

			t = new int[m][m];

			for (int j = 0; j < m; j++) {
				result[j][j] = 1;
			}

			for (int a = 0; a < data.length(); a++) {
				if (data.charAt(a) == '1') {

					t = result;

					for (int j2 = 0; j2 < m; j2++) {
						for (int k = 0; k < m; k++) {
							long sum = 0;
							for (int k2 = 0; k2 < m; k2++) {
								sum += (1L * t[j2][k2] * mul_mat[data.length()
										- a][k2][k])
										% mod;
							}

							result[j2][k] = (int) (sum % mod);
						}
					}

				}
			}

			for (int j = 0; j < m; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					System.out.print(result[j][j2] + " ");
				}
				System.out.println();
			}

		}
	}
}
