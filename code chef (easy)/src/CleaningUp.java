import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleaningUp {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, m, n, j, flag;
		int jobs_to_be_done[];
		test_cases = Integer.parseInt(br.readLine());
		String Temp[], chefs_jobs, assistant_jobs;
		for (int i = 0; i < test_cases; i++) {

			chefs_jobs = "";
			assistant_jobs = "";
			Temp = br.readLine().split(" ");
			n = Integer.parseInt(Temp[0]);
			m = Integer.parseInt(Temp[1]);

			jobs_to_be_done = new int[n];

			Temp = br.readLine().split(" ");
			for (j = 0; j < m; j++) {
				jobs_to_be_done[Integer.parseInt(Temp[j]) - 1] = 1;
			}

			flag = 1;
			for (j = 0; j < n; j++) {
				if (jobs_to_be_done[j] == 0) {
					if (flag == 1) {
						chefs_jobs +=(j+1)+" ";
						flag = 0;
					} else {
						assistant_jobs +=(j+1)+" ";
						flag = 1;
					}
				}
			}

			System.out.println(chefs_jobs);
			System.out.println(assistant_jobs);
		}
	}
}
