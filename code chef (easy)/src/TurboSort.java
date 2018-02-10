import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TurboSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		PrintWriter pw = new PrintWriter(System.out);
		n = Integer.parseInt(br.readLine());
		int arr[] = new int[1000001];
		for (int j = 0; j < n; j++)
			arr[Integer.parseInt(br.readLine())]++;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				pw.println(i);
				arr[i]--;
				i--;
			}
		}
		pw.flush();
	}
}
