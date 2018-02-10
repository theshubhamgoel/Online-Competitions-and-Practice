	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class FindDigits {
	
		public static void main(String[] args) throws IOException {
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			int test_cases = 0,count,n;
			String s;
			test_cases = Integer.parseInt(br.readLine());
	
			for (int i = 0; i < test_cases; i++) {
				s = br.readLine();
				count=0;
				
				n=Integer.parseInt(s);
				for (int j = 0; j < s.length(); j++) {
					if(s.charAt(j)!='0'){
						if(n%(s.charAt(j)-48)==0){
							count++;
						}
					}
				}
				System.out.println(count);
	
			}
		}
	}
