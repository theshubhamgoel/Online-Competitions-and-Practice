import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheSpellingProblem {

	static String[] dic;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int d;

		String text, word;
		StringTokenizer temp;

		d = Integer.parseInt(br.readLine());

		dic = new String[d];
		for (int i = 0; i < d; i++) {
			dic[i] = br.readLine();
		}

		text = br.readLine();

		temp = new StringTokenizer(text);

		int n = temp.countTokens();
		for (int i = 0; i < n; i++) {
			word = temp.nextToken();

			if (n % 50 == 0) {
				if (check_word(word)) {
					System.out.print(word + " ");
				} else {

					// check for insert an irrelevant letter;

					String w;
					w = get_for_insert(word);

					System.out.print(w + " ");
				}

			} else {
				System.out.print(word + " ");
			}
		}
	}

	private static String get_for_insert(String word) {

		StringBuilder ss;

		for (int i = 0; i < word.length(); i++) {
			ss = new StringBuilder(word);
			ss = ss.deleteCharAt(i);
			if (check_word(ss.toString())) {
				return ss.toString();
			}
		}

		return word;
	}

	private static boolean check_word(String word) {

		for (int i = 0; i < dic.length; i++) {
			if (word.equals(dic[i]))
				return true;
		}
		return false;
	}

}
