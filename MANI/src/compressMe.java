import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class compressMe {
	static char hexArr[] = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
			'F' };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		File file = new File("newfile.txt");

		if (file.createNewFile())
			System.out.println("File is created!");
		else
			System.out.println("File already exists.");
		PrintWriter pw = new PrintWriter(file);

		String s, temp, ans = "", x, y;
		int a = 0;

		while ((s = br.readLine()) != null) {
			System.out.println(s);
			x = y = temp = "";
			if (s.length() % 2 == 0)
				temp += "00";

			for (int i = 0; i < s.length(); i++) {
				a = s.charAt(i);
				temp = Integer.toString(a, 16);
				while (temp.length() != 2)
					temp = "0" + temp;

				for (int j = 0; j < temp.length(); j++) {
					a = getCorrespondingVal(temp.charAt(j));
					x = Integer.toBinaryString(a);

					while (x.length() != 4)
						x = "0" + x;
					y+=x;
				}
				
			}

			while (x.length() % 8 != 0)
				x = "0" + x;

			for (int i = 0; i < x.length() / 8; i++) {
				temp = x.substring(i, i + 8);
				a = Integer.parseInt(temp, 2);
				temp = Character.toString((char) a);
				pw.print(temp);
			}
		}
		pw.flush();
	}

	private static int getCorrespondingVal(char c) {
		for (int i = 0; i < hexArr.length; i++) {
			if (hexArr[i] == c)
				return i;
		}
		return -1;
	}
}
