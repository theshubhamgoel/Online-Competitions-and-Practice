import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Upstairs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, floor[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		floor = new int[n];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			floor[i] = Integer.parseInt(temp.nextToken());
		}

		int old_cost, new_cost, max_p, max_i;
		max_p = max_i = 0;
		for (int i = 0; i < floor.length - 1; i++) {
			old_cost = new_cost = 0;

			if (i - 1 >= 0) {
				if (floor[i] > floor[i - 1])
					old_cost += floor[i] - floor[i - 1];
				if (floor[i + 1] > floor[i - 1])
					new_cost += floor[i + 1] - floor[i - 1];
			}

			if (floor[i] < floor[i + 1])
				old_cost += floor[i + 1] - floor[i];
			else
				new_cost += floor[i] - floor[i + 1];

			if (i + 2 < n) {
				if (floor[i + 2] > floor[i + 1])
					old_cost += floor[i + 2] - floor[i + 1];
				if (floor[i + 2] > floor[i])
					new_cost += floor[i + 2] - floor[i];
			}

			new_cost = old_cost - new_cost;

			if (max_p < new_cost) {
				max_p = new_cost;
				max_i = i;
			}
		}

		if (max_p != 0)
			System.out.println(max_i + 1);
		else
			System.out.println("-1");
	}
}
