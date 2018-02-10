import java.util.*;

public class QuickSort1Partition {

	static void partition(int[] ar) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		int x = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > x)
				a2.add(ar[i]);
			else
				a1.add(ar[i]);
		}
		
		int k=0;
		for (int i = 0; i < a1.size(); i++) {
			ar[i]=a1.get(i);
		}
		
		ar[a1.size()]=x;
		
		for (int i = 0; i < a2.size(); i++) {
			ar[a1.size()+i+1]=a2.get(i);
		}
		
		printArray(ar);

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
		partition(ar);
	}
}
