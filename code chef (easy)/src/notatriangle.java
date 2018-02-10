import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class notatriangle {

	private static int count;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, count;
		StringTokenizer temp;
		int arr[];

		n = Integer.parseInt(br.readLine());

		while (n != 0) {
			temp = new StringTokenizer(br.readLine());
			arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(temp.nextToken());
			}

			Arrays.sort(arr);
			count = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					for (int j2 = j + 1; j2 < arr.length; j2++) {
						if (arr[i] + arr[j] >= arr[j2])
							break;
						count++;
					}
				}
			}
			System.out.println(count);
			n = Integer.parseInt(br.readLine());
		}
	}

}
