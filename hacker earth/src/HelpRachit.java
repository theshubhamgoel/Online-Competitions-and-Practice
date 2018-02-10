import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HelpRachit {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, count, mat[];
		String x[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			count = 0;
			try{
			n = Integer.parseInt(br.readLine());

			for (int j = 0; j < n; j++) {
				
				x = br.readLine().split(" ");
				mat = new int[n];
				int j3 = 0;
				for (int j2 = 0; j2 < x.length; j2++) {
					try {
						mat[j3] = Integer.parseInt(x[j2]);
						j3++;
					} catch (Exception e) {
					}
				}

				if (isPrime(mat[j])) {
					count++;
				}
				if (isPrime(mat[n - j - 1])) {
					if (n % 2 != 0 && (n - 1) / 2 == j)
						count--;
					count++;
				}
			}
			double f;
			if (n % 2 == 0) {
				f = (count / (2.0 * n) * 100);
			}else{
				f = (count / ((2.0 * n)-1) * 100);
			}
			NumberFormat formatter = new DecimalFormat();
			formatter.setMaximumFractionDigits(6);
			formatter.setMinimumFractionDigits(6);
			String y = formatter.format(f);
			System.out.println(y);
			}catch(Exception e){
				
			}
		}

	}

	static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
