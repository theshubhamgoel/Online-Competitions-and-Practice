import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a3 {

	public static void main(String[] args) throws IOException {

		int count = 0, a, b, sum;
		String x1, x2;
		for (int i = 100; i <= 200; i++) {
			a = i;
			x1 = i + "";
			sum = 0;
			for (int j = 0; j < x1.length(); j++) {
				sum += x1.charAt(j);
			}
			
			//System.out.println(sum);
			StringBuilder sb = new StringBuilder(x1);
			x2 = sb.reverse().toString();
			b = Integer.parseInt(x2);

			a = Math.abs(a - b);
			System.out.println(a);

			if (a == sum * 9)
				count++;

		}
		System.out.println(count);
	}
}
