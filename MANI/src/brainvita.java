public class brainvita {

	public static void main(String[] args) {
		int[][] board = { { -1, -1, 1, 1, 1, -1, -1 }, { -1, -1, 1, 1, 1, -1, -1 }, { 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 }, { -1, -1, 1, 1, 1, -1, -1 },
				{ -1, -1, 1, 1, 1, -1, -1 } };
		brainvita b = new brainvita();
		b.printBoard(board);

		b.solve(board, 0, "");
	}

	private void solve(int[][] board, int noOfMoves, String output) {
		int x, y, direction;
		boolean isPossible;
		String temp;
		if (noOfMoves == 31) {
			System.out.println(output);
			System.exit(0);
		}

		int[][] tempBoard = new int[7][7];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (board[i][j] == -1 || board[i][j] == 0)
					continue;

				for (int j2 = 0; j2 < 4; j2++) {
					isPossible = false;
					x = i;
					y = j;
					direction = j2;
					temp = "";

					switch (direction) {
					case 0:
						if (y + 2 < 7 && board[x][y + 1] == 1 && board[x][y + 2] == 0) {
							for (int a = 0; a < 7; a++)
								for (int b = 0; b < 7; b++)
									tempBoard[a][b] = board[a][b];

							tempBoard[x][y] = 0;
							tempBoard[x][y + 1] = 0;
							tempBoard[x][y + 2] = 1;
							isPossible = true;
							temp += "RIGHT";
						}
						break;
					case 1:
						if (y - 2 >= 0 && board[x][y - 1] == 1 && board[x][y - 2] == 0) {
							for (int a = 0; a < 7; a++)
								for (int b = 0; b < 7; b++)
									tempBoard[a][b] = board[a][b];

							tempBoard[x][y] = 0;
							tempBoard[x][y - 1] = 0;
							tempBoard[x][y - 2] = 1;
							isPossible = true;
							temp += "LEFT";
						}
						break;
					case 2:
						if (x - 2 >= 0 && board[x - 1][y] == 1 && board[x - 2][y] == 0) {
							for (int a = 0; a < 7; a++)
								for (int b = 0; b < 7; b++)
									tempBoard[a][b] = board[a][b];

							tempBoard[x][y] = 0;
							tempBoard[x - 1][y] = 0;
							tempBoard[x - 2][y] = 1;
							isPossible = true;
							temp += "TOP";
						}
						break;
					case 3:
						if (x + 2 >= 0 && board[x + 1][y] == 1 && board[x + 2][y] == 0) {
							for (int a = 0; a < 7; a++)
								for (int b = 0; b < 7; b++)
									tempBoard[a][b] = board[a][b];

							tempBoard[x][y] = 0;
							tempBoard[x + 1][y] = 0;
							tempBoard[x + 2][y] = 1;
							isPossible = true;
							temp += "BOTTOM";
						}
						break;
					}

					if (isPossible) {
						String o = "(" + x + "," + y + ")" + "-->" + temp + " ";
						solve(tempBoard, noOfMoves + 1, o);

					}

				}
			}
		}
	}

	private void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
