import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Botsavesprincess {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, bot_pos_x, bot_pos_y, princess_pos_x, princess_pos_y, diff;
		char[][] grid;
		String temp;
		n = Integer.parseInt(br.readLine());

		bot_pos_x = bot_pos_y = princess_pos_x = princess_pos_y = 0;
		grid = new char[n][n];
		for (int i = 0; i < n; i++) {
			temp = br.readLine();
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = temp.charAt(j);

				if (grid[i][j] == 'm') {
					bot_pos_x = i;
					bot_pos_y = j;
				} else if (grid[i][j] == 'p') {
					princess_pos_x = i;
					princess_pos_y = j;
				}
			}
		}

		if (bot_pos_y < princess_pos_y)
			temp = "DOWN";
		else
			temp = "UP";

		diff = Math.abs(bot_pos_y - princess_pos_y);
		for (int i = 0; i < diff; i++) {
			System.out.println(temp);
		}

		if (bot_pos_x < princess_pos_x)
			temp = "RIGHT";
		else
			temp = "LEFT";

		diff = Math.abs(bot_pos_x - princess_pos_x);
		for (int i = 0; i < diff; i++) {
			System.out.println(temp);
		}

	}
}
