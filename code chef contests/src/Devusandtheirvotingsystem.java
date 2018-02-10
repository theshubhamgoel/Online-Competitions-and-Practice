import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Devusandtheirvotingsystem {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			if (n == 1) {
				System.out.println("1.000000");
				continue;
			}

			int l = (int) Math.pow(n, n) - 1;
			double sum = 0;
			int a=0;

			for (int j = 1; j <= l; j++) {
				String x = Integer.toString(j, n);

				while (x.length() != n)
					x = "0" + x;

				int flag = 0;
				for (int k = 1; k < x.length(); k++) {
					if (x.charAt(k) == x.charAt(k - 1)
							|| (k != x.length() - 1 && x.charAt(k) == x
									.charAt(k + 1))) {
						flag = 1;
						break;
					}
				}

				if (flag == 1)
					continue;

				a++;
				int freq[] = new int[n];
				for (int k = 0; k < x.length(); k++) {
					freq[x.charAt(k)-48]++;
				}
				
				Arrays.sort(freq);
				int count=1;
				
				for (int k = freq.length-1; k > 0; k--) {
					if(freq[k]!=freq[k-1])
						break;
					
					count++;
				}
				
				//System.out.println(x+" : "+count);
				sum+=count;

			}
			
			sum/=a;
			sum=Math.round(sum*1000000)/1000000.0;
			DecimalFormat f = new DecimalFormat("##.000000");
			System.out.println(f.format(sum));
			
		}
	}
}
