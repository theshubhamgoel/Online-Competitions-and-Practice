import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittleChefandNumbers {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, a[], x, count, x2;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			a = new int[n];
			x = count = x2 = 0;
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(temp.nextToken());
				if (a[j] == 1 || a[j] == 0)
					x++;
				if (a[j] == 2)
					x2++;
			}

			for (int j = 0; j < a.length; j++) {
				if (a[j] == 0 || a[j] == 1) {
					x--;
				} else if (a[j] == 2) {
					x2--;
					count += n - j - 1 - x - x2;
				} else {
					count += n - j - 1 - x;
				}
			}	
			System.out.println(count);
		}
	}
}
