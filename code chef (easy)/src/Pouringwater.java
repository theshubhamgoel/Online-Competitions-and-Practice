import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pouringwater {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, a, b, c;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			c = Integer.parseInt(br.readLine());

			if (a == c || b == c) {
				System.out.println(1);
				continue;
			}else{
				
			}

		}
	}

}
