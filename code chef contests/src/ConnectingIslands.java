import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ConnectingIslands {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, q, type, x, y;
		int index[];
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> t = new ArrayList<Integer>();
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		q = Integer.parseInt(temp.nextToken());
		index = new int[n + 1];

		a.add(t);
		for (int i = 0; i < q; i++) {
			temp = new StringTokenizer(br.readLine());

			type = Integer.parseInt(temp.nextToken());
			x = Integer.parseInt(temp.nextToken());
			y = Integer.parseInt(temp.nextToken());

			if (type == 0) {

				if (index[x] == 0 && index[y] == 0) {
					t=new ArrayList<Integer>();
					t.add(x);
					t.add(y);
					a.add(t);
					index[x] = index[y] = a.size() - 1;
				} else if (index[x] != 0 && index[y] != 0) {
					t = a.get(index[y]);
					//System.out.println();
					for (int j = 0; j < t.size(); j++) {
						index[t.get(j)] = index[x];
					}

				} else if (index[x] != 0) {
					index[y] = index[x];
					t = a.get(index[x]);
					t.add(y);
					a.set(index[x], t);
				} else {
					index[x] = index[y];
					t = a.get(index[y]);
					t.add(x);
					a.set(index[y], t);
				}
			}

			//System.out.println(Arrays.toString(index));
			if (type == 1) {
				if (index[x] != index[y] || index[x] == 0 || index[y] == 0)
					System.out.println("No");
				else
					System.out.println("Yes");
			}

		}
	}
}
