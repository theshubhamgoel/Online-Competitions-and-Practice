import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PhysicsClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, f, count;
		int[] height;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			f = Integer.parseInt(temp.nextToken());

			count = 0;
			height = new int[n];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < height.length; j++) {
				height[j] = Integer.parseInt(temp.nextToken());
				while (height[j] % f == 0) {
					height[j] /= f;
				}
			}

			Arrays.sort(height);
			long ans = 0;
			for (int i1 = 0; i1 < height.length; i1++) {
				if (i1 > 0 && height[i1 - 1] != height[i1]) {
					count = 0;
				}
				ans += count;
				count++;
			}
			System.out.println(ans);
		}

	}
}
