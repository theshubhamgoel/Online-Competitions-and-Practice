import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class problem1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		n = Integer.parseInt(br.readLine());
		int[] input = new int[n];
		int[] visited = new int[n];
		int[] maxIncoming = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}

		int x, y, ans1, ans2, ans3;
		st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		for (int i = 0; i < visited.length; i++) {
			visited[i] = 0;
			maxIncoming[i] = 0;
		}

		for (int i = 0; i < maxIncoming.length; i++) {
			if (input[i] != -1)
				maxIncoming[input[i]]++;
		}

		// ans 2
		ans2 = 0;
		for (int i = 0; i < maxIncoming.length; i++) {
			if (ans2 < maxIncoming[i])
				ans2 = maxIncoming[i];
		}

		// find cycle ans1
		ans1 = 1;
		int a, tempCycleLength, b;

		for (int i = 0; i < visited.length; i++) {
			tempCycleLength = 1;
			b = 1;
			a=i;
			if(visited[a]!=0)
				continue;
			
			visited[a]=b++;
			while (true) {
				if (input[a] == -1) {
					break;
				} else if (visited[input[a]] != 0) {
					tempCycleLength = b - visited[input[a]];
					break;
				}
				visited[input[a]] = b++;
				a = input[a];
			}
			if (tempCycleLength > ans1)
				ans1 = tempCycleLength;
		}
		System.out.println(ans1);
		System.out.println(ans2);
	}

	private static void resetVisited(int[] visited) {
		for (int i = 0; i < visited.length; i++) {
			visited[i] = 0;
		}
	}

	private static boolean allvisited(int[] visited) {

		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == 0)
				return false;
		}

		return true;
	}
}
