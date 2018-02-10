public class Sumsquaredifference {

	public static void main(String[] args) {
		int sum1, sum2;
		sum1 = sum2 = 0;
		sum1 = 50 * 101 * 50 * 101;
		for (int i = 1; i <= 100; i++) {
			sum2 += i * i;
		}
		System.out.println(sum1-sum2);

	}

}
