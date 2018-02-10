import java.util.ArrayList;

public class Largestprimefactor {

	public static void main(String[] args) {
		long x = 600851475143l;
		ArrayList<Long> al = new ArrayList<Long>();

		for (long i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				al.add(i);
			}
		}

		for (int i = al.size() - 1; i >= 0; i--) {
			if (isPrime(al.get(i))) {
				System.out.println(al.get(i));
				break;
			}
		}

	}

	static boolean isPrime(Long n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
