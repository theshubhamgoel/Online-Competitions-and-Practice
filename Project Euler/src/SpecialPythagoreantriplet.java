public class SpecialPythagoreantriplet {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			for (int j = i; j <= 1000; j++) {
				for (int j2 = j; j2 <= 1000; j2++) {
					if (i + j + j2 == 1000)
						if (j2 * j2 == i * i + j * j) {
							System.out.println(i*j*j2);
							break;
						}
				}
			}

		}

	}

}
