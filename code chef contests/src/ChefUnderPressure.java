import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefUnderPressure {

	static int[] disfromCapital, visited;
	static ArrayList[] pathfromCapital, product, mat;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int q = 0, n, k, capital, u, v, a, p;

		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		k = Integer.parseInt(temp.nextToken());

		capital = Integer.parseInt(br.readLine());

		disfromCapital = new int[n + 1];
		visited = new int[n + 1];

		pathfromCapital = new ArrayList[n + 1];
		mat = new ArrayList[n + 1];
		product = new ArrayList[k + 1];

		for (int i = 0; i < n + 1; i++) {
			pathfromCapital[i] = new ArrayList<Integer>();
			mat[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < k + 1; i++) {
			product[i] = new ArrayList<Integer>();
		}

		pathfromCapital[capital].add(capital);
		visited[capital] = 1;

		for (int i = 0; i < n - 1; i++) {
			temp = new StringTokenizer(br.readLine());
			u = Integer.parseInt(temp.nextToken());
			v = Integer.parseInt(temp.nextToken());
			mat[u].add(v);
			mat[v].add(u);
		}

		for (int i = 1; i < n + 1; i++) {
			product[Integer.parseInt(br.readLine())].add(i);
		}

		// calculate distance from capital
		cal_distance_and_path_from_capital(capital, 1);

		q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			p = Integer.parseInt(temp.nextToken());

			int min = -100000, temp_min, source_city, target_city, ans = -1;
			for (int j = 0; j < product[p].size(); j++) {
				source_city = a;
				target_city = (Integer) product[p].get(j);
				// System.out.println("Source " + source_city + " Target city "
				// + target_city);

				temp_min = cal_query_path(source_city, target_city);

				if (min < temp_min) {
					min = temp_min;
					ans = target_city;
				} else if (temp_min == min && ans > target_city) {
					ans = target_city;
				}
			}

			System.out.println(ans);
		}
	}

	private static int cal_query_path(int sourceCity, int targetCity) {
		int skip_depth = -1;
		for (int i = 0; i < pathfromCapital[sourceCity].size()
				&& i < pathfromCapital[targetCity].size(); i++) {
			if (pathfromCapital[sourceCity].get(i) != pathfromCapital[targetCity]
					.get(i))
				break;
			else
				skip_depth++;
		}

		int temp_min = 100000, x;
		for (int i = skip_depth; i < pathfromCapital[sourceCity].size(); i++) {
			x = disfromCapital[(Integer) pathfromCapital[sourceCity].get(i)];
			if (x < temp_min) {
				temp_min = x;
			}
		}

		for (int i = skip_depth + 1; i < pathfromCapital[targetCity].size(); i++) {
			x = disfromCapital[(Integer) pathfromCapital[targetCity].get(i)];
			if (x < temp_min) {
				temp_min = x;
			}
		}

		return temp_min;
		// print_collection_data(pathfromCapital[sourceCity]);
		// print_collection_data(pathfromCapital[targetCity]);
		// print_collection_data(queryPath);

	}

	private static void print_collection_data(ArrayList<Integer> queryPath2) {
		for (int i = 0; i < queryPath2.size(); i++) {
			System.out.print(queryPath2.get(i) + " ");
		}
		System.out.println();

	}

	private static void cal_distance_and_path_from_capital(int capital, int d) {
		int i;
		for (int k = 0; k < mat[capital].size(); k++) {
			i = (Integer) mat[capital].get(k);
			if (visited[i] != 1) {
				visited[i] = 1;
				disfromCapital[i] = d;
				for (int j = 0; j < pathfromCapital[capital].size(); j++) {
					pathfromCapital[i].add(pathfromCapital[capital].get(j));
				}
				pathfromCapital[i].add(i);
				cal_distance_and_path_from_capital(i, d + 1);
			}
		}
	}
}