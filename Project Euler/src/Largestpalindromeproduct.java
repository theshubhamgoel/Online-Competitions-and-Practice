public class Largestpalindromeproduct {

	public static void main(String[] args) {
		int x, max = 0;
		;
		for (int i = 100; i < 1000; i++) {
			for (int j = i; j < 1000; j++) {
				x = i * j;
				if (isPalindrome(x)) {
					if (max < x)
						max = x;
				}
			}
		}
		System.out.println(max);

	}

	private static boolean isPalindrome(int x) {
		String a = String.valueOf(x);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != a.charAt(a.length() - 1 - i))
				return false;
		}
		return true;
	}
}
