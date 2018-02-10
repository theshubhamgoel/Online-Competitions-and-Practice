import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IntrotoTutorialChallenges {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int v, n, arr[];
		StringTokenizer temp;
		v = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp.nextToken());
			if (arr[i] == v) {
				System.out.println(i);
				break;
			}
		}

	}

}
