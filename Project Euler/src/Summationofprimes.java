public class Summationofprimes {

	public static void main(String[] args) {
		long sum = 0;
		for (long i = 2; i < 2000000; i++) {
			if (isPrime(i))
				sum += i;

		}
		System.out.println(sum);

	}

	static boolean isPrime(Long n) {
		// check if n is a multiple of 2
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (long i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
