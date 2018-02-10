import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TheRepeater {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int test_cases = 0, n, length[], flag, count = 0;
		String a[];
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			a = new String[n];
			length = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = br.readLine();
				length[j] = a[j].length();
			}

			insertionSort(length, a);

			String key=""+a[0].charAt(0);
			for (int j = 1; j < a[0].length(); j++) {
				if(a[0].charAt(j)!=a[0].charAt(j-1)){
					key+=a[0].charAt(j);
				}
			}
			flag = 1;
			count = 0;
			
			for (int j = a.length - 1; j > 0; j--) {
				int k1 = 0, k2 = 0;

				for (int k = 0; k < a[j].length(); k++) {
					if (k1 >= key.length() || k2 >= a[j].length())
						break;
					if (key.charAt(k1) != a[j].charAt(k2)) {
						if (k2 > 0) {
							if (a[j].charAt(k2) != a[j].charAt(k2 - 1)) {
								flag = 0;
								break;
							} else {
								k2++;
								count++;
							}
						} else {
							flag = 0;
							break;
						}
					} else {
						k1++;
						k2++;
					}
				}
				if (flag == 0)
					break;
			}

			if (flag == 1)
				pw.println("Case #" + (i + 1) + ": " + count);
			else
				pw.println("Case #" + (i + 1) + ": Fegla Won");

		}
		pw.flush();
	}

	public static void insertionSort(int array[], String s[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			String s1 = s[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				s[i + 1] = s[i];
				i--;
			}
			array[i + 1] = key;
			s[i + 1] = s1;

		}
	}

}
