import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FlippingCoins {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int n, q, a, b, count, x;
		StringTokenizer temp;
		boolean[] coin;

		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		q = Integer.parseInt(temp.nextToken());

		coin = new boolean[n];
		for (int j = 0; j < q; j++) {
			temp = new StringTokenizer(br.readLine());
			x = Integer.parseInt(temp.nextToken());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());
			if (x == 0) {
				for (int i = a; i <= b; i++) {
					if (coin[i])
						coin[i] = false;
					else
						coin[i] = true;
				}
			} else {
				count = 0;
				String.valueOf(coin);
				for (int i = a; i <= b; i++) {
					if (coin[i])
						count++;
				}
				pw.println(count);
			}
		}
		pw.flush();
	}
}
