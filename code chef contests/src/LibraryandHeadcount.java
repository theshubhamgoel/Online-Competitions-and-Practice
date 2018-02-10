import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LibraryandHeadcount {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0,n;
		String x;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n=Integer.parseInt(br.readLine());
			
			LinkedList<String> a=new LinkedList<String>();
			
			for (int j = 0; j < n; j++) {
				x=br.readLine();
				if(a.contains(x))
					a.remove(x);
				else
					a.add(x);
			}
			System.out.println(a.size());
		
		}
	}
}
