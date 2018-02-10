import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class TheWaytoaFriendsHouseIsNeverTooLong {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, j;
		double r;
		StringTokenizer temp;
		int no_of_points;
		int x[], y[];

		DecimalFormat f = new DecimalFormat();
		f.setDecimalSeparatorAlwaysShown(true);
		f.setMinimumFractionDigits(2);
		f.setMaximumFractionDigits(2);
		f.setGroupingUsed(false);

		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			br.readLine();
			no_of_points = Integer.parseInt(br.readLine());

			x = new int[no_of_points];
			y = new int[no_of_points];

			for (j = 0; j < no_of_points; j++) {
				temp = new StringTokenizer(br.readLine());
				x[j] = Integer.parseInt(temp.nextToken());
				y[j] = Integer.parseInt(temp.nextToken());
			}

			sort_points_x(x, y);

			r = 0;

			for (j = 1; j < no_of_points; j++)
				r += Math.sqrt((x[j - 1] - x[j]) * (x[j - 1] - x[j])
						+ (y[j - 1] - y[j]) * (y[j - 1] - y[j]));

			System.out.println(f.format(r));
		}
	}

	private static void sort_points_x(int[] x, int[] y) {
		int n = x.length;
		for (int j = 1; j < n; j++) {
			int key = x[j], key1 = y[j];

			int i = j - 1;
			while ((i > -1) && (x[i] > key)) {
				x[i + 1] = x[i];
				y[i + 1] = y[i];
				i--;
			}

			while ((i > -1) && (y[i] < key1) && x[i] == key) {
				x[i + 1] = x[i];
				y[i + 1] = y[i];
				i--;
			}

			x[i + 1] = key;
			y[i + 1] = key1;
		}
	}
}
