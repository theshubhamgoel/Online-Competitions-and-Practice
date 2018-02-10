import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CookingtheBooks {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int test_cases = 0, max, min;
		String s, orignal;
		StringBuilder temp;
		char c;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			orignal = s = br.readLine();
			max = min = Integer.parseInt(s);

			for (int j = 0; j < orignal.length(); j++) {

				for (int j2 = j + 1; j2 < orignal.length(); j2++) {
					c = orignal.charAt(j);
					temp = new StringBuilder(orignal);
					temp.setCharAt(j, orignal.charAt(j2));
					temp.setCharAt(j2, c);
					s = temp.toString();

					if (max < Integer.parseInt(s)) {
						if (s.length() > 1 && s.charAt(0) == '0')
							continue;
						else
							max = Integer.parseInt(s);
					}

					if (min > Integer.parseInt(s)) {
						if (s.length() > 1 && s.charAt(0) == '0')
							continue;
						else
							min = Integer.parseInt(s);
					}

				}
			}

			pw.println("Case #" + (i + 1) + ": " + min + " " + max);
		}
		pw.flush();
	}
}
