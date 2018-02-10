import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Letusplaywithranklist {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		int rank_list[];
		long s, actual_sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			n = Integer.parseInt(temp.nextToken());
			s = Long.parseLong(temp.nextToken());

			actual_sum = (1L * n * (n + 1)) / 2;
			// System.out.println(actual_sum);

			if (actual_sum == s)
				System.out.println("0");
			else {
				if (s == n)
					System.out.println(n - 1);
				else {
					rank_list = new int[n];
					Arrays.fill(rank_list, 1);
					s = s - n;
					for (int j = 1; j < rank_list.length; j++) {
						if (s - j > 0) {
							s = s - j;
							rank_list[j] = j + 1;
						} else
							break;
					}
					
					int count=0;
					for (int j = 0; j < rank_list.length; j++) {
						if(rank_list[j]!=j+1)
							count++;
					}
					
					//System.out.println(Arrays.toString(rank_list));
					System.out.println(count);
				}
			}
		}
	}
}
