import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, ds, dt, d;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			ds = Integer.parseInt(temp.nextToken());
			dt = Integer.parseInt(temp.nextToken());
			d = Integer.parseInt(temp.nextToken());

			if (ds >= d + dt)
				System.out.println(ds - d - dt);
			else if (dt >= d + ds)
				System.out.println(dt - d - ds);
			else if (ds + dt <= d)
				System.out.println(d - ds - dt);
			else
				System.out.println("0");

		}
	}
}
