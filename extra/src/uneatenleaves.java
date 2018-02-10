import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class uneatenleaves {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n, k;
		int a[];

		n = sc.nextInt();
		k = sc.nextInt();

		a = new int[k];
		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(countUneatenLeaves(n, a));

	}

	static int countUneatenLeaves(int N, int[] A) {

		boolean b[] = new boolean[N + 1];

		for (int i = 0; i < A.length; i++) {
			int j = 1;
			while (1L * A[i] * j <= N) {
				//System.out.println(A[i]);
				b[A[i] * j++] = true;
			}
		}

		int count = 0;
		for (int i = 1; i < b.length; i++) {
			if (b[i] == false)
				count++;
		}

		//System.out.println(Arrays.toString(b));
		return count;

	}
}
