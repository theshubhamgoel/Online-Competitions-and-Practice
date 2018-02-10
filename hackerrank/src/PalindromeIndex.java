import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeIndex {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, start, end;
		String s;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			s = br.readLine();
			start = 0;
			end = s.length() - 1;
			int flag = -1;
			while (end - start > 0) {
				if (s.charAt(start) == s.charAt(end)) {
					start++;
					end--;
				} else {

					// first check
					if (s.charAt(start + 1) == s.charAt(end)) {
						if (check_for_palindrome(s, start + 1, end)) {
							flag = start;
							break;
						}
					}

					// second check
					if (s.charAt(start) == s.charAt(end - 1)) {
						if (check_for_palindrome(s, start, end - 1)) {
							flag = end;
							break;
						}
					}

					// if failed then
					flag = -1;
					break;

				}
			}

			System.out.println(flag);
		}
	}

	private static boolean check_for_palindrome(String s, int start, int end) {

		while (end - start > 0) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
			} else
				return false;

		}
		return true;
	}
}
