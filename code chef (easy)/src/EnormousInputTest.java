import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnormousInputTest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = 0;
		int count = 0, x, k;

		String s="";
		s=br.readLine();
		String nk[]=s.split(" ");
		test_case = Integer.parseInt(nk[0]);
		k = Integer.parseInt(nk[1]);
		for (int i = 0; i < test_case; i++) {
			x = Integer.parseInt(br.readLine());
			if (x % k == 0)
				count++;
		}
		System.out.println(count);
	}
}
