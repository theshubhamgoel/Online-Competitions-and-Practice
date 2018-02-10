import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ClosestNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		Arrays.sort(a);

		int min_diff = Integer.MAX_VALUE;
		for (int i = 1; i < a.length; i++) {
			if (min_diff > a[i] - a[i - 1])
				min_diff = a[i] - a[i - 1];
		}
		
		for (int i = 1; i < a.length; i++) {
			if(min_diff==a[i]-a[i-1])
				System.out.print(a[i-1]+" "+a[i]+" ");
		}
	}
}
