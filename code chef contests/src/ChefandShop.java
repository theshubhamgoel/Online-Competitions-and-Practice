import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefandShop {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, k;
		long ans;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());
		int cost[], weight[];
		float ratio[];

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			k = Integer.parseInt(temp.nextToken());

			cost = new int[n];
			weight = new int[n];
			ratio = new float[n];

			for (int j = 0; j < n; j++) {
				temp = new StringTokenizer(br.readLine());
				cost[j] = Integer.parseInt(temp.nextToken());
				weight[j] = Integer.parseInt(temp.nextToken());

				ratio[j] = weight[j] / (float) cost[j];
			}

			ans = 0;
			insertionSort(ratio, cost, weight);
			System.out.println(Arrays.toString(ratio));
			System.out.println(Arrays.toString(cost));
			System.out.println(Arrays.toString(weight));
			
			for (int j = n - 1; j >= 0; j--) {
				if (cost[j] <= k) {
					k -= cost[j];
					ans += weight[j];
				}
			}
			

			System.out.println(ans);

		}
	}

	public static void insertionSort(float array[], int cost[], int weight[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			float key = array[j];
			int key1 = cost[j], key2 = weight[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				cost[i + 1] = cost[i];
				weight[i + 1] = weight[i];
				i--;
			}
			array[i + 1] = key;
			cost[i + 1] = key1;
			weight[i + 1] = key2;
		}
	}

}
