import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLeadGame {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lead1=0,lead2=0;
		int no_of_round = 0,a = 0,b = 0;
		String s[];
		no_of_round = Integer.parseInt(br.readLine());

		for (int i = 0; i < no_of_round; i++) {
			s=br.readLine().split(" ");
			a+=Integer.parseInt(s[0]);
			b+=Integer.parseInt(s[1]);
			if(a>=b){
				lead1=(lead1>(a-b)?lead1:(a-b));
			}
			else{
				lead2=(lead2>(b-a)?lead2:(b-a));
			}
		}
		if(lead1>=lead2){
			System.out.println("1 "+lead1);
		}else
			System.out.println("2 "+lead2);
	}
}
