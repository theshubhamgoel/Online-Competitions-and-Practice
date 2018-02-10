import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CuttingRecipes {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, j, factor;
		int orignal_persentage_of_ingredients[];
		test_cases = Integer.parseInt(br.readLine());
		String temp[];

		for (int i = 0; i < test_cases; i++) {
			temp = br.readLine().split(" ");

			orignal_persentage_of_ingredients = new int[temp.length - 1];

			for (j = 0; j < temp.length - 1; j++) {
				orignal_persentage_of_ingredients[j] = Integer
						.parseInt(temp[j + 1]);
			}

			factor = gcd(orignal_persentage_of_ingredients);

			for (j = 0; j < temp.length - 1; j++) {
				orignal_persentage_of_ingredients[j] /= factor;
				System.out.print(orignal_persentage_of_ingredients[j] + " ");
			}
			System.out.println();
		}
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

	private static int gcd(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++)
			result = gcd(result, input[i]);
		return result;
	}
}
