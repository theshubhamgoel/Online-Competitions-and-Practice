import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Equilibriumnumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, equilibrium = 0, sum1, sum2,flag;
		int[] a, sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			a = new int[n];
			sum = new int[n];
			temp = new StringTokenizer(br.readLine());

			a[0] = Integer.parseInt(temp.nextToken());
			sum[0] = a[0];
			for (int j = 1; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
				sum[j] = sum[j - 1] + a[j];
			}

			flag=0;
			for (int j = 0; j < a.length; j++) {
				equilibrium = a[j];

				// cal sum1
				if (j > 0)
					sum1 = sum[j - 1];
				else
					sum1 = 0;

				// cal sum2
				sum2 = sum[n - 1] - sum1 - equilibrium;

				if (sum1 == sum2) {
					flag=1;
					break;
				}
			}
			
			if(flag==1)
				System.out.println(equilibrium);
			else
				System.out.println("NO EQUILIBRIUM");
		}
	}
}
