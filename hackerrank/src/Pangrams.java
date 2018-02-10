import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangrams {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		s = br.readLine().toLowerCase();
		int[] a = new int[256];

		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)]++;
		}

		int flag = 1;
		for (int i = 97; i <= 122; i++) {
			if (a[i] == 0) {
				flag = 0;
				break;
			}
		}

		if (flag == 0)
			System.out.println("not pangram");
		else
			System.out.println("pangram");
	}
}
