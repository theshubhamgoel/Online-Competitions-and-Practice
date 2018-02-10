import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleElephantandStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, k, flag;
		String[] temp, a;
		temp = br.readLine().split(" ");
		k = Integer.parseInt(temp[0]);
		n = Integer.parseInt(temp[1]);

		String b;
		a = new String[k];
		for (int i = 0; i < k; i++) {
			a[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			b = br.readLine();
			if (b.length() > 46) {
				System.out.println("Good");
				continue;
			}
			flag = 0;
			for (int j = 0; j < a.length; j++) {
				if (b.contains(a[j])) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				System.out.println("Good");
			else
				System.out.println("Bad");

		}
	}
}
