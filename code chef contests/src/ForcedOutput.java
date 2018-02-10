import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ForcedOutput {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0;
		String [][]input;
		test_cases = Integer.parseInt(br.readLine());

		input=new String[test_cases][test_cases];
		for (int i = 0; i < test_cases; i++) {
			for (int j = 0; j < input.length; j++) {
				input[i][j]=br.readLine();
			}
		}
		
		
	}
}
