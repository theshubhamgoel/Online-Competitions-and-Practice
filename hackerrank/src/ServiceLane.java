import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ServiceLane {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, a[], x, y;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		test_cases = Integer.parseInt(temp.nextToken());

		a = new int[n];
		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			x = Integer.parseInt(temp.nextToken());
			y = Integer.parseInt(temp.nextToken());

			int min = a[x];
			for (int j = x + 1; j <= y; j++) {
				if (a[j] < min)
					min = a[j];
			}

			System.out.println(min);

		}

	}

}
