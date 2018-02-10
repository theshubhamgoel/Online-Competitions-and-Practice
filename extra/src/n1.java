import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, x, count = 0;
		
		System.out.println("Enter the total no of chocolates : ");
		n = Integer.parseInt(br.readLine());
		System.out.println("Enter the total no of wrapper for one chocolate : ");
		x = Integer.parseInt(br.readLine());
		
		while (n >= x) {
			n=n-x;
			n++;
			count+=x;
		}
		System.out.println(n + count);

	}

}
