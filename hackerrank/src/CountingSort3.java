import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingSort3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, o[], x;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		o = new int[100];

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			x = Integer.parseInt(temp.nextToken());
			o[x]++;
		}

		for (int i = 1; i < o.length; i++) {
			o[i] += o[i - 1];
		}
		
		for (int i = 0; i < o.length; i++) {
			System.out.print(o[i]+" ");
		}

	}
}
