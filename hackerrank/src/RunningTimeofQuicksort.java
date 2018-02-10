import java.util.Arrays;
import java.util.Scanner;

public class RunningTimeofQuicksort {

	static int c = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar1 = new int[n];
		int[] ar2 = new int[n];
		for (int i = 0; i < n; i++) {
			ar1[i] = in.nextInt();
			ar2[i] = ar1[i];
		}

		System.out.println(insertionSort(ar1));
		System.out.println(quickSort(ar2));
		System.out.println(Arrays.toString(ar2));

	}

	public static int insertionSort(int array[]) {
		int n = array.length, count = 0;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				count++;
				i--;
			}
			array[i + 1] = key;
		}
		return count;
	}

	public static int quickSort(int array[]) {
		return quickSort(array, 0, array.length - 1);
	}

	public static int quickSort(int array[], int start, int end) {
		int i = start;
		int k = end;

		if (end - start >= 1) {
			int pivot = array[start];

			while (k > i) {
				while (array[i] <= pivot && i <= end && k > i) {
					i++;
				}
				
				while (array[k] > pivot && k >= start && k >= i)
					k--;

				if (k > i) {
					swap(array, i, k);
					c++;
				}
			}
			c++;
			swap(array, start, k);
			quickSort(array, start, k - 1);
			quickSort(array, k + 1, end);

			return c;
		} else {
			return 0;
		}
	}

	public static void swap(int array[], int index1, int index2)
	// pre: array is full and index1, index2 < array.length
	// post: the values at indices 1 and 2 have been swapped
	{
		int temp = array[index1]; // store the first value in a temp
		array[index1] = array[index2]; // copy the value of the second into the
		// first
		array[index2] = temp; // copy the value of the temp into the second
	}

}
