import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FillingJars {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n, m, sum, a, b, k;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());

		sum = 0;
		for (int i = 0; i < m; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			sum += (b - a + 1) * k;
		}
		sum /= n;
		System.out.println(sum);

	}

}
