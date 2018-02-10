import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandTheRightTriangles {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, x1, x2, x3, y1, y2, y3, count = 0;
		String[] temp;
		float d1, d2, d3;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");
			x1 = Integer.parseInt(temp[0]);
			y1 = Integer.parseInt(temp[1]);
			x2 = Integer.parseInt(temp[2]);
			y2 = Integer.parseInt(temp[3]);
			x3 = Integer.parseInt(temp[4]);
			y3 = Integer.parseInt(temp[5]);

			d1 = (x1 - x2) * (x1 - x2) + (y1 - y2)
					* (y1 - y2);
			d2 = (x1 - x3) * (x1 - x3) + (y1 - y3)
					* (y1 - y3);
			d3 = (x3 - x2) * (x3 - x2) + (y3 - y2)
					* (y3 - y2);

			if (d1 + d2 == d3 || d2 + d3 == d1 || d3 + d1 == d2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
