import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StrategicWarehouseplacements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, count = 0, a[], b[];
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		
		a = new int[m];
		b = new int[m];

		for (int i = 0; i < m; i++) {
			temp = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(temp.nextToken());
			b[i] = Integer.parseInt(temp.nextToken());
		}

		ArrayList<Integer> allcity = new ArrayList<Integer>();
		ArrayList<Integer> tcity = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			allcity.add(i + 1);
		}

		while (!allcity.isEmpty()) {
			tcity.clear();
			tcity.add(allcity.get(0));
			allcity.remove(0);

			for (int i = 0; i < tcity.size(); i++) {
				int x = tcity.get(i);
				for (int j = 0; j < m; j++) {
					if (x == a[j] || x == b[j]) {
						if (!tcity.contains(a[j])) {
							tcity.add(a[j]);
							if (allcity.indexOf(a[j]) != -1)
								allcity.remove(allcity.indexOf(a[j]));
						}
						if (!tcity.contains(b[j])) {
							tcity.add(b[j]);
							if (allcity.indexOf(b[j]) != -1)
								allcity.remove(allcity.indexOf(b[j]));
						}
					}
				}

			}
			count++;
		}
		System.out.println(count);
	}
}
