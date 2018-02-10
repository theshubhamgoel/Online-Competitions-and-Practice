import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class LittleParty {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0,n,m;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n=Integer.parseInt(temp.nextToken());
			m=Integer.parseInt(temp.nextToken());
			
			HashMap<String, Integer> list=new HashMap<String,Integer>();
			for (int j = 0; j < m; j++) {
				list.put(br.readLine(), j);
			}
			
			HashSet<String> res=new HashSet<String>();
			
			for(String key: list.keySet()){
	            String y="";
	            for (int j = 0; j < key.length(); j++) {
					y+=key.charAt(j);
					
					int l = (int) Math.pow(n, n-j-1) - 1;
					int flag=0;
					
					for (int k = 1; k <= l; k++) {
						String x = Integer.toString(k, n);

						while (x.length() != n)
							x = "0" + x;
						
						for (int o = 0; o < x.length(); o++) {
							if(x.charAt(o)=='s');
						}

						if(!list.containsKey(y)){
							flag=1;
							break;
						}
					}
				}
	        }
			
		}
	}
}
