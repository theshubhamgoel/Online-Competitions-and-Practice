import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheRepublicDayspeech {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, max, ans;
		String temp;
		int[] a;

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().toLowerCase();
			a = new int[257];

			for (int j = 0; j < temp.length(); j++) {
				a[temp.charAt(j) % 256]++;
			}

			max = 0;
			ans = 65;
			for (int j = 97; j <= 122; j++) {
				if (max <= a[j]) {
					max = a[j];
					ans = j;
				}
			}

			System.out.println(Character.toChars(ans));
		}
	}
}
