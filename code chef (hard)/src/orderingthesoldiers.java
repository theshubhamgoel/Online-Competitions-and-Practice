import java.io.*;
import java.util.*;

public class orderingthesoldiers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		StringTokenizer temp;
		StringBuffer o;
		ArrayList<Integer> out = new ArrayList<Integer>();
		test_cases = Integer.parseInt(br.readLine());

		while (test_cases-- > 0) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			out.clear();
			o = new StringBuffer();

			for (int j = 0; j < n; j++)
				out.add(j - Integer.parseInt(temp.nextToken()), j + 1);

			for (Integer x : out)
				o.append(x + " ");

			System.out.println(o);

		}
	}
}
