import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Autocomplete {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\GOEL\\Desktop\\facebook\\input2.txt"));
		PrintWriter pw = new PrintWriter(System.out);
		ArrayList<String>[] al;

		int test_cases = 0, n, count = 0, sum, index;
		String x, t;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			count = 0;
			al = new ArrayList[26];
			for (int j = 0; j < al.length; j++) {
				al[j] = new ArrayList<String>();
			}
			
			for (int k = 0; k < n; k++) {
				x = br.readLine();
				index=x.charAt(0)-97;
				t = "";
				int flag = 0;
				for (int j = 0; j < x.length(); j++) {
					t += x.charAt(j);
					if (!al[index].contains(t)) {
						al[index].add(t);
						count += j + 1;
						// System.out.println(j + 1);
						for (int j2 = j + 1; j2 < x.length(); j2++) {
							t += x.charAt(j2);
							al[index].add(t);
						}
						flag = 1;
						break;
					}
				}

				if (flag == 0)
					count += x.length();

			}

			pw.println("Case #" + (i + 1) + ": " + count);
			
			for (int j = 0; j < al.length; j++) {
				al[j].clear();
			}
		}

		pw.flush();
	}
}
