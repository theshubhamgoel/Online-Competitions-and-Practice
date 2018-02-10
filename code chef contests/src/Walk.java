import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Walk {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, max;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			max = Integer.parseInt(temp.nextToken());
			
			int x;
			for (int j = 1; j < n; j++) {
				x = Integer.parseInt(temp.nextToken())+j;
				if (x >= max) 
					max = x;
			}

			System.out.println(max);

		}
	}
}
