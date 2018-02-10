import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class InterstellarandStellarDistances {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw =new PrintWriter(System.out);

		int test_cases = 0, n;
		int arr[], sub[];
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			arr = new int[n];
			sub = new int[n];
			temp = new StringTokenizer(br.readLine());

			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(temp.nextToken());

				for (int j2 = 0; j2 < j; j2++) {
					if (arr[j] > arr[j2])
						sub[j]++;
				}
			}
			
			for (int j = 0; j < sub.length; j++) {
				pw.print(arr[j]-sub[j]+" ");
			}
			pw.println();
		}
		pw.flush();
	}
}
