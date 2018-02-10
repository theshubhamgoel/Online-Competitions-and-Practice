import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CascadingStyleSheets {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m;
		int id, att, val, old_p, new_p, final_val;
		HashMap<String, String> h = new HashMap<String, String>();
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			id = Integer.parseInt(temp.nextToken());
			att = Integer.parseInt(temp.nextToken());
			val = Integer.parseInt(temp.nextToken());
			new_p = Integer.parseInt(temp.nextToken());

			String key = id + " " + att;
			String value = val + " " + new_p;
			if (!h.containsKey(key)) {
				h.put(key, value);
			} else {

				String x = h.get(key);
				temp = new StringTokenizer(x);
				temp.nextToken();
				old_p = Integer.parseInt(temp.nextToken());
				if (old_p <= new_p) {
					x = val + " " + new_p;
					h.put(key, value);
				}
			}
		}

		for (int i = 0; i < m; i++) {
			String x = h.get(br.readLine());
			temp = new StringTokenizer(x);
			final_val = Integer.parseInt(temp.nextToken());
			System.out.println(final_val);
		}
	}
}
