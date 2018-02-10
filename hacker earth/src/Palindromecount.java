import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromecount {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		String temp, t;

		temp = br.readLine();

		for (int i = 0; i < temp.length(); i++) {
			for (int j = i; j < temp.length(); j++) {
				t = "";
				for (int j2 = i; j2 <= j; j2++) {
					t += temp.charAt(j2);
				}
				if (new StringBuilder(t).reverse().toString().equals(t))
					count++;
			}
		}
		System.out.println(count);
	}
}
