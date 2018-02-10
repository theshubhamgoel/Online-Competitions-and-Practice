import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class compressMe2 {
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
		char c;
		int a = 0;

		while ((s = br.readLine()) != null) {
			System.out.println(s);
			if (s.length() < 4) {
				pw.println(s);
				continue;
			}
			a = s.hashCode();
			temp = Integer.toBinaryString(a);
			y = "";

			for (int i = 0; i < Math.ceil(temp.length() / 8.0); i++) {
				x = temp.substring(i, i + 8);
				a = Integer.parseInt(x, 2);
				c = (char) a;
				y += Character.toString(c);
			}
			System.out.println(y);
			pw.println(y);
		}
		pw.flush();
	}
}
