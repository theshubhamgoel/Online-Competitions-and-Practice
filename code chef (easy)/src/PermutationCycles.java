import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationCycles {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, no_cycles = 0, i, start, x;
		String output = "";
		String[] temp;
		n = Integer.parseInt(br.readLine());
		int[] visited = new int[n];
		int[] value = new int[n];
		temp = br.readLine().split(" ");

		for (i = 0; i < temp.length; i++)
			value[i] = Integer.parseInt(temp[i]);

		while (!is_all_visited(visited)) {
			i = find_next_node(visited);
			start = value[i];
			while (true) {
				visited[i] = 1;
				x = value[i];
				output += (i + 1) + " ";
				if (value[x - 1] == start) {
					output += x;
					break;
				}
				i = x - 1;
			}
			output += "\n";
			no_cycles++;
		}
		System.out.println(no_cycles+"\n"+output);

	}

	private static int find_next_node(int[] visited) {
		for (int i = 0; i < visited.length; i++)
			if (visited[i] == 0)
				return i;
		return -1;
	}

	private static boolean is_all_visited(int[] visited) {
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == 0)
				return false;
		}
		return true;
	}

}
