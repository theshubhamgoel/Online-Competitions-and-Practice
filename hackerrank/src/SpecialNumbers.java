import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, no[];
		n = Integer.parseInt(br.readLine());
		no = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					count++;
			}
			no[i] = count;
		}

		long sum = 0;
		boolean value[] = new boolean[n + 1];

		for (int i = 1; i <=n; i++) {
			
			if (value[no[i]] == false)
				sum += i;
			value[no[i]] = true;

		}

		System.out.println(sum);
	}
}
