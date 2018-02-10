import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingSort2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, o[], x;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		o = new int[100];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(temp.nextToken());
			o[x]++;
		}

		for (int i = 0; i < o.length; i++) {
			while (o[i]-- != 0) {
				System.out.print(i+" ");
			}
		}

	}
}
