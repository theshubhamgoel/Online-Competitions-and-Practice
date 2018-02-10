import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ceil_ab {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a,b,c;
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		
		String s[]=buff.readLine().split(" ");
		a=Integer.parseInt(s[0]);
		b=Integer.parseInt(s[1]);
		c=a-b;
		
		if(c%10==9)
			c--;
		else
			c++;
		System.out.println(c);
	}

}
