import java.io.IOException;

public class sevendigitnumber {

	public static void main(String[] args) throws IOException {

		int a = 1234567, b = 9876543, count = 0;
		int x, y, z;
		for (int i = a; i <= b; i++) {
			if (checkunique(i)) {
				count++;
				String s = String.valueOf(i);
				x = (s.charAt(0) - 48) * (s.charAt(1) - 48)
						* (s.charAt(2) - 48);
				y = (s.charAt(2) - 48) * (s.charAt(3) - 48)
						* (s.charAt(4) - 48);
				z = (s.charAt(4) - 48) * (s.charAt(5) - 48)
						* (s.charAt(6) - 48);

				if (x == y && x == z) {
					System.out.println(s.charAt(3));
					break;
				}
			}
		}

		//System.out.println(count);

	}

	private static boolean checkunique(int i) {
		int[] a = new int[10];

		String s = String.valueOf(i);
		for (int j = 0; j < s.length(); j++) {
			a[s.charAt(j) - 48]++;
		}

		int count = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] != 0)
				count++;
		}

		if (count != 7)
			return false;
		else
			return true;
	}
}
