import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GemStones {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, gem[][];
		String s;
		n = Integer.parseInt(br.readLine());

		gem = new int[n][26];
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				gem[i][s.charAt(j)-97]=1;
			}
		}
		
		int count=0;
		for (int i = 0; i < 26; i++) {
			int flag=1;
			for (int j = 0; j < n; j++) {
				if(gem[j][i]==0){
					flag=0;
					break;
				}
			}
			if(flag==1)
				count++;
		}

		System.out.println(count);
	}

}
