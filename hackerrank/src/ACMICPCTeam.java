import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMICPCTeam {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m;
		StringTokenizer temp;
		String t[];
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		t = new String[n];

		for (int i = 0; i < n; i++) {
			t[i] = br.readLine();
		}

		int a[][] = new int[n][n];
		int max = 0, count;
		for (int i = 0; i < t.length; i++) {
			for (int j = i + 1; j < t.length; j++) {
				count = 0;
				for (int j2 = 0; j2 < m; j2++) {
					if (t[i].charAt(j2) == '1' || t[j].charAt(j2) == '1')
						count++;
				}

				a[i][j] = count;
				if (max < count)
					max = count;
			}
		}

		count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i][j] == max)
					count++;
			}
		}

		System.out.println(max);
		System.out.println(count);
	}
}
