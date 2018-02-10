import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buy1Get1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, x = 0, out;
		String temp;
		int[] count;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine();
			count = new int[52];
			for (int j = 0; j < temp.length(); j++) {
				x = temp.charAt(j);
				x = x > 91 ? x - 97 : x - 39;
				count[x]++;
			}

			out = 0;
			for (int j = 0; j < count.length; j++) {
				if (count[j] != 0) {
					out = out + (int) Math.ceil(count[j]/2.0);
				}
			}
			System.out.println(out);
		}
	}

}
