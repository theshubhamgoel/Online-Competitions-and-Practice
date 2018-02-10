import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DiscrepanciesintheVotersList {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2, n3, i;
		String[] temp;
		Set<Integer> set = new HashSet<Integer>();

		temp = br.readLine().split(" ");
		n1 = Integer.parseInt(temp[0]);
		n2 = Integer.parseInt(temp[1]);
		n3 = Integer.parseInt(temp[2]);

		int[] N1 = new int[n1];
		int[] N2 = new int[n2];
		int[] N3 = new int[n3];

		for (i = 0; i < n1; i++)
			N1[i] = Integer.parseInt(br.readLine());
		for (i = 0; i < n2; i++)
			N2[i] = Integer.parseInt(br.readLine());
		for (i = 0; i < n3; i++)
			N3[i] = Integer.parseInt(br.readLine());

		for (i = 0; i < N1.length; i++) {
			if (Arrays.binarySearch(N2, N1[i]) >= 0
					|| Arrays.binarySearch(N3, N1[i]) >= 0) {
				set.add(N1[i]);
			}
		}

		for (i = 0; i < N2.length; i++) {
			if (Arrays.binarySearch(N1, N2[i]) >= 0
					|| Arrays.binarySearch(N3, N2[i]) >= 0) {
				set.add(N2[i]);
			}
		}

		for (i = 0; i < N3.length; i++) {
			if (Arrays.binarySearch(N1, N3[i]) >= 0
					|| Arrays.binarySearch(N2, N3[i]) >= 0) {
				set.add(N3[i]);
			}
		}

		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(set.size());
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
