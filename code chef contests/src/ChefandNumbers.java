import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ChefandNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, count = 0, b;
		StringTokenizer temp;
		n = Integer.parseInt(br.readLine());

		temp = new StringTokenizer(br.readLine());

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int j = 0; j < n; j++) {
			l.add(Integer.parseInt(temp.nextToken()));
		}

		while (true) {
			
			if (l.size()<1)
				break;
			else {
				b = 0;
				for (int j = 0; j < l.size(); j++) {
					if (b <= l.get(j).intValue()) {
						b = l.get(j).intValue();
						l.remove(j);
						j--;
					}
				}
			}
			count++;
		}
		System.out.println(count);
	}

}
