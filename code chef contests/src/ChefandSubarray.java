import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandSubarray {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		temp = new StringTokenizer(br.readLine());

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		int length = 0, index = 0, i;

		for (i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				if (length < i - index) {
					length = i - index;
				}
				index = i + 1;
			}
		}

		if (length < i - index)
			length = i - index;
		
		System.out.println(length);

	}
}
