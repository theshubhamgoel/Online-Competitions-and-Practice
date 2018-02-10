import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TheFullCountingSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw =new PrintWriter(System.out);

		int n, freq[], x, v[];
		StringTokenizer temp;
		String value[];
		n = Integer.parseInt(br.readLine());
		freq = new int[100];
		value = new String[n];
		v = new int[n];

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			x = v[i] = Integer.parseInt(temp.nextToken());
			freq[x]++;

			if ((i + 1) <= n / 2)
				value[i] = "-";
			else
				value[i] = temp.nextToken();

		}

		for (int i = 1; i < freq.length; i++) {
			freq[i] += freq[i - 1]; 	
		}

		String output[] = new String[n];
		for (int i = v.length - 1; i >= 0; i--) {
			output[--freq[v[i]]] = value[i];
		}
		
		for (int i = 0; i < output.length; i++) {
			pw.print(output[i]+" ");
		}
		pw.flush();
	}
}
