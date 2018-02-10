
public class Smallestmultiple {

	public static void main(String[] args) {
		int n = 1;
		for (int i = 2; i < 21; i++) {
			if (n % i == 0)
				continue;
			else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						i = i / j;
						j--;
					}
				}
				n *= i;
			}
		}
		System.out.println(n);
	}

}
