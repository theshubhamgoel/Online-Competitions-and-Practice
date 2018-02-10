import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeWayCommunications {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, r, x1, y1, x2, y2, x3, y3, r1, r2, r3;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			r = Integer.parseInt(br.readLine());
			r=r*r;
			
			temp = br.readLine().split(" ");
			x1 = Integer.parseInt(temp[0]);
			y1 = Integer.parseInt(temp[1]);

			temp = br.readLine().split(" ");
			x2 = Integer.parseInt(temp[0]);
			y2 = Integer.parseInt(temp[1]);

			temp = br.readLine().split(" ");
			x3 = Integer.parseInt(temp[0]);
			y3 = Integer.parseInt(temp[1]);

			r1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
			r2 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
			r3 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);

			if ((r >= r1 && r >= r2) || (r >= r2 && r >= r3)
					|| (r >= r1 && r >= r3)) {
				System.out.println("yes");
			} else
				System.out.println("no");

		}

	}

}
