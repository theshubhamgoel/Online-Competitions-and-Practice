import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chocoland {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double test_cases, m, x = 0;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			m = Integer.parseInt(br.readLine());
			m++;

			int flag = 0;
			for (int j = 7;; j++) {
				x = m * j + 1;
				//System.out.println(x);
				for (int j2 = 0; j2 < m; j2++) {
					flag = 0;
					if ((x - 1) % m != 0) {
						flag = 1;
					}

					if (flag == 1)
						break;

					if ((m * x) % (m - 1) == 0)
						x = m * x / (m - 1) + 1;
					
					else {
						flag = 1;
						break;
					}
					
					//System.out.println(x);
				}
				if (flag == 0) {
					System.out.println(x % 100007);
					break;
				}
			}
		}

	}

}
