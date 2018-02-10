import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MissionImpossibleNoPrefixeswillSuffix {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1, s2, ans, sub1, sub2;

		s1 = br.readLine();
		s2 = br.readLine();

		int i;
		i = Math.max(0, s1.length() - s2.length());

		ans = "";
		while (i < s1.length()) {

			sub1 = s1.substring(i, s1.length());
			sub2 = s2.substring(0, sub1.length());
			if (sub1.equals(sub2)) {
				ans = sub1;
				break;
			} else {
				i++;
			}
		}

		if (ans.length() == 0)
			System.out.println("This Message Pair is Safe!");
		else
			System.out.println(ans);
	}
}
