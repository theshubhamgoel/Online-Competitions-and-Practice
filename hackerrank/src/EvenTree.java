import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

class MyGraph {
	int current;
	ArrayList<MyGraph> child;
	int totalVertex;

	public MyGraph(int value) {
		current = value;
		child = new ArrayList<MyGraph>();
	}

	public void addChild(MyGraph g) {
		child.add(g);
	}

	public void showGraph() {
		ArrayList<MyGraph> g = new ArrayList<MyGraph>();
		MyGraph t;
		g.add(this);

		// BFS
		while (g.size() > 0) {
			t = g.remove(0);
			System.out.println(t.current + " and toatl child " + t.totalVertex);
			for (int j = 0; j < t.child.size(); j++) {
				g.add(t.child.get(j));
			}
		}
	}

	public void updateTotalVertex() {
		Stack<MyGraph> g = new Stack<MyGraph>();
		MyGraph t;

		// DFS
		int count = 1;
		for (int i = 0; i < child.size(); i++) {
			g.add(child.get(i));
		}

		while (!g.isEmpty()) {
			t = g.peek();
			t.updateTotalVertex();
			count += t.totalVertex;
			g.pop();
		}
		totalVertex = count;
	}

	public int solve(MyGraph g, int even) {
		int count = 0;

		for (int i = 0; i < g.child.size(); i++) {
			//System.out.println("Child " + g.child.get(i).current);
			if (even == 0) {
				if (g.child.get(i).totalVertex % 2 == 0
						&& (g.totalVertex - g.child.get(i).totalVertex) % 2 == 0) {
					count += solve(g.child.get(i), 0) + 1;
				} else {
					// update all sub child total vertex
					count += solve(g.child.get(i), 1);
				}
			}else{
				if (g.child.get(i).totalVertex % 2 != 0
						&& (g.totalVertex - g.child.get(i).totalVertex) % 2 != 0) {
					count += solve(g.child.get(i), 0) + 1;
				} else {
					// update all sub child total vertex
					count += solve(g.child.get(i), 1);
				}
			}
		}
		return count;
	}
}

public class EvenTree {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, u, v;
		int[][] mat;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());

		mat = new int[n][n];

		for (int i = 0; i < m; i++) {
			temp = new StringTokenizer(br.readLine());
			u = Integer.parseInt(temp.nextToken()) - 1;
			v = Integer.parseInt(temp.nextToken()) - 1;

			mat[u][v] = 1;
			mat[v][u] = 1;
		}

		MyGraph root;
		MyGraph[] g;

		g = new MyGraph[n];
		for (int i = 0; i < g.length; i++) {
			g[i] = new MyGraph(i + 1);
		}

		root = g[0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = i; j < mat.length; j++) {
				if (mat[i][j] == 1) {
					g[i].addChild(g[j]);
				}
			}
		}

		root.updateTotalVertex();
		root.showGraph();
		System.out.println(root.solve(root, 0));
	}
}
