import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subanagrams {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, flag;
		String temp, out = "";

		n = Integer.parseInt(br.readLine());

		int x[][] = new int[n][26];
		for (int j = 0; j < n; j++) {
			temp = br.readLine();
			for (int j2 = 0; j2 < temp.length(); j2++)
				x[j][temp.charAt(j2) - 97]++;
		}

		for (int j = 0; j < 26; j++) {
			flag = 1;
			for (int j2 = 0; j2 < n; j2++) {
				if (x[j2][j] == 0) {
					flag = 0;
					break;
				} else
					x[j2][j]--;
			}
			if (flag == 1) {
				out += (char) (j + 97);
				j--;
			}
		}
		if (out.length() > 0)
			System.out.println(out);
		else
			System.out.println("no such string");
	}
}
