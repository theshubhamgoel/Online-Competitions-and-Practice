import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelpingLira {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, x1, x2, x3, y1, y2, y3, max_area_index = 1, min_area_index = 1;
		float max_area = 0, min_area = 1000000000, area;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(temp.nextToken());
			y1 = Integer.parseInt(temp.nextToken());
			x2 = Integer.parseInt(temp.nextToken());
			y2 = Integer.parseInt(temp.nextToken());
			x3 = Integer.parseInt(temp.nextToken());
			y3 = Integer.parseInt(temp.nextToken());

			area = (float) Math
					.abs(0.5 * (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x2 * y1)
							+ (x3 * y2) + (x1 * y3))));

			if (area >= max_area) {
				max_area = area;
				max_area_index = i + 1;
			}
			if (area <= min_area) {
				min_area = area;
				min_area_index = i + 1;
			}

		}
		System.out.println(min_area_index + " " + max_area_index);
	}
}
