import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChefandComplexStringCoverage {

	static int[] len, price;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
		int n, d;
		String s;
		s = sc.next();

		n = sc.nextInt();
		d = sc.nextInt();

		len = new int[n];
		price = new int[n];

		for (int i = 0; i < n; i++) {
			len[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}

		ArrayList<Integer> ar = sovle(0, n, d);

	}

	private static ArrayList<Integer> sovle(int i, int remaining_len,
			int remaining_money) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		if (remaining_len <= 0 || remaining_money <= 0)
			al.add(-1);
		
		

		return null;
	}
}
