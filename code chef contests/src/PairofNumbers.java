import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PairofNumbers {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, sum;
		int a[];
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());

		a = new int[n];
		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		sum = Integer.parseInt(br.readLine());

		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			int temp_sum;
			for (int j = i + 1; j < a.length; j++) {
				temp_sum = a[i] + a[j];

				if (temp_sum == sum) {
					flag = 1;
					break;
				}
			}

			if (flag == 1)
				break;
		}
		
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
