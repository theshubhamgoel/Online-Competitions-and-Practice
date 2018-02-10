import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheArmory {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int need_a, need_b, need_c, have_a, have_b, have_c, price_a, price_b, price_c, max_a, max_b, max_c, min;
		long money, cost_for_onecrow, count = 0, cost;
		StringTokenizer temp;

		temp = new StringTokenizer(br.readLine());
		need_a = Integer.parseInt(temp.nextToken());
		need_b = Integer.parseInt(temp.nextToken());
		need_c = Integer.parseInt(temp.nextToken());

		temp = new StringTokenizer(br.readLine());
		have_a = Integer.parseInt(temp.nextToken());
		have_b = Integer.parseInt(temp.nextToken());
		have_c = Integer.parseInt(temp.nextToken());

		temp = new StringTokenizer(br.readLine());
		price_a = Integer.parseInt(temp.nextToken());
		price_b = Integer.parseInt(temp.nextToken());
		price_c = Integer.parseInt(temp.nextToken());

		money = Long.parseLong(br.readLine());

		cost_for_onecrow = need_a * price_a + need_b * price_b + need_c
				* price_c;
		if (need_a == 0 && need_b == 0 && need_c == 0) {
			System.out.println(Double.POSITIVE_INFINITY);
		} else {

			if (need_a != 0 && need_b != 0 && need_c != 0) {
				max_a = have_a / need_a;
				max_b = have_b / need_b;
				max_c = have_c / need_c;

				min = max_a < max_b ? (max_a < max_c ? max_a : max_c)
						: (max_b < max_c ? max_b : max_c);
				count += min;

				have_a = have_a - max_a * min;
				have_b = have_b - max_b * min;
				have_c = have_c - max_c * min;
			}
			
			cost = 0;

			while (cost <= money) {
				if (have_a == 0 && have_b == 0 && have_c == 0)
					break;

				if (have_a >= need_a)
					have_a -= need_a;
				else {
					cost += (need_a - have_a) * price_a;
					have_a = 0;
				}

				if (have_b >= need_b)
					have_b -= need_b;
				else {
					cost += (need_b - have_b) * price_b;
					have_b = 0;
				}

				if (have_c >= need_c)
					have_c -= need_c;
				else {
					cost += (need_c - have_c) * price_c;
					have_c = 0;
				}

				if (cost <= money)
					count++;
				else
					break;
			}

			if (cost > money)
				System.out.println(count);
			else {
				money -= cost;

				count += money / cost_for_onecrow;
				System.out.println(count);
			}
		}
	}
}
