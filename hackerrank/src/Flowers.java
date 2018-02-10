/* Sample program illustrating input/output methods */
import java.util.*;

class Flowers {
	public static void main(String args[]) {

		// helpers for input/output

		Scanner in = new Scanner(System.in);

		int N, K;
		N = in.nextInt();
		K = in.nextInt();

		int c[] = new int[N];
		for (int i = 0; i < N; i++) {
			c[i] = in.nextInt();
		}

		int result = 0, x, d;

		Arrays.sort(c);

		x = K;
		d = 0;

		for (int i = N - 1; i >= 0; i--) {
			if (x == 0) {
				x = K;
				d++;
			}
			result += c[i] * (d + 1);
			x--;
		}

		System.out.println(result);

	}
}
