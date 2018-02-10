import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandtheCakeI {

	static int x11, y11, x12, y12;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, x21, y21, x22, y22, area1, area2, common_area;
		String temp1[], temp2[];
		String t, t1, t2;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			t1 = br.readLine();
			temp1 = t1.split(" ");
			x11 = Integer.parseInt(temp1[0]);
			y11 = Integer.parseInt(temp1[1]);
			x12 = Integer.parseInt(temp1[2]);
			y12 = Integer.parseInt(temp1[3]);

			t2 = br.readLine();
			temp2 = t2.split(" ");
			x21 = Integer.parseInt(temp2[0]);
			y21 = Integer.parseInt(temp2[1]);
			x22 = Integer.parseInt(temp2[2]);
			y22 = Integer.parseInt(temp2[3]);

			area1 = (x12 - x11) * (y12 - y11);
			area2 = (x22 - x21) * (y22 - y21);

			common_area = 0;

			if (check_point(x21, y21)) {
				common_area = (x12 - x21) * (y12 - y21);
			} else if (check_point(x21, y22)) {
				common_area = (x12 - x21) * (y22 - y11);
			} else if (check_point(x22, y21)) {
				common_area = (x22 - x11) * (y12 - y21);
			} else if (check_point(x22, y22)) {
				common_area = (x22 - x11) * (y22 - y11);
			}

			if (common_area == 0) {
				t = t2;
				t2 = t1;
				t1 = t;
				temp1 = t1.split(" ");
				temp2 = t2.split(" ");

				x11 = Integer.parseInt(temp1[0]);
				y11 = Integer.parseInt(temp1[1]);
				x12 = Integer.parseInt(temp1[2]);
				y12 = Integer.parseInt(temp1[3]);

				x21 = Integer.parseInt(temp2[0]);
				y21 = Integer.parseInt(temp2[1]);
				x22 = Integer.parseInt(temp2[2]);
				y22 = Integer.parseInt(temp2[3]);

				if (check_point(x21, y21))
					common_area = (x12 - x21) * (y12 - y21);
				else if (check_point(x21, y22)) {
					common_area = (x12 - x21) * (y22 - y11);
				} else if (check_point(x22, y21)) {
					common_area = (x22 - x11) * (y12 - y21);
				} else if (check_point(x22, y22)) {
					common_area = (x22 - x11) * (y22 - y11);
				}
			}

			if (t1.equals(t2)) {
				System.out.println(area1);
			} else
				System.out.println(area1 + area2 - common_area);
		}

	}

	private static boolean check_point(int x, int y) {
		if (x >= x11 && x <= x12)
			if (y >= y11 && y <= y12)
				return true;
		return false;
	}

}
