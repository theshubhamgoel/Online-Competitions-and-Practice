import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ChefandBracketPairs {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, count, flag;
		int[] a;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());
		a = new int[n];

		temp = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp.nextToken());
		}

		int x = (int) (Math.pow(2, n) - 1);
		String b;
		Stack<Integer> s = new Stack<Integer>();
		count = 0;

		for (int i = 0; i <= x; i++) {
			b = Integer.toBinaryString(i);
			while (b.length() != n)
				b = "0" + b;

			// System.out.println(b);
			s.clear();
			flag = 1;
			for (int j = 0; j < b.length(); j++) {
				if (b.charAt(j) == '0')
					continue;

				if (a[j] < 0) {
					s.push(a[j]);
				} else if (s.size() != 0 && s.peek() == -a[j]) {
					s.pop();
				} else {
					flag = 0;
					break;
				}
				// System.out.println(s.size());
			}

			// System.out.println(flag);
			if (s.isEmpty() && flag == 1)
				count++;
		}

		System.out.println(count);
	}
}
