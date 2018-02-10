import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DailyTrain {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, n, a, b, no_of_free_seat, no_of_ways = 0;
		int com[][] = new int[][] { { 0, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 0 },
				{ 2, 1, 0, 0, 0, 0 }, { 3, 3, 1, 0, 0, 0 },
				{ 4, 6, 4, 1, 0, 0 }, { 5, 10, 10, 5, 1, 0 },
				{ 6, 15, 20, 15, 6, 1 } };
		StringTokenizer temp;
		String t;

		temp = new StringTokenizer(br.readLine());
		x = Integer.parseInt(temp.nextToken())-1;
		n = Integer.parseInt(temp.nextToken());

		for (int i = 0; i < n; i++) {
			t = br.readLine();
			a = 0;
			b = 53;

			for (int j = 0; j < 9; j++) {
				no_of_free_seat = 0;

				if (t.charAt(a) == '0')
					no_of_free_seat++;
				if (t.charAt(a + 1) == '0')
					no_of_free_seat++;
				if (t.charAt(a + 2) == '0')
					no_of_free_seat++;
				if (t.charAt(a + 3) == '0')
					no_of_free_seat++;
				if (t.charAt(b) == '0')
					no_of_free_seat++;
				if (t.charAt(b - 1) == '0')
					no_of_free_seat++;
				a += 4;
				b -= 2;

				no_of_ways += com[no_of_free_seat][x];
			}
		}
		System.out.println(no_of_ways);
	}
}
