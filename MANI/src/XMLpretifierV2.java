import java.io.BufferedReader;
import java.io.InputStreamReader;

class XMLpretifierV2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello Sir, Please give input");
		String xml = br.readLine().trim();
		xml = xml.replaceAll(">\\s+<", "><");
		xml = xml.replaceAll("\\s+", " ");
		int noOfSpace = 0;

		for (int i = 0; i < xml.length(); i++) {
			if (xml.charAt(i) == '<') {
				if (i + 1 < xml.length()) {
					if (xml.charAt(i + 1) != '/' && xml.charAt(i + 1) != '?') {
						printSpaces(noOfSpace);
						noOfSpace += 4;
					} else if (xml.charAt(i + 1) == '/') {
						noOfSpace -= 4;
						printSpaces(noOfSpace);
					}
				}
				System.out.print("<");
			} else if (i + 1 < xml.length() && i - 1 >= 0) {
				if (xml.charAt(i) == '>' && xml.charAt(i + 1) != '<' && xml.charAt(i - 1) != '?') {
					System.out.print(">");
					printSpaces(noOfSpace);
				}else{
					System.out.print(xml.charAt(i));
				}
			} else {
				System.out.print(xml.charAt(i));
			}
		}
	}

	private static void printSpaces(int noOfSpace) {
		System.out.println();
		for (int i = 0; i < noOfSpace; i++) {
			System.out.print(" ");
		}
	}

}
