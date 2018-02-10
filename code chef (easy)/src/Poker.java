import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Poker {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, no_of_card[], suit[], bigflag;
		String temp1, temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp1 = br.readLine();
			no_of_card = new int[13];
			suit = new int[4];

			bigflag = 0;

			for (int j = 0; j < temp1.length(); j++) {
				if (temp1.charAt(j) == 'S')
					suit[0]++;
				else if (temp1.charAt(j) == 'H')
					suit[1]++;
				else if (temp1.charAt(j) == 'D')
					suit[2]++;
				else if (temp1.charAt(j) == 'C')
					suit[3]++;

				if (temp1.charAt(j) == 'A')
					no_of_card[0]++;
				else if (temp1.charAt(j) == '2')
					no_of_card[1]++;
				else if (temp1.charAt(j) == '3')
					no_of_card[2]++;
				else if (temp1.charAt(j) == '4')
					no_of_card[3]++;
				else if (temp1.charAt(j) == '5')
					no_of_card[4]++;
				else if (temp1.charAt(j) == '6')
					no_of_card[5]++;
				else if (temp1.charAt(j) == '7')
					no_of_card[6]++;
				else if (temp1.charAt(j) == '8')
					no_of_card[7]++;
				else if (temp1.charAt(j) == '9')
					no_of_card[8]++;
				else if (temp1.charAt(j) == 'T')
					no_of_card[9]++;
				else if (temp1.charAt(j) == 'J')
					no_of_card[10]++;
				else if (temp1.charAt(j) == 'Q')
					no_of_card[11]++;
				else if (temp1.charAt(j) == 'K')
					no_of_card[12]++;

			}

			temp = Arrays.toString(suit);
			if (temp.contains("5")) {
				temp = Arrays.toString(no_of_card);
				if (temp1.contains("A") && temp1.contains("K")
						&& temp1.contains("Q") && temp1.contains("J")
						&& temp1.contains("T")) {
					System.out.println("royal flush");
					bigflag = 1;
				} else if (temp.contains("1, 1, 1, 1, 1")) {
					System.out.println("straight flush");
					bigflag = 1;
				} else {
					System.out.println("flush");
					bigflag = 1;
				}
			}

			temp = Arrays.toString(no_of_card);

			if (bigflag == 0) {
				if (temp.contains("4"))
					System.out.println("four of a kind");
				else if (temp.contains("3")) {
					if (temp.contains("2")) {
						System.out.println("full house");
					} else {
						System.out.println("three of a kind");
					}
				} else if (temp.contains("1, 1, 1, 1, 1")) {
					System.out.println("straight");
				} else if (temp.contains("2")) {
					if (temp.indexOf("2") != temp.lastIndexOf("2")) {
						System.out.println("two pairs");
					} else {
						System.out.println("pair");
					}
				} else
					System.out.println("high card");

			}
		}
	}
}