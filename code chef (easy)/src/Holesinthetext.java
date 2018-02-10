import java.util.Scanner;

public class Holesinthetext {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = 0, count = 0;
		String s = "";
		int[] hole = { 1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0,
				0, 0, 0, 0, 0, 0, 0 };
		test_case = sc.nextInt();
		for (int j = 0; j < test_case; j++) {
			s = sc.next();
			count = 0;
			for (int i = 0; i < s.length(); i++) {
				count = count + hole[(int) s.charAt(i) - 65];
			}
			System.out.println(count);
		}
	}
}
