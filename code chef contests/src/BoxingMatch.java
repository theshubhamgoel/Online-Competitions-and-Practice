import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class mygraph {

	ArrayList<mygraph> node;
	int value;

	public mygraph(int i) {
		node = new ArrayList<mygraph>();
		value = i;
	}

	void addchild(mygraph g) {
		node.add(g);
	}

}

public class BoxingMatch {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, x, y;
		int market[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			market = new int[n];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < market.length; j++) {
				market[j] = Integer.parseInt(temp.nextToken());
			}

			mygraph root[] = new mygraph[n];
			for (int j = 0; j < n; j++) {
				root[j] = new mygraph(j);
			}

			for (int j = 0; j < m; j++) {
				temp = new StringTokenizer(br.readLine());
				x = Integer.parseInt(temp.nextToken()) - 1;
				y = Integer.parseInt(temp.nextToken()) - 1;

				root[x].addchild(root[y]);
				root[y].addchild(root[x]);
			}

		}
	}
}
