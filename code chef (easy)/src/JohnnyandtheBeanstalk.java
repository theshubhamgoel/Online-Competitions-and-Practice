import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JohnnyandtheBeanstalk {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_cases = 0, k, j, current_max_leaf, flag;
		int[] no_of_leaf;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			k = Integer.parseInt(br.readLine());
			temp = br.readLine().split(" ");

			no_of_leaf = new int[k];
			for (j = 0; j < k; j++) {
				no_of_leaf[j] = Integer.parseInt(temp[j]);
			}

			current_max_leaf = 1;
			flag = 1;
			for (j = 0; j < k; j++) {
				if (no_of_leaf[j] <= current_max_leaf) {
					current_max_leaf = 2 * (current_max_leaf - no_of_leaf[j]);
					if (j == k - 1 && current_max_leaf != 0) {
						flag = 0;
						break;
					}
				} else {
					flag = 0;
					break;
				}
			}

			if (flag == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
