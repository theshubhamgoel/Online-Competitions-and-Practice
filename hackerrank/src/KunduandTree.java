import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class KunduandTree {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, v1, v2;
		String color;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		ArrayList<graph> al = new ArrayList<graph>();
		graph g;

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			v1 = Integer.parseInt(temp.nextToken());
			v2 = Integer.parseInt(temp.nextToken());
			color = temp.nextToken();

			g = new graph(v1, v2, color);
			al.add(g);

		}

	}
}

class graph {
	int v1, v2;
	String color;

	graph(int v1, int v2, String color) {
		this.v1 = v1;
		this.v2 = v2;
		this.color = color;
	}
}
