import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountofMaximum {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, j, max_occ, max_occ_index, temp_occ, temp_occ_index;
		test_cases = Integer.parseInt(br.readLine());
		String temp[];
		int[] arr;

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = br.readLine().split(" ");
			arr = new int[n];

			for (j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}

			Arrays.sort(arr);
			max_occ = max_occ_index = temp_occ = temp_occ_index = 0;
			for (j = 0; j < n; j++) {
				if (arr[temp_occ_index] == arr[j]) {
					temp_occ++;
				} else {
					if (max_occ < temp_occ) {
						max_occ = temp_occ;
						max_occ_index = temp_occ_index;
					}
					temp_occ = 0;
					temp_occ_index = j;
					j=j-1;
				}
			}
			
			if (max_occ < temp_occ) {
				max_occ = temp_occ;
				max_occ_index = temp_occ_index;
			}
			System.out.println(arr[max_occ_index] + " " + max_occ);
		}
	}
}
