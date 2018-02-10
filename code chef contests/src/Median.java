import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Median {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		int[] arr;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		arr = new int[n];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp.nextToken());
		}

		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));

		if (n % 2 == 0)
			System.out.println(arr[n / 2 - 1]);
		else
			System.out.println(arr[n / 2]);

	}
}
