import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AmbiguousPermutations {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String temp;
		StringTokenizer st;
		int a[], b[];
		n = Integer.parseInt(br.readLine());

		while (n != 0) {
			temp = br.readLine();
			st = new StringTokenizer(temp);
			a = new int[n];
			b = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(st.nextToken());
				b[a[i] - 1] = i + 1;
			}

			if (Arrays.toString(a).equals(Arrays.toString(b)))
				System.out.println("ambiguous");
			else
				System.out.println("not ambiguous");
			n = Integer.parseInt(br.readLine());
		}
	}
}
