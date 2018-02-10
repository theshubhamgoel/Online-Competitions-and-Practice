import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime_palin {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		int num = 0;
		int i = 0;
		int j = 0;
		int result = 0;
		int rnum = 0;
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));

		num = Integer.parseInt(buff.readLine());

		for (j = num;; j++) {
			for (i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					break;
				}
			}
			
			//System.out.println(result);
			if (i > j / 2) {
				result = j;
				//System.out.println(j);
				rnum=0;
				while (result > 0) {
					rnum = rnum * 10 + result % 10;
					result /= 10;
				}
				
				//System.out.println(rnum);
				if (j == rnum)
					break;
			}

			
			
		}
		System.out.println(j);
	}
}