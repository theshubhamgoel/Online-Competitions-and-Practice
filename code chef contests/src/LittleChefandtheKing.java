import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittleChefandtheKing {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, k;
		long n, count;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Long.parseLong(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			if (k == 1) {
				System.out.println(n);
				continue;
			}

			count = convert(n, k);
			System.out.println(count);
		}
	}
	
	public static long convert(long number, long base)
	{
	    long quotient = number / base;
	    long remainder = number % base;

	    if(quotient == 0) // base case
	    {
	        return remainder  ;   
	    }
	    else
	    {
	        return convert(quotient, base) + remainder;
	    }            
	}
}
