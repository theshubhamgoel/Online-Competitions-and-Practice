import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thelongestcommonsubsequence {

	/** function lcs **/
	public static String lcs(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();

		int[][] arr = new int[l1 + 1][l2 + 1];

		for (int i = l1 - 1; i >= 0; i--) {
			for (int j = l2 - 1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j))
					arr[i][j] = arr[i + 1][j + 1] + 1;
				else
					arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
			}
		}

		int i = 0, j = 0;
		StringBuffer sb = new StringBuffer();
		while (i < l1 && j < l2) {
			if (str1.charAt(i) == str2.charAt(j)) {
				sb.append(str1.charAt(i));
				i++;
				j++;
			} else if (arr[i + 1][j] >= arr[i][j + 1])
				i++;
			else
				j++;
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a, b;

		br.readLine();
		a = br.readLine();
		b = br.readLine();

		String s = lcs(a, b), r = "";

		int i = 0, count;
		while (s.charAt(i) == ' ')
			i++;

		count = 0;
		for (int j = i; j < s.length(); j++) {
			if (count == 500)
				break;
			r = "" + s.charAt(j);
			if (s.charAt(j) == ' ')
				count++;
		}
		
		System.out.println(r);
	}
}
