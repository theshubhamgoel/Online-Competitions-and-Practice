import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, j;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			j=Integer.parseInt(br.readLine());
			
			if(j%2==0){
				System.out.println(j);
			}else
				System.out.println(j-1);	
		}
	}
}
