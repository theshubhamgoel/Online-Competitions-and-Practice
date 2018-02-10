import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NuclearReactors {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, n, k, b;
		String s[] = br.readLine().split(" ");
		a = Integer.parseInt(s[0]);
		n = Integer.parseInt(s[1]);
		k = Integer.parseInt(s[2]);
		
		a=(int) (a%(Math.pow(n+1,k)));
		
		int chambers[] = new int[k];
		
		for (int i = 0; i < a; i++) {
			b = 0;
			while (b < k) {
				if (chambers[b] >= n) {
					chambers[b] = 0;
					b++;
				} else {
					chambers[b]++;
					break;
				}
			}
		}
		
		for (int i = 0; i < chambers.length; i++) {
			System.out.print(chambers[i] + " ");
		}
	}

}
