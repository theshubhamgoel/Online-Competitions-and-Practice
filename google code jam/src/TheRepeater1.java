import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TheRepeater1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, n, length[], flag, count = 0;
		int arr[][];
		String a;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			arr = new int[n][26];
			length = new int[n];
			for (int j = 0; j < n; j++) {
				a = br.readLine();
				for (int j2 = 0; j2 < a.length(); j2++) {
					arr[j][a.charAt(j2) - 97]++;
				}
			}

			flag = 1;
			count = 0;
			for (int j = 1; j < arr.length; j++) {
				for (int j2 = 0; j2 < 26; j2++) {
					if (arr[j][j2] == 0 && arr[0][j2] != 0) {
						flag = 0;
						break;
					} else if (arr[j][j2] != 0 && arr[0][j2] == 0) {
						flag = 0;
						break;
					} else {
						count += Math.abs(arr[j][j2] - arr[0][j2]);
					}
				}
				if (flag == 0)
					break;
			}
			if (flag == 1)
				pw.println("Case #" + (i + 1) + ": " + count);
			else
				pw.println("Case #" + (i + 1) + ": Fegla Won");

		}
		pw.flush();
	}

}
