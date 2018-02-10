import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class YetAnotherNumberGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_cases=0,temp;
		test_cases=Integer.parseInt(br.readLine());
		
		for(int i=0;i<test_cases;i++){
			temp=Integer.parseInt(br.readLine());
			if(temp%2==0)
				System.out.println("ALICE");
			else
				System.out.println("BOB");
		}
		
	}

}
