import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantandCandies {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k, j, sum;
		String[] temp;
		int[] ak;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");

			n = Integer.parseInt(temp[0]);
			k = Integer.parseInt(temp[1]);

			temp = br.readLine().split(" ");

			sum = 0;
			ak = new int[temp.length];
			for (j = 0; j < temp.length; j++) {
				ak[j] = Integer.parseInt(temp[j]);
				sum += ak[j];
			}

			if (sum> k)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}

}
