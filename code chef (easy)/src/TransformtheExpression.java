import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TransformtheExpression {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int iterations = Integer.parseInt(br.readLine());
		String line = "", out = "";
		char c;
		int flag = 0;

		Stack<Character> st = new Stack<Character>();
		for (int it = 0; it < iterations; it++) {
			line = br.readLine();
			out = "";
			st.removeAllElements();
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				flag = assign_flag(c);
				if (flag != 0) {
					if (st.isEmpty()) {
						st.push(c);
					} else if (flag == 5) {
						while (st.peek() != '(') {
							out += st.pop();
						}
						st.pop();
					}else if(flag==4){
						st.push(c);
					}
					else if (assign_flag(st.peek()) > flag) {
						st.push(c);
					} else {
						while (assign_flag(st.peek()) <= flag) {
							out += st.pop();
							if (st.isEmpty())
								break;
						}
						st.push(c);
					}
				} else {
					out += c;
				}
			}
			while(!st.isEmpty()){
				out+=st.pop();
			}
			System.out.println(out);
		}
	}

	private static int assign_flag(char c) {
		int flag = 0;
		if (c == '+')
			flag = 1;
		else if (c == '-')
			flag = 1;
		else if (c == '*')
			flag = 2;
		else if (c == '/')
			flag = 2;
		else if (c == '^')
			flag = 3;
		else if (c == '(')
			flag = 4;
		else if (c == ')')
			flag = 5;
		else
			flag = 0;
		return flag;
	}

}
