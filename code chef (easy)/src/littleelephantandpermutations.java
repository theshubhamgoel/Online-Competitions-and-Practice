import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class littleelephantandpermutations {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a[], no_of_inversion, no_of_local_inversion;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			a = new int[n];

			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
			}

			no_of_inversion = no_of_local_inversion = 0;
			for (int j = 0; j < a.length; j++) {
				for (int j2 = j + 1; j2 < a.length; j2++) {
					if (a[j] > a[j2])
						no_of_inversion++;
				}
			}

			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j])
					no_of_local_inversion++;
			}

			if (no_of_inversion == no_of_local_inversion)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}
