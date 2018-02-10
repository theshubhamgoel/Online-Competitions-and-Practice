import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class checksum {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.println("Sir, Please give your input for which I need to calcualate checksum");
		int sum = 0;
		s = br.readLine();
		
		//actual code
		for (int i = 0; i < s.length(); i++)
			sum += i % 2 == 0 ? (s.charAt(i) > 47 && s.charAt(i) < 58) ? (s.charAt(i) - 48) * 2 : s.charAt(i) * 2 : 0;
		//ends here
		System.out.println("Sir, checksum is : " + s + String.valueOf(sum == 0 ? 0 : 10 - sum % 10));
	}
}
