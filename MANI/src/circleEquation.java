import java.io.BufferedReader;
import java.io.InputStreamReader;

public class circleEquation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x1, y1, x2, y2;

		System.out.print("Sir, Please give the value of x1 : ");
		x1 = Double.parseDouble(br.readLine());

		System.out.print("Sir, Please give the value of x2 : ");
		y1 = Double.parseDouble(br.readLine());

		System.out.print("Sir, Please give the value of y1 : ");
		x2 = Double.parseDouble(br.readLine());

		System.out.print("Sir, Please give the value of y2 : ");
		y2 = Double.parseDouble(br.readLine());

		double radius, centerX, centerY, m, c;
		double midx, midy;
		midx = (x2 + x1) / 2.0;
		midy = (y2 + y1) / 2.0;
		System.out.println("\nThese are few of the equation for the circle, Sir : \n");
		if (y2-y1 != 0) {
			m = -1.0 * (x2 - x1) / (y2 - y1);
			c = midy - m * midx;
			for (int i = 1; i <= 10; i++) {
				centerX = midx + .01 * i;
				centerY = m * centerX + c;

				radius = (Math.pow(x2 - centerX, 2)) + Math.pow(y2 - centerY, 2);
				printEquation(radius, centerX, centerY);
			}
		} else {
			centerX = midx;
			for (int i = 1; i <= 10; i++) {
				centerY = midy + .01 * i;

				radius = (Math.pow(x2 - centerX, 2)) + Math.pow(y2 - centerY, 2);
				printEquation(radius, centerX, centerY);
			}
		}

	}

	private static void printEquation(double radius, double centerX, double centerY) {
		System.out.println("(x - " + centerX + " )^2 + (y - " + centerY + " )^2 = " + radius);
	}

}
