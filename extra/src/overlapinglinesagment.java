import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class overlapinglinesagment {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);

		int n, m, q, c, d, x;
		int a[] = new int[1000001];
		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			c = sc.nextInt();
			d = sc.nextInt();

			a[c] += 1;
			a[d + 1] -= 1;
		}

		for (int i = 1; i < a.length; i++) {
			a[i] += a[i - 1];
		}

		for (int i = 0; i < m; i++) {
			x = sc.nextInt();
			System.out.println(a[x]);
		}
	}
}
