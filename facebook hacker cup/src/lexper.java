import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lexper {

	public static boolean nextPermutation(int[] p) {

		/*
		 * 1> Find the largest index k such that a[k] < a[k + 1]. If no such
		 * index exists, the permutation is the last permutation. 2> Find the
		 * smallest index l such that a[k] < a[l]. Since k + 1 is such an index,
		 * l is well defined and satisfies k < l. 3> Swap a[k] with a[l]. 4>
		 * Reverse the sequence from a[k + 1] up to and including the final
		 * element a[n].
		 */

		int a = p.length - 2;
		while (a >= 0 && p[a] >= p[a + 1]) {
			a--;
		}
		if (a == -1) {
			return false;
		}
		int b = p.length - 1;
		while (p[b] <= p[a]) {
			b--;
		}

		int t = p[a];
		p[a] = p[b];
		p[b] = t;
		for (int i = a + 1, j = p.length - 1; i < j; i++, j--) {
			t = p[i];
			p[i] = p[j];
			p[j] = t;
		}
		return true;
	}

	private static int factorial(int i) {
		if (i <= 1) {
			return 1;
		}

		int p = 1;
		for (int j = 1; j <= i; j++) {
			p *= j;
		}
		return p;
	}

	public static String nThPermutation(List<String> in, int index) {

		if (in.size() == 1)
			return in.get(0);

		int N = in.size();
		int residue = index;
		int noOfPerm = factorial(N - 1);
		int outputIndex = 0;

		if (noOfPerm < residue) {
			outputIndex = residue / noOfPerm;
			if (residue % noOfPerm == 0) {
				outputIndex--;
			}
			residue = residue - (outputIndex * noOfPerm);
		}
		String indexDigit = in.get(outputIndex);
		in.remove(outputIndex);
		return indexDigit + nThPermutation(in, residue);
	}

	public static void main(String[] args) {

		String[] in1 = { "e", "h", "t" };
		List<String> inp = new ArrayList<String>(Arrays.asList(in1));
		System.out.println("Nth permutation elem:\n" + nThPermutation(inp, 4));
		System.out.println("\n--------------------------");

	}
}