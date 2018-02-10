import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClosingtheTweets {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, k, no_of_open_tweets = 0, x;
		StringTokenizer temp;

		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		k = Integer.parseInt(temp.nextToken());

		int t[] = new int[n];
		for (int i = 0; i < k; i++) {
			temp = new StringTokenizer(br.readLine());
			if (temp.nextToken().equals("CLICK")) {
				x = Integer.parseInt(temp.nextToken()) - 1;
				if (t[x] == 0) {
					no_of_open_tweets++;
					t[x] = 1;
				} else {
					no_of_open_tweets--;
					t[x] = 0;
				}
			} else {
				t = new int[n];
				no_of_open_tweets = 0;
			}
			System.out.println(no_of_open_tweets);
		}
	}
}
