import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class confrenceRoom {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int x, group = 5;
		int[] seats = new int[20];
		Arrays.fill(seats, 0);
		int[] AC = new int[20];
		Arrays.fill(AC, 0);
		int[] LIGHT = new int[20];
		Arrays.fill(LIGHT, 0);
		int[] FAN = new int[20];
		Arrays.fill(FAN, 0);

		while (true) {

			System.out.println("Welcome to your conference room Sir.");
			System.out.println("==========================================");
			System.out.println("What do you want to do Sir");
			System.out.println("1. Enter to confrence room");
			System.out.println("2. Leave confrence room");
			System.out.println("3. Check the status of all the seats in conference room");
			System.out.println("4. Check the current status of AC");
			System.out.println("5. Check the current status of fans");
			System.out.println("6. Check the current status of lights");
			System.out.println("7. Check the current status of smock detector");
			System.out.println("8. Exit");
			System.out.print("Please give your choice Sir : ");
			s = br.readLine();

			switch (s) {
			case "1":
				System.out.println("Sir,Please take the seat which is available ");

				displayCurrentStatus(seats, "* ");
				System.out.println("Sir where do you want to seat [1-20] : ");
				try {
					x = Integer.parseInt(br.readLine());
					if (x > 20 || x < 1)
						System.out.println("Thats not a valid seat Sir");
					else {
						if (seats[x - 1] != 0) {
							System.out.println("Sorry Sir, This seat is already occupied.");
						} else {
							seats[x - 1] = 1;
							x = ((x - 1) / group) * group;
							for (int i = x; i < x + group; i++) {
								FAN[i] = 1;
								AC[i] = 1;
								LIGHT[i] = 1;
							}

							System.out.println("Take a seat Sir, I have turn on AC, light and fan for you Sir");
						}
					}
				} catch (Exception e) {
					System.out.println("Thats not a valid seat Sir");
				}
				break;
			case "2":
				System.out.println("Sir,Please select the seat to make it vacant.");

				displayCurrentStatus(seats, "* ");
				System.out.println("Sir where do you want to seat [1-20] : ");
				try {
					x = Integer.parseInt(br.readLine());
					if (x > 20 || x < 1)
						System.out.println("Thats not a valid seat Sir");
					else {
						if (seats[x - 1] == 0) {
							System.out.println("Sorry Sir, This seat is allready vacant.");
						} else {
							seats[x - 1] = 0;
							int flag = 1;
							x = ((x - 1) / group) * group;
							for (int i = x; i < x + group; i++) {
								if (seats[i] == 1) {
									flag = 0;
									break;
								}
							}

							if (flag == 1) {
								for (int i = x; i < x + group; i++) {
									FAN[i] = 0;
									AC[i] = 0;
									LIGHT[i] = 0;
								}
							}
							System.out.println("Thanks for using conference room Sir");
						}
					}
				} catch (Exception e) {
					System.out.println("Thats not a valid seat Sir");
				}

				break;
			case "3":
				displayCurrentStatus(seats, "* ");
				break;
			case "4":
				displayCurrentStatus(AC, "A ");
				break;
			case "5":
				displayCurrentStatus(FAN, "F ");
				break;
			case "6":
				displayCurrentStatus(LIGHT, "L ");
				break;
			case "7":
				System.out.println("Our company police will not allow you to smock inside company premise and no one can dare to break our policy. \n So currently no one is smocking.");
				break;
			case "8":
				return;

			default:
				System.out.println();
				System.err.println("That's not a valid option Sir");
				System.out.println();
			}

			br.readLine();
		}
	}

	private static void displayCurrentStatus(int[] seats, String x) {

		System.out.println("Current Status of conference room");
		System.out.println("==========================================");
		for (int i = 0; i < 10; i++) {
			System.out.print(seats[i] == 0 ? "- " : x);
		}

		System.out.println();
		for (int i = 10; i < 20; i++) {
			System.out.print(seats[i] == 0 ? "- " : x);
		}
		System.out.println();
		System.out.println();
	}
}
