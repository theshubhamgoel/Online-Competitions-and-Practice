import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StrategicWarehouseplacements1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, count = 0, a[], b[];
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		int freq[] = new int[n + 1];

		a = new int[n];
		b = new int[n];

		for (int i = 0; i < m; i++) {
			temp = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(temp.nextToken());
			b[i] = Integer.parseInt(temp.nextToken());
			freq[a[i]]++;
			freq[b[i]]++;
		}
		ArrayList<Integer> allcity = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			allcity.add(i + 1);
		}

		while (!allcity.isEmpty()) {
			int index = 0, max = 0;
			for (int i = 1; i < freq.length; i++) {
				if (freq[i] > max) {
					max = freq[i];
					index = i;
				}
			}
			
			if (index == 0) {
				allcity.remove(0);
			} else {
				for (int i = 0; i < m; i++) {
					if (a[i] == index) {
						allcity.remove(new Integer(a[i]));
						allcity.remove(new Integer(b[i]));
						a[i] = b[i] = 0;
					} else if (b[i] == index) {
						allcity.remove(new Integer(a[i]));
						allcity.remove(new Integer(b[i]));
						a[i] = b[i] = 0;
					}
				}
				
				freq = new int[n + 1];
				for (int i = 0; i < m; i++) {
					freq[a[i]]++;
					freq[b[i]]++;
				}
			}
			count++;
		}

		System.out.println(count);
	}
}
