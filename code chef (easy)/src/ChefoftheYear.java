import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefoftheYear {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m, n, vote_for_chef[], a, vote_for_country[];
		String[] c = new String[33000];
		String chef[], country[], x;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());
		n = Integer.parseInt(temp.nextToken());
		m = Integer.parseInt(temp.nextToken());
		chef = new String[33000];
		country = new String[33000];
		vote_for_chef = new int[33000];
		vote_for_country = new int[33000];

		for (int i = 0; i < c.length; i++) {
			c[i] = "";
			chef[i] = "";
		}

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			x = temp.nextToken();
			a = 0;
			for (int j = 0; j < x.length(); j++)
				a += (x.charAt(j) - 64) * (j + 50);

			chef[a] = x;
			country[a] = temp.nextToken();
		}

		for (int i = 0; i < m; i++) {
			x = br.readLine();
			a = 0;
			for (int j = 0; j < x.length(); j++)
				a += (x.charAt(j) - 64) * (j + 50);
			vote_for_chef[a]++;

			x = country[a];
			a = 0;
			for (int j = 0; j < x.length(); j++)
				a += (x.charAt(j) - 64) * (j + 50);
			vote_for_country[a]++;
			c[a] = x;
		}

		int max = 0, max_index = 0;
		for (int i = 0; i < vote_for_country.length; i++) {
			if (max < vote_for_country[i]) {
				max = vote_for_country[i];
				max_index = i;
			} else if (max == vote_for_country[i]) {
				if (c[i].compareTo(c[max_index]) < 0) {
					max = vote_for_country[i];
					max_index = i;
				}
			}
		}
		System.out.println(c[max_index]);

		max = 0;
		max_index = 0;
		for (int i = 0; i < vote_for_chef.length; i++) {
			if (max < vote_for_chef[i]) {
				max = vote_for_chef[i];
				max_index = i;
			} else if (max == vote_for_chef[i]) {
				if (chef[i].compareTo(chef[max_index]) < 0) {
					max = vote_for_chef[i];
					max_index = i;
				}
			}
		}
		System.out.println(chef[max_index]);
	}
}
