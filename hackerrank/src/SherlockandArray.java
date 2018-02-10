import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockandArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a[], sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			a = new int[n];
			temp = new StringTokenizer(br.readLine());

			sum = 0;
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
				sum += a[j];
			}

			int sum_left, sum_right;
			sum_left = sum_right = 0;
			if (n == 1)
				System.out.println("YES");

			else {
				int flag=0;
				sum_left = a[0];
				sum_right = sum - a[0];
				for (int j = 1; j < a.length; j++) {
					if (sum_left == sum_right - a[j]) {
						flag=1;
						break;
					}
					sum_left += a[j];
					sum_right -= a[j];
				}
				if(flag==1)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

}
