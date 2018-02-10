import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefandDigitJumps {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int moves = 0, target, current;
		String s;

		s = br.readLine();
		target = s.charAt(s.length() - 1) - 48;
		current = 0;

		solve(s, current, target);
		

	}

	private static void solve(String s, int current, int target) {
		// TODO Auto-generated method stub
		
	}

}
