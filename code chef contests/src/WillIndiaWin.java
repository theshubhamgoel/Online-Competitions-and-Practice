import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WillIndiaWin {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int test_cases = 0, ans, count;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			ans = Integer.parseInt(temp.nextToken());
			for (int j = 1; j < 15; j++) {
				ans = ans ^ Integer.parseInt(temp.nextToken());
			}
			
			count=0;
			String s=Integer.toBinaryString(ans);
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='1')
					count++;
			}
			
			if(count>Integer.parseInt(br.readLine()))
				pw.println("YES");
			else
				pw.println("NO");

		}
		pw.flush();
	}
}
