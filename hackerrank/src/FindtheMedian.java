import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindtheMedian {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new int[20001];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(temp.nextToken()) + 10000]++;
		}

		int count = 0, x = n / 2 + 1, o = 0;
		for (int i = 0; i < a.length; i++) {
			count += a[i];
			if (count >= x) {
				o = i-10000;
				break;
			}
		}
		
		System.out.println(o);

	}

}
