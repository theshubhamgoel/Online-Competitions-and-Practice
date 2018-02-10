import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CopyPaste {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0,n;
		int []a;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n=Integer.parseInt(br.readLine());
			
			a=new int[100001];
			temp = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[Integer.parseInt(temp.nextToken())]++;;
			}
			
			int count=0;
			for (int k = 0; k < 100001; k++) {
				if(a[k]!=0)
					count++;
			}
			
			System.out.println(count);
		}
	}
}
