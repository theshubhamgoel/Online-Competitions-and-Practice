import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GuessingNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, k;
		double p[], o;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		k = Integer.parseInt(temp.nextToken());
		p = new double[n];

		temp = new StringTokenizer(br.readLine());

		double max = 0, max_index = 0;
		for (int i = 0; i < n; i++) {
			p[i] = Double.parseDouble(temp.nextToken());
			if (max < p[i]) {
				max = p[i];
				max_index = i;
			}
		}

		for (int i = 0; i < k; i++) {
			
		}
	}
}
