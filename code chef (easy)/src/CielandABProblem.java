import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CielandABProblem {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;
		String[] temp;
		String s;

		temp = br.readLine().split(" ");
		a = Integer.parseInt(temp[0]);
		b = Integer.parseInt(temp[1]);

		c = a - b;
		s = String.valueOf(c);

		char[] ch = s.toCharArray();
		if (ch[0] != '1') {
			ch[0] = '1';
		} else
			ch[0] = '2';

		s = String.valueOf(ch);
		System.out.println(s);

	}

}
