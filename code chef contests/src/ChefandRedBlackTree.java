import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChefandRedBlackTree {

	static int a[];
	static int b[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, source, destination, index, n, result;
		int[] path;
		StringTokenizer temp;
		String query, color1, color2, t;
		test_cases = Integer.parseInt(br.readLine());

		color1 = "black";
		color2 = "red";
		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());

			a = new int[67];
			b = new int[67];
			path = new int[134];
			result = 0;
			query = temp.nextToken();

			if (query.equals("Qi")) {
				t = color2;
				color2 = color1;
				color1 = t;
			} else {

				source = Integer.parseInt(temp.nextToken());
				destination = Integer.parseInt(temp.nextToken());

				if (source == destination) {
					n = (int) (Math.log10(source) / Math.log10(2)) + 1;

					if (query.equals("Qb")) {
						if (color1.equals("black")) {
							if (n % 2 == 1) {
								result++;
							}
						} else {
							if (n % 2 == 0) {
								result++;
							}
						}
					} else {
						if (color1.equals("black")) {
							if (n % 2 == 0) {
								result++;
							}
						} else {
							if (n % 2 == 1) {
								result++;
							}
						}

					}
					System.out.println(result);
					continue;
				}

				find_path_to_root(source, "source");
				find_path_to_root(destination, "desti");

				int count_a, count_b, count_path;

				if (source == 1 || destination == 1) {

					if (source == 1) {
						path = b;
					}

					if (destination == 1)
						path = a;

					count_path = get_number_of_element(path);
					if (query.equals("Qb")) {

						for (int j = 0; j < count_path; j++) {
							n = (int) (Math.log10(path[j]) / Math.log10(2)) + 1;
							if (color1.equals("black")) {
								if (n % 2 == 1) {
									result++;
								}
							} else {
								if (n % 2 == 0) {
									result++;
								}
							}
						}
					} else if (query.equals("Qr")) {

						for (int j = 0; j < count_path; j++) {
							n = (int) (Math.log10(path[j]) / Math.log10(2)) + 1;
							if (color1.equals("black")) {
								if (n % 2 == 0) {
									result++;
								}
							} else {
								if (n % 2 == 1) {
									result++;
								}
							}
						}
					}
					System.out.println(result);
					continue;

				}

				// System.out.println(Arrays.toString(a));
				// System.out.println(Arrays.toString(b));

				count_a = get_number_of_element(a) - 1;
				count_b = get_number_of_element(b) - 1;

				while (true) {
					if (a[count_a] == b[count_b]) {
						count_a--;
						count_b--;
						if (count_a < 0 || count_b < 0)
							break;
					} else {
						break;
					}
				}

				count_a++;
				index = 0;
				for (int j = 0; j <= count_a; j++) {
					path[index++] = a[j];
				}

				for (int j = 0; j <= count_b; j++) {
					path[index++] = b[j];
				}

				count_path = get_number_of_element(path);
				 //System.out.println(Arrays.toString(path));

				if (query.equals("Qb")) {

					for (int j = 0; j < count_path; j++) {
						n = (int) (Math.log10(path[j]) / Math.log10(2)) + 1;
						if (color1.equals("black")) {
							if (n % 2 == 1) {
								result++;
							}
						} else {
							if (n % 2 == 0) {
								result++;
							}
						}
					}
				} else if (query.equals("Qr")) {
					result = 0;
					for (int j = 0; j < count_path; j++) {
						n = (int) (Math.log10(path[j]) / Math.log10(2)) + 1;

						if (color1.equals("black")) {
							if (n % 2 == 0) {
								result++;
							}
						} else {
							if (n % 2 == 1) {
								result++;
							}
						}
					}
				}
				System.out.println(result);
			}
		}

	}

	private static int get_number_of_element(int[] a2) {
		int count = 0;
		for (int j = 0; j < a2.length; j++) {
			if (a2[j] == 0)
				break;
			else
				count++;
		}
		return count;
	}

	private static void find_path_to_root(int source, String desti) {
		if (desti == "source") {
			a[0] = source;
			int index = 1;
			while (source != 1) {
				source /= 2;
				a[index++] = source;
			}
		} else {
			b[0] = source;
			int index = 1;
			while (source != 1) {
				source /= 2;
				b[index++] = source;
			}
		}
	}

}
