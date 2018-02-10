import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;
		StringTokenizer temp;

		temp = new StringTokenizer(br.readLine());
		a = Integer.parseInt(temp.nextToken());
		b = Integer.parseInt(temp.nextToken());
		c = Integer.parseInt(temp.nextToken());

		int d = solve(a, b, c);
		System.out.println(d);

	}

	private static int solve(int a, int b, int c) {

		boolean d;
		String output = "";
		// check AP

		int d1, d2;
		d1 = b - a;
		d2 = c - b;

		if (d1 == d2) {
			output += "ap_";
			d = true;
		} else {
			output += "gp_";
			d=false;
		}
		
		int no;
		if(d){
			no=(d1+c);
			output+=no;
		}else{
			d1=b/a;
			no=(d1*c);
			output+=no;
		}
		return no;
	}
}
