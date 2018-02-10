import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompilerVersion {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x, y;
		StringBuilder c;
		while (true) {
			try {
				x = br.readLine();
				y = "";
				if (x.length() < 1)
					break;

				for (int i = 0; i < x.length(); i++) {
					if (x.indexOf("->") == -1) {
						y = x;
						break;
					} else {
						if (x.indexOf("//") > -1) {
							if (x.indexOf("->") > x.indexOf("//")) {
								y = x;
								break;
							} else {
								c = new StringBuilder(x);
								c.replace(x.indexOf("->"), x.indexOf("->") + 2,
										".");
								x = c.toString();
							}
						} else {
							c = new StringBuilder(x);
							c
									.replace(x.indexOf("->"),
											x.indexOf("->") + 2, ".");
							x = c.toString();
						}
					}

				}
				System.out.println(y);
			} catch (Exception e) {
				break;
			}
		}
	}
}
