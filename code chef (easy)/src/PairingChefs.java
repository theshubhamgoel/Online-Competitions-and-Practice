import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PairingChefs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, m, u[], v[];
		boolean visited[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			m = Integer.parseInt(temp.nextToken());

			visited = new boolean[n];
			u = new int[m];
			v = new int[m];

			for (int j = 0; j < m; j++) {
				temp = new StringTokenizer(br.readLine());
				u[j] = Integer.parseInt(temp.nextToken());
				v[j] = Integer.parseInt(temp.nextToken());
			}

			ArrayList<Integer> o = new ArrayList<Integer>();
			
			for (int j = m - 1; j >= 0; j--) {
				if (visited[u[j]] == false && visited[v[j]] == false) {
					visited[u[j]] = true;
					visited[v[j]] = true;
					o.add(j);
				}
			}

			for (int j = o.size() - 1; j >= 0; j--) {
				System.out.print(o.get(j)+" ");
			}
			
			System.out.println();
		}
	}
}
