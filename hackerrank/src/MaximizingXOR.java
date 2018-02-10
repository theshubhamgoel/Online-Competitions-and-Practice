import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximizingXOR {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l, r;

		l = Integer.parseInt(br.readLine());
		r = Integer.parseInt(br.readLine());

		int max = 0;
		for (int i = l; i <= r; i++) {
			for (int j = l; j <= r; j++) {
				max = max < (i ^ j) ? (i ^ j) : max;
			}
		}

		System.out.println(max);
	}

}
