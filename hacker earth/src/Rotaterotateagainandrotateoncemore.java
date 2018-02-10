import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Rotaterotateagainandrotateoncemore {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, l, r, k, student[], d[], flag;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		student = new int[n];
		char c;

		Student s = new Student(0, n - 1, 0);
		ArrayList<Student> parts = new ArrayList<Student>();
		parts.add(s);

		for (int i = 0; i < m; i++) {
			temp = new StringTokenizer(br.readLine());
			c = temp.nextToken().charAt(0);

			if (c == 'C') {
				l = Integer.parseInt(temp.nextToken()) - 1;
				r = Integer.parseInt(temp.nextToken()) - 1;
				k = Integer.parseInt(temp.nextToken());

				int x = parts.size();
				for (int j = 0; j < x; j++) {
					if (parts.get(j).l == l && parts.get(j).r == r)
						parts.get(j).k += k;
					else {
						flag = 0;
						if (parts.get(j).l < l && parts.get(j).r >= l) {
							s = new Student(parts.get(j).l, l - 1, k);
							parts.add(s);
							s = new Student(l, parts.get(j).r, k + k);
							parts.add(s);
							flag = 1;
						}

						if (parts.get(j).l <= r && parts.get(j).r > r) {
							s = new Student(r + 1, parts.get(j).r, k);
							parts.add(s);
							flag = 1;
						}

						if (flag == 1)
							parts.remove(j);
					}
				}
			}

			if (c == 'A') {
				l = Integer.parseInt(temp.nextToken()) - 1;
				r = Integer.parseInt(temp.nextToken()) - 1;
				k = Integer.parseInt(temp.nextToken());

				int x = parts.size();
				for (int j = 0; j < x; j++) {
					if (parts.get(j).l == l && parts.get(j).r == r)
						parts.get(j).k -= k;
					else {
						flag = 0;
						if (parts.get(j).l < l && parts.get(j).r >= l) {
							s = new Student(parts.get(j).l, l - 1, k);
							parts.add(s);
							flag = 1;
						}

						if (parts.get(j).l <= r && parts.get(j).r > r) {
							s = new Student(r + 1, parts.get(j).r, k);
							parts.add(s);
							flag = 1;
						}

						if (flag == 1)
							parts.remove(j);
					}
				}
			}

			if (c == 'Q') {
				l = Integer.parseInt(temp.nextToken()) - 1;
				r = Integer.parseInt(temp.nextToken()) - 1;
				d = new int[4];

				for (int o = 0; o < parts.size(); o++) {
					System.out.println(parts.get(o).l + " " + parts.get(o).r
							+ " " + parts.get(o).k);
				}

				d[0] = Math.max(d[0], d[1]);
				d[1] = Math.max(d[2], d[3]);

				// System.out.println(Math.max(d[0], d[1]));
				System.out.println();
			}
		}
	}

}

class Student {
	int l;
	int r;
	int k;

	public Student(int l, int r, int k) {
		this.l = l;
		this.r = r;
		this.k = k;
	}

}
