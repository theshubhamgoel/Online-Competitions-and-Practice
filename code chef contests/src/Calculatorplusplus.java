import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Calculatorplusplus {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());

		BigInteger b1, b2, b3=null;
		b1 = new BigInteger(temp.nextToken());
		s = temp.nextToken();
		b2 = new BigInteger(temp.nextToken());
		
		if(s.equals("+"))
			b3=b1.add(b2);
		else if(s.equals("-"))
			b3=b1.subtract(b2);
		else if(s.equals("*"))
			b3=b1.multiply(b2);
		else if(s.equals("/"))
			b3=b1.divide(b2);
		else
			s="fail";
		
		if(s.equals("fail"))
			System.out.println("Invalid Operator");
		else
			System.out.println(b3);
		
		

	}
}
