import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case=0,x,y,zeros=0;
		test_case=Integer.parseInt(br.readLine());
		for(int i=0;i<test_case;i++){
			x=Integer.parseInt(br.readLine());
			y=5;
			zeros=0;
			while(y<=x){
				zeros+=x/y;
				y=y*5;
			}
			System.out.println(zeros);
		}
	}

}
