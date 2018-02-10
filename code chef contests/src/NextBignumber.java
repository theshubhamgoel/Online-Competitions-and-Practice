import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextBignumber {

	static int swap1, swap2;
	static int[] digit_visited;
	static String s;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		int[] arr;
		StringTokenizer temp;
		StringBuilder sb;
		String ans;
		char c;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());
			s = "";
			for (int j = 0; j < n; j++) {
				s += temp.nextToken();
			}

			swap1 = swap2 = -1;
			digit_visited = new int[10];
			solve(0, n - 1);

			if (swap1 == -1 || swap1 >= swap2) {
				System.out.println(s);
				System.out.println("NO NXTBIG");
			} else {

				sb = new StringBuilder(s);
				c = s.charAt(swap1);
				sb.setCharAt(swap1, s.charAt(swap2));
				sb.setCharAt(swap2, c);

				arr = new int[n - swap1 - 1];
				for (int j = swap1 + 1; j < n; j++)
					arr[j - swap1 - 1] = sb.charAt(j);

				Arrays.sort(arr);

				for (int j = swap1 + 1; j < n; j++) {
					sb.setCharAt(j, (char) arr[j - swap1 - 1]);
				}

				ans = sb.toString();
				System.out.println(s);
				System.out.println(ans);
			}
		}
	}

	private static void solve(int start, int end) {

		if (all_digit_visited() || start >= end)
			return;

		if (digit_visited[s.charAt(end) - 48] == 0) {
			digit_visited[s.charAt(end) - 48] = 1;
			for (int j = end - 1; j >= start; j--) {
				if (s.charAt(end) > s.charAt(j) && swap1 < j) {

					swap1 = j;
					swap2 = end;

					start = j;
					break;
				}
			}
		}

		solve(start, end - 1);

	}

	private static boolean all_digit_visited() {
		for (int i = 0; i < digit_visited.length; i++) {
			if (digit_visited[i] == 0)
				return false;
		}
		return true;
	}

}
