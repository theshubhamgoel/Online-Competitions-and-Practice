import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenOddQuery {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, q, a[], x, y;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());

		a = new int[n];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}
		q = Integer.parseInt(br.readLine());

		for (int i = 0; i < q; i++) {
			temp = new StringTokenizer(br.readLine());
			x = Integer.parseInt(temp.nextToken());
			y = Integer.parseInt(temp.nextToken());

			System.out.println(find(x, y, a));
		}
	}

	private static String find(int x, int y, int a[]) {
		if (x > y)
			return "Odd";

		if (a[x - 1] % 2 != 0)
			return "Odd";
		else {
			if (a[x - 1] == 0)
				return "Even";

			if (x + 1 > y)
				return "Even";
			else {
				if (a[x] == 0)
					return "Odd";
			}
			return "Even";
		}
	}
}
