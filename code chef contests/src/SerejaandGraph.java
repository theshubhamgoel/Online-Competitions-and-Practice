import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SerejaandGraph {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, i1;
		String[] temp;
		int freq[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			n = Integer.parseInt(temp[0]);
			m = Integer.parseInt(temp[1]);
			freq = new int[n];

			for (int j = 0; j < m; j++) {
				temp = br.readLine().split(" ");
				freq[Integer.parseInt(temp[0]) - 1]++;
				freq[Integer.parseInt(temp[1]) - 1]++;
			}

			Arrays.sort(freq);
			System.out.println(Arrays.toString(freq));
			if (freq[0] == 0 || n % 2 != 0)
				System.out.println("NO");
			else {
				i1 = 0;
				for (int j = i1; j < freq.length; j++) {
					if (freq[j] > 1) {
						i1 = j;
						break;
					}
				}
				while (i1 < (n - 2)) {
					freq[i1 + 1] =freq[i1+1]- freq[i1] + 1;
					freq[i1] = 1;
					if (freq[i1 + 1] == 1)
						i1 = i1 + 2;
					else
						i1++;
				}
				if (freq[n - 1] != freq[n - 2])
					System.out.println("NO");
				else
					System.out.println("YES");
			}
		}
	}
}
