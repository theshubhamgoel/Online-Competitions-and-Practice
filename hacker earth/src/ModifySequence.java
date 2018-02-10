import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModifySequence {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, t, flag;
		int a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		temp = new StringTokenizer(br.readLine());
		a = new int[n];
		flag = 1;

		a[0] = Integer.parseInt(temp.nextToken());
		for (int j = 1; j < a.length; j++) {
			t = Integer.parseInt(temp.nextToken());

			if (t < a[j - 1]) {
				flag = 0;
				break;
			} else {
				a[j] = t - a[j - 1];
				a[j - 1] = 0;
			}
		}

		if (a[0] != 0 || a[n - 1] != 0 || flag == 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
