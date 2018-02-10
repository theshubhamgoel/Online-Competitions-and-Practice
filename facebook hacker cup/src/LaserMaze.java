import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LaserMaze {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, m, n;
		int[][] maze;
		StringTokenizer temp;
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			m = Integer.parseInt(temp.nextToken());
			n = Integer.parseInt(temp.nextToken());

			maze = new int[m][n];
			for (int j = 0; j < m; j++) {
				s = temp.nextToken();
				for (int j2 = 0; j2 < n; j2++) {
					if (s.charAt(j2) == '#')
						maze[j][j2] = -1;
					
					if (s.charAt(j2) == '.')
						maze[j][j2] = 100;

					if (s.charAt(j2) == 'S')
						maze[j][j2] = 10;

					if (s.charAt(j2) == 'G')
						maze[j][j2] = 20;

					if (s.charAt(j2) == '^')
						maze[j][j2] = 1;

					if (s.charAt(j2) == '>')
						maze[j][j2] = 2;

					if (s.charAt(j2) == 'v')
						maze[j][j2] = 3;

					if (s.charAt(j2) == '<')
						maze[j][j2] = 4;

				}
			}
		}
	}
}
