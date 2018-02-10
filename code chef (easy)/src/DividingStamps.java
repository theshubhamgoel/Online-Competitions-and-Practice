import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DividingStamps {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n, sum = 0;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			sum += Integer.parseInt(temp.nextToken());

		if (sum == (n * (n + 1)) / 2)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
