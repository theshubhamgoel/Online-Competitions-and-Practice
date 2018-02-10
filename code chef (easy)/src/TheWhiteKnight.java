import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheWhiteKnight {

	static int value[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, knight_pos_x = 0, knight_pos_y = 0, n;
		char chess[][];
		String x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			chess = new char[n][n];
			value = new int[n][n];

			for (int j = 0; j < chess.length; j++) {
				x = br.readLine();
				chess[j] = x.toCharArray();
				Arrays.fill(value[j], -1);
				if (x.contains("K")) {
					knight_pos_x = j;
					knight_pos_y = x.indexOf("K");

				}
			}

			System.out.println(compute(chess, knight_pos_x, knight_pos_y));

		}
	}

	private static int compute(char[][] chess, int knightPosX, int knightPosY) {
		int d1, d2, d3, d4, current;

		
		d1 = d2 = d3 = d4 = 0;
		if (knightPosX > chess.length - 1 || knightPosY > chess.length - 1
				|| knightPosX < 0)
			return 0;

		if (knightPosY == chess.length - 1) {
			if (chess[knightPosX][knightPosY] == 'P')
				return 1;
			return 0;
		}

		if (value[knightPosX][knightPosY] != -1)
			return value[knightPosX][knightPosY];

		if (chess[knightPosX][knightPosY] == 'P')
			current = 1;
		else
			current = 0;

		d1 += compute(chess, knightPosX + 1, knightPosY + 2) + current;
		d2 += compute(chess, knightPosX - 1, knightPosY + 2) + current;
		d3 += compute(chess, knightPosX + 2, knightPosY + 1) + current;
		d4 += compute(chess, knightPosX - 2, knightPosY + 1) + current;

		d1 = Math.max(d1, d2);
		d2 = Math.max(d3, d4);

		value[knightPosX][knightPosY] = current = Math.max(d1, d2);
		return current;
	}
}
