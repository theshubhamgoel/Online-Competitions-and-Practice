import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {

	static void partition(int[] ar, int start, int end) {
		if (end - start < 1) {
			return;
		}

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		int x = ar[start];
		for (int i = start + 1; i <= end; i++) {
			if (ar[i] > x)
				a2.add(ar[i]);
			else
				a1.add(ar[i]);
		}

		for (int i = 0; i < a1.size(); i++) {
			ar[start + i] = a1.get(i);
		}

		int k = start + a1.size();
		ar[k] = x;

		for (int i = 0; i < a2.size(); i++) {
			ar[k + 1 + i] = a2.get(i);
		}

		partition(ar, start, k - 1);
		if (k - 1 - start >= 1) {
			for (int i = start; i <= k - 1; i++) {
				System.out.print(ar[i] + " ");
			}
			System.out.println();
		}

		partition(ar, k + 1, k + a2.size());
		if (a2.size() - 1 >= 1) {
			for (int i = k + 1; i <= k + a2.size(); i++) {
				System.out.print(ar[i] + " ");
			}
			System.out.println();
		}
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}

		quisksort(ar);
	}

	private static void quisksort(int[] ar) {
		partition(ar, 0, ar.length - 1);
		printArray(ar);

	}
}
