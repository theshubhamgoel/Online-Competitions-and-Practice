import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ANeedleintheHaystack {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		
		int test_cases = 0, flag;
		int a[], b[];
		String x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			a = new int[256];
			b = new int[256];
			flag = 1;

			x = br.readLine();
			for (int j = 0; j < x.length(); j++)
				a[x.charAt(j)]++;

			x = br.readLine();
			for (int j = 0; j < x.length(); j++)
				b[x.charAt(j)]++;

			for (int j = 0; j < 256; j++) {
				if (a[j] > b[j]) {
					flag = 0;
					break;
				}
			}
			
			if(flag==1)
				pw.println("YES");
			else
				pw.println("NO");
		}
		
		pw.flush();
	}

}
