import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gottacatchemall {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k, x = 0, t;
		StringTokenizer temp;
		int a[];

		k = Integer.parseInt(br.readLine());

		temp = new StringTokenizer(br.readLine());
		a = new int[k];

		for (int i = 0; i < a.length; i++)
			a[i] = Integer.parseInt(temp.nextToken());

		Arrays.sort(a);
		
		for (int i = 0; i < a.length/2; i++) {
			t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
		}

		for (int i = 0; i < a.length; i++) {
			a[i] += i;
			if (x < a[i])
				x = a[i];
		}
		x+=2;
		System.out.println(x);

	}

}
