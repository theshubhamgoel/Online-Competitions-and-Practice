import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSortPart2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int s, arr[];
		StringTokenizer temp;
		s = Integer.parseInt(br.readLine());
		arr = new int[s];
		temp = new StringTokenizer(br.readLine());

		for (int i = 0; i < s; i++) {
			arr[i] = Integer.parseInt(temp.nextToken());
		}

		insertIntoSorted(arr);
	}

	private static void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void insertIntoSorted(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int x = arr[i], j = i-1;

			while (j >= 0 && arr[j] > x) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
			printarray(arr);
		}
	}

}
