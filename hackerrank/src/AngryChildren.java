import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k, n, a[];
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(a);
		int min, max, unfairness;
		min = a[0];
		max = a[k - 1];
		unfairness = max - min;
		for (int i = 1; i < a.length - k; i++) {
			min = a[i];
			max = a[k - 1 + i];
			if (unfairness > max - min)
				unfairness = max - min;
		}

		System.out.println(unfairness);
	}

}
