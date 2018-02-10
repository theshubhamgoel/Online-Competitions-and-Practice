import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class decompressMe {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("newfile.txt"));
		File file = new File("newfile2.txt");

		if (file.createNewFile())
			System.out.println("File is created!");
		else
			System.out.println("File already exists.");
		PrintWriter pw = new PrintWriter(file);

		String s, temp, x = "";
		int a = 0;

		while ((s = br.readLine()) != null) {
			System.out.println(s);
			x = "";

			for (int i = 0; i < s.length(); i++) {
				temp = Integer.toBinaryString(s.charAt(i));
				while (temp.length() != 8)
					temp = "0" + temp;
				x += temp;
			}

			x = x.substring(x.length() % 6, x.length());

			for (int i = 0; i < x.length(); i++) {
				temp = x.substring(i, i + 6);
				a = Integer.parseInt(temp, 2);
				temp = Character.toString((char) a);
				pw.print(temp);
			}

		}
		{
			if (s.length() < 4) {
				System.out.println("Wrong Data");
				System.exit(0);
			}

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 32) {
					a = s.charAt(i) - 32 + 62;
				} else if (s.charAt(i) == 46) {
					a = s.charAt(i) - 46 + 63;
				} else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					a = s.charAt(i) - 65;
				} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					a = s.charAt(i) - 97 + 26;
				} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
					a = s.charAt(i) - 48 + 52;
				} else {

				}
				temp = Integer.toBinaryString(a);
				while (temp.length() < 6)
					temp = "0" + temp;

				x += temp;
			}

			int length = (int) (Math.ceil(x.length()) / 8.0);

			for (int i = 0; i < length; i++) {
				temp = x.substring(i, i + 8);
				a = Integer.parseInt(temp, 2);
				temp = Character.toString((char) a);
				pw.print(temp);
			}
		}
		pw.flush();
	}
}
