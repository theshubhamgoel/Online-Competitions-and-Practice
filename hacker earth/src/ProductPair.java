import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ProductPair {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, k, count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		int level[] = new int[n + 1];
		int isroot[] = new int[n + 1];
		for (int i = 0; i < level.length; i++) {
			level[i] = 0;
			isroot[i] = 1;
		}

		HashMap<Integer, Integer> pair = new HashMap<Integer, Integer>();

		for (int i = 0; i < n - 1; i++) {
			int x, y;
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			isroot[y] = 0;

			level[y]++;
			pair.put(y, level[y]);
		}

		int root = 0;
		for (int i = 1; i < isroot.length; i++) {
			if (isroot[i] == 1) {
				root = i;
				break;
			}
		}
		
		

		System.out.println(count);
	}
}
