import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TimetoStudyGraphswithChef {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m, k, v1, v2, mod = 1000000009;
		long n, l1, l2;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());

		n = Long.parseLong(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		k = Integer.parseInt(temp.nextToken());

		Edge e[] = new Edge[k];

		for (int i = 0; i < k; i++) {
			temp = new StringTokenizer(br.readLine());

			l1 = Long.parseLong(temp.nextToken());
			v1 = Integer.parseInt(temp.nextToken());
			l2 = Long.parseLong(temp.nextToken());
			v2 = Integer.parseInt(temp.nextToken());

			e[i] = new Edge(l1, v1, l2, v2);
		}

		Arrays.sort(e);

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].l1 + " " + e[i].v1 + " " + e[i].l2 + " "
					+ e[i].v2);
		}

		long ans = 0, previous_ans;
		if (k == 0) {
			ans = cal_modpow(m, n, mod);
			System.out.println(ans);
		} else {

			if (e[0].l1 == 0 || e[0].l1 == 1)
				previous_ans = ans += 1;
			else
				previous_ans = ans += cal_modpow(m, e[0].l1 - 1, mod);

			// System.out.println(ans);
			for (int i = 1; i < e.length - 1; i++) {
				if (e[i].l1 == e[i - 1].l2)
					ans += previous_ans;
				else if (e[i].l1 < e[i - 1].l2) {
					ans += previous_ans + cal_modpow(m, e[i].l1 - 1, mod);
				} else
					previous_ans = ans += cal_modpow(m, e[i].l1 - e[i - 1].l2
							- 1, mod)
							+ cal_modpow(m, e[i].l1 - 1, mod);
			}

			System.out.println(ans);
		}

		if (e[m - 1].l2 < n)
			ans += cal_modpow(m, n - e[m - 1].l2, mod);

		System.out.println(ans);
	}

	private static long cal_modpow(int m, long n, int j) {

		long ans = 1;
		for (int j2 = 0; j2 < n; j2++) {
			ans = (1L * ans * m) % j;
		}
		return ans;
	}
}

class Edge implements Comparable<Edge> {
	long l1, l2;
	int v1, v2;

	public Edge(long l1, int v1, long l2, int v2) {
		this.l1 = l1;
		this.v1 = v1;
		this.l2 = l2;
		this.v2 = v2;
	}

	public int compareTo(Edge e) {

		long compareQuantity = e.l2;

		// ascending order
		return (int) (this.l2 - compareQuantity);

		// descending order
		// return (int) (compareQuantity - this.l2);

	}

}
