import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefandRemissness {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0,a,b;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			a=Integer.parseInt(temp.nextToken());
			b=Integer.parseInt(temp.nextToken());
			
			System.out.println(Math.max(a, b)+" "+(a+b));
		}
	}
}
