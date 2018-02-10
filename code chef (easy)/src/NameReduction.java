import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameReduction {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, flag;
		int parent[], child[];
		String t[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			t = br.readLine().split(" ");
			parent = new int[26];
			child = new int[26];

			for (int j = 0; j < t[0].length(); j++) {
				parent[t[0].charAt(j) - 97]++;
			}

			for (int j = 0; j < t[1].length(); j++) {
				parent[t[1].charAt(j) - 97]++;
			}

			n = Integer.parseInt(br.readLine());

			for (int j = 0; j < n; j++) {
				t[0] = br.readLine();
				for (int j2 = 0; j2 < t[0].length(); j2++) {
					child[t[0].codePointAt(j2) - 97]++;
				}
			}

			flag = 1;

			for (int j = 0; j < parent.length; j++) {
				if (parent[j] < child[j]) {
					flag = 0;
					break;
				}
			}
			
			if (flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
