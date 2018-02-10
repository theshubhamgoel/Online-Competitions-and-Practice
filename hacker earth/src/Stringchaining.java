import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Stringchaining {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		String name[];
		n = Integer.parseInt(br.readLine());
		name = new String[n];

		for (int i = 0; i < n; i++) {
			name[i] = br.readLine();
		}

		int index = -1, next = -1, flag = 0;
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if (name[i].charAt(name[i].length() - 1) == name[j].charAt(0)
						&& i != j) {
					flag = 1;
					next = j;
					break;
				}
			}
			if (flag == 1) {
				index = i;
			}
		}

		if (index == -1)
			return;

		System.out.println(index+" "+next);
		int k = 0, last;
		ArrayList<String> o = new ArrayList<String>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		while (true) {
			ArrayList<Integer> in = new ArrayList<Integer>();
			last = index;
			String x = "";
			in.add(index);
			int count = 0;
			System.out.println(index);
			while (next != -1) {
				x += name[next] + "\n";
				index = next;
				next = -1;
				in.add(index);
				count++;

				for (int j = 0; j < name.length; j++) {
					flag = 1;
					if (name[index].charAt(name[index].length() - 1) == name[j]
							.charAt(0)) {
						flag = 2;
						for (int j1 = 0; j1 < in.size(); j1++) {
							if (j == in.get(j1)) {
								flag = 0;
								break;
							}
						}
						if (flag == 0)
							continue;
						else if (flag == 2) {
							next = j;
							break;
						}
					}
				}
			}

			o.add(x);
			c.add(count);

			k++;
			if (k == 3)
				break;

			index = -1;
			next = -1;
			flag = 0;
			for (int i = last + 1; i < name.length; i++) {
				for (int j = 0; j < name.length; j++) {
					if (name[i].charAt(name[i].length() - 1) == name[i]
							.charAt(0)) {
						flag = 1;
						next = j;
						break;
					}
				}
				if (flag == 1) {
					index = i;
				}
			}

			if (index == -1)
				break;

		}

		int m = 0, in = 0;
		for (int i = 0; i < c.size(); i++) {
			if (m < c.get(i)) {
				m = c.get(i);
				in = i;
			}
		}

		System.out.println(o.get(0));

	}
}
