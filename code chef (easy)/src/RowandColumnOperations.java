import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RowandColumnOperations {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int  q, row_no, col_no, increment, max_row_value, max_col_value;
		String[] temp;
		String temp1;
		temp = br.readLine().split(" ");
		q = Integer.parseInt(temp[1]);
		int[] row, col;
		row = new int[314159];
		col = new int[314159];

		max_col_value = 0;
		max_row_value = 0;

		for (int i = 0; i < q; i++) {
			temp1 = br.readLine();
			if (temp1.contains("Row")) {
				temp = temp1.split(" ");
				row_no = Integer.parseInt(temp[1]) - 1;
				increment = Integer.parseInt(temp[2]);
				row[row_no] += increment;

				if (max_row_value < row[row_no]) {
					max_row_value = row[row_no];
				}
			} else {
				temp = temp1.split(" ");
				col_no = Integer.parseInt(temp[1]) - 1;
				increment = Integer.parseInt(temp[2]);
				col[col_no] += increment;

				if (max_col_value < col[col_no]) {
					max_col_value = col[col_no];
				}
			}
		}
		System.out.println(max_col_value + max_row_value);
	}
}
