import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChhotaBheemandKirmada {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		long[] arr = new long[17];
		long n, k,k1;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		arr[0] = 0;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (long) (9 * Math.pow(10, i-1));
		}

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Long.parseLong(temp.nextToken());
			k1=k = Long.parseLong(temp.nextToken());

			String a = "";

			for (int j = 1; j <= n; j++) {
				a += j + "";
			}

			//System.out.println(a);
			System.out.println(a.charAt((int) k - 1));

			int pow = 1;
			while (k > 0) {
				k -= arr[pow];
				pow++;
			}

			
			if (k1 < 10) {
				System.out.println(k1);
			} else {
				pow--;
				//System.out.println(pow);
				k += arr[pow];
				int x = (int) (k / pow);
				int y = (int) (k % pow);
				long z = (long) (Math.pow(10, pow-1) + x);
				String s;
				
				System.out.println(z);
				if (y == 0) {
					s = Long.toString(z);
					System.out.println(s.charAt(s.length() - 1));
				} else {
					z++;
					s = Long.toString(z);
					System.out.println(s.charAt(y - 1));
				}
			}
		}
	}
}
