import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AnkitandRaceTeam {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, k;
		StringTokenizer temp;
		long s[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());
			
			s=new long[n];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < s.length; j++) {
				s[j]=Long.parseLong(temp.nextToken());
			}
			
			Arrays.sort(s);
			
			
		}
	}

}
