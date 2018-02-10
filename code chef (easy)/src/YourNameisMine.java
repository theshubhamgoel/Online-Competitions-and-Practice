import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YourNameisMine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0,j2;
		String[] temp;
		String m, w;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			m = temp[0];
			w = temp[1];

			int current_index = -1, next_index = -2, flag = 1;
			current_index = m.indexOf(w.charAt(0));
			for (int j = 1; j < w.length(); j++) {
				if (current_index == -1) {
					flag = 0;
					break;
				}
				for (j2 = current_index+1; j2 < m.length(); j2++) {
					if (m.charAt(j2) == w.charAt(j)) {
						next_index = j2;
						break;
					}
				}
	
				if (j2==m.length()) {
					flag = 0;
					break;
				}
				current_index = next_index;
			}
			if (flag == 0) {
				current_index = w.indexOf(m.charAt(0));
				next_index = -2;
				flag=1;
				for (int j = 1; j < m.length(); j++) {
					if (current_index == -1) {
						flag = 0;
						break;
					}
					for ( j2 = current_index+1; j2 < w.length(); j2++) {
						if (w.charAt(j2) == m.charAt(j)) {
							next_index = j2;
							break;
						}
					}
					if (j2==w.length()) {
						flag = 0;
						break;
					}
					current_index = next_index;
				}
			}
			if (flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
