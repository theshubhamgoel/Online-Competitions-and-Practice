import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheMorningCommute {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, x, l, f,total_time;
		String[] temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			
			total_time=0;
			for (int j = 0; j < n; j++) {
				temp = br.readLine().split(" ");
				x = Integer.parseInt(temp[0]);
				l = Integer.parseInt(temp[1]);
				f = Integer.parseInt(temp[2]);
					
				while(x<total_time){
					x=x+f;
				}	
				total_time=x+l;
			}
			
			System.out.println(total_time);
		}
	}
}
