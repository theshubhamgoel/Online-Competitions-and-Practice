import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HackingtheRandomGeneratorAdd {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k;
		int a[], b[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			a = new int[k];
			b = new int[k];

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				a[i] = Integer.parseInt(temp.nextToken());
			}

			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				b[i] = Integer.parseInt(temp.nextToken());
			}

			System.out.println(lcs(a, b));

		}
	}

	public static int lcs(int str1[], int str2[]) {
		int i, j, m, n;
		
		m = str1.length;
		n = str2.length;
		
		int L[][]=new int[m+1][n+1];

		for (i = 0; i <= m; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;

				else if (str1[i - 1] == str2[j - 1])
					L[i][j] = L[i - 1][j - 1] + 1;

				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}

		return L[m][n];
	}
}
