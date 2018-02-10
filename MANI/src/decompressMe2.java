import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class decompressMe2 {

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
			if (s.length() < 4) {
				pw.println(s);
				continue;
			}

			x = "";
			for (int i = 0; i < s.length(); i++) {
				a = s.charAt(i);
				x += Integer.toBinaryString(a);
			}
			
			

		}
		pw.flush();
	}
}
