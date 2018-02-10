import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ComplementaryCouples {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		long arr[];
		long k;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		k = Long.parseLong(temp.nextToken());
		arr = new long[n];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(temp.nextToken());
		}

		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		int i = 0, j = n - 1;
		int flag = 0;
		while (i < j) {
			if (arr[i] + arr[j] == k) {
				flag = 1;
				break;
			} else if (arr[i] + arr[j] < k)
				i++;
			else
				j--;
		}

		if (flag == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
