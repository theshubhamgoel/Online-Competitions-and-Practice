import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Payingup {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, j;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		int type_of_note[];
		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			type_of_note = new int[n];
			for (j = 0; j < type_of_note.length; j++) {
				type_of_note[j] = Integer.parseInt(br.readLine());
			}
			
			if (isSubsetSum(type_of_note, n, m)) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}
	}

	public static boolean isSubsetSum(int set[], int n, int sum) {
		// The value of subset[i][j] will be true if there is a subset of
		// set[0..j-1]
		// with sum equal to i
		boolean subset[][] = new boolean[sum + 1][n + 1];

		// If sum is 0, then answer is true
		for (int i = 0; i <= n; i++)
			subset[0][i] = true;

		// If sum is not 0 and set is empty, then answer is false
		for (int i = 1; i <= sum; i++)
			subset[i][0] = false;

		// Fill the subset table in botton up manner
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= set[j - 1])
					subset[i][j] = subset[i][j]
							|| subset[i - set[j - 1]][j - 1];
			}
		}

		/*
		 * // uncomment this code to print table for (int i = 0; i <= sum; i++)
		 * { for (int j = 0; j <= n; j++) printf ("%4d", subset[i][j]);
		 * printf("\n"); }
		 */

		return subset[sum][n];
	}

}
