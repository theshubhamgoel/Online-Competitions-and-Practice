import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class rangeSum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st= new StringTokenizer(br.readLine());
		BigInteger b1=new BigInteger(st.nextToken());
		BigInteger b2=new BigInteger(st.nextToken());
		
		BigInteger sum,n,a;
		n=b1.subtract(b2);
		n=n.abs();
		a=b1.min(b2);
		BigInteger x=a.multiply(new BigInteger("2"));
		x=x.add(n);
		n=n.add(BigInteger.ONE);
		x=x.multiply(n);
		sum=x.divide(new BigInteger("2"));
		
		System.out.println(sum);
		
		
		
	}

}
