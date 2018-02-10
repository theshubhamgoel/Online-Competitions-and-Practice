import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class countRecAndSquar {
	static int x, y;
	static ArrayList<String> visited = new ArrayList<String>();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please give the value of x Sir : ");
		x = Math.abs(Integer.parseInt(br.readLine()));

		System.out.print("Please give the value of y Sir : ");
		y = Math.abs(Integer.parseInt(br.readLine()));

		int ans1 = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				ans1 += countRect(i, j, i + 1, j + 1);
			}
		}

		visited.clear();
		int ans2 = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				ans2 += countSquar(i, j, i + 1, j + 1);
			}
		}
		System.out.println("No of Rectangle is : " + ans1);
		System.out.println("No of Squar is : " + ans2);
	}

	private static int countRect(int startx, int starty, int endx, int endy) {
		int count = 0;
		if (endx > x || endy > y)
			return 0;

		if (endx - startx > 0 && endy - starty > 0) {
			String x = startx + " " + starty + " " + endx + " " + endy;
			if (!visited.contains(x)) {
				visited.add(x);
				// System.out.println(x);
				count++;
				count += countRect(startx, starty, endx + 1, endy);
				count += countRect(startx, starty, endx, endy + 1);
			}
		}
		return count;
	}

	private static int countSquar(int startx, int starty, int endx, int endy) {
		int count = 0;
		if (endx > x || endy > y)
			return 0;

		if (endx - startx > 0 && endy - starty > 0) {
			String x = startx + " " + starty + " " + endx + " " + endy;
			if (!visited.contains(x)) {
				if (endx - startx == endy - starty) {
					visited.add(x);
					// System.out.println(x);
					count++;
				}
				count += countSquar(startx, starty, endx + 1, endy);
				count += countSquar(startx, starty, endx, endy + 1);
			}

		}
		return count;
	}

}
