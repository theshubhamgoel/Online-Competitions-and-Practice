import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CoolingPies {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, no_of_pie_and_rack, j, count, k;
		test_cases = Integer.parseInt(br.readLine());
		int pies_weight[], racks_weight[];
		String temp[];

		for (int i = 0; i < test_cases; i++) {
			count = 0;
			no_of_pie_and_rack = Integer.parseInt(br.readLine());
			pies_weight = new int[no_of_pie_and_rack];
			racks_weight = new int[no_of_pie_and_rack];

			temp = br.readLine().split(" ");
			for (j = 0; j < no_of_pie_and_rack; j++) {
				pies_weight[j] = Integer.parseInt(temp[j]);
			}

			temp = br.readLine().split(" ");
			for (j = 0; j < no_of_pie_and_rack; j++) {
				racks_weight[j] = Integer.parseInt(temp[j]);
			}

			Arrays.sort(pies_weight);
			Arrays.sort(racks_weight);

			for (j = k = no_of_pie_and_rack - 1; j >= 0;) {
				if (k >= 0) {
					if (racks_weight[j] >= pies_weight[k]) {
						j--;
						count++;
					}
					k--;
				} else
					break;
			}
			System.out.println(count);
		}

	}

}
