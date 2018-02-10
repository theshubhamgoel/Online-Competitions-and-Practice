import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		char c[] = t.toCharArray();
		int count = 0, a, b, d, e;

		a = t.indexOf("C");
		b = t.indexOf("H", a);
		d = t.indexOf("E", b);
		e = t.indexOf("F", d);

		while (a > -1 && b > -1 && d > -1 && e > -1) {

			if (a < b && b < d && d < e) {
				c[a] = 'a';
				c[b] = 'a';
				c[d] = 'a';
				c[e] = 'a';
				count++;
				t = String.valueOf(c);
			} else
				break;

			a = t.indexOf("C", a);
			b = t.indexOf("H", Math.max(a, b));
			d = t.indexOf("E", Math.max(b, d));
			e = t.indexOf("F", Math.max(d, e));

		}

		System.out.println(count);

	}
}
