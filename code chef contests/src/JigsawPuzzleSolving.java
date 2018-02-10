import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JigsawPuzzleSolving {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int h, w, k, max, x, index = 0;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		h = Integer.parseInt(temp.nextToken());
		w = Integer.parseInt(temp.nextToken());
		k = Integer.parseInt(temp.nextToken());

		int[] a = null, b = null;

		max = 0;
		for (int i = 0; i < k; i++) {
			x = Integer.parseInt(br.readLine());
			if (x == 0)
				continue;

			if (max < x) {
				max = x;
				index = i + 1;
				a = new int[x];
				b = new int[x];

				for (int j = 0; j < x; j++) {
					temp = new StringTokenizer(br.readLine());
					a[j] = Integer.parseInt(temp.nextToken())-1;
					b[j] = Integer.parseInt(temp.nextToken())-1;
				}

			} else {
				for (int j = 0; j < x; j++) {
					br.readLine();
				}
			}
		}

		int[][] mat = new int[h][w];

		for (int i = 0; i < max; i++) {
			mat[a[i]][b[i]] = index;
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}
}
