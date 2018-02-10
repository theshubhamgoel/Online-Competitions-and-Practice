import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LightsandSwitches {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, b1, max_b1, current_max, start;
		int arr[];
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			s = br.readLine();
			arr = new int[s.length()];

			current_max = 0;
			for (int j = 0; j < s.length(); j++) {
				current_max += arr[j] = s.charAt(j) - 48;
			}

			for (start = 0; start < arr.length; start++) {
				if (arr[start] == 0)
					break;
			}

			max_b1 = b1 = 0;
			for (int j = start; j < arr.length; j++) {
				if (arr[j] == 0) {
					b1++;
				} else {
					if (max_b1 < b1)
						max_b1 = b1;

					b1--;
					if (b1 < 0)
						b1++;
				}
			}

			if (max_b1 < b1)
				max_b1 = b1;

			if (start == arr.length)
				current_max--;
			
			System.out.println(max_b1 + current_max);

		}
	}
}
