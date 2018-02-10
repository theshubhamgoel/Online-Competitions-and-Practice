import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bitflip {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		int a[];
		n = Integer.parseInt(br.readLine());
		a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(bitFlip(a));
	}

	static int bitFlip(int[] arr) {

		int no_of_one[];

		no_of_one = new int[arr.length];

		if (arr[0] == 1)
			no_of_one[0] = 1;

		for (int i = 1; i < no_of_one.length; i++) {
			if (arr[i] == 1)
				no_of_one[i] = no_of_one[i - 1] + 1;
			else
				no_of_one[i] = no_of_one[i - 1];
		}

		int max = no_of_one[arr.length - 1];
		// System.out.println(max);
		 //System.out.println(Arrays.toString(no_of_one));

		 int ans=0;
		for (int i = 0; i < no_of_one.length; i++) {

			for (int j = i; j < no_of_one.length; j++) {
				int temp_max = 0;
				if (i == 0) {
					temp_max = (max - no_of_one[j]) + j + 1 - no_of_one[j];
					//System.out.println(temp_max);
				} else {
					temp_max = (max - no_of_one[j] + no_of_one[i - 1])
							+ (j - i + 1) - (no_of_one[j] - no_of_one[i - 1]);
				}

				//System.out.println(temp_max);
				if (temp_max > ans)
					ans = temp_max;
			}
		}
		return ans;
	}

}
