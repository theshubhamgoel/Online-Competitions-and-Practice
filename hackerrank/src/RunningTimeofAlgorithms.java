import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RunningTimeofAlgorithms {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		temp = new StringTokenizer(br.readLine());

		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		System.out.println(insertionSort(a));
	}

	public static int insertionSort(int array[]) {
		int n = array.length,count=0;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				count++;
				i--;
			}
			array[i + 1] = key;
		}
		return count;
	}
}
