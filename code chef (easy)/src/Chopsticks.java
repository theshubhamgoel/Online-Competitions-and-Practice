import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chopsticks {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, d, count = 0;

		String[] temp;
		int l[];
		boolean used[];
		temp = br.readLine().split(" ");
		n = Integer.parseInt(temp[0]);
		d = Integer.parseInt(temp[0]);
		used = new boolean[n];

		l = new int[n];
		for (int i = 0; i < n; i++)
			l[i] = Integer.parseInt(br.readLine());

		Arrays.sort(l);

		for (int i = 1; i < l.length; i++) {
			if (used[i] == true || used[i - 1] == true)
				continue;

			if (d < (l[i] - l[i - 1]))
				continue;

			used[i] = used[i - 1] = true;
			count++;
		}
		System.out.println(count);
	}
}
