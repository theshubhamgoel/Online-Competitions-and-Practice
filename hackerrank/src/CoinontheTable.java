import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinontheTable {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, k;
		String board[];
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		k = Integer.parseInt(temp.nextToken());

		board = new String[n];

		for (int i = 0; i < n; i++) {
			board[i] = br.readLine();
		}
		
		
	}

}
