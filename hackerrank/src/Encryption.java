import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryption {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x, y;
		String temp;
		temp = br.readLine();

		x = (int) Math.floor(Math.sqrt(temp.length()));
		y = (int) Math.ceil(Math.sqrt(temp.length()));

		if (x * y < temp.length())
			x = y;

		String rec[] = new String[x];

		for (int i = 0; i < rec.length; i++) {
			rec[i] = "";
			for (int j = 0; j < y; j++) {
				if (i * y + j < temp.length())
					rec[i] += temp.charAt(i * y + j);
			}
		}

		temp = "";
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (i < rec[j].length())
					temp += rec[j].charAt(i);
			}
			temp += " ";
		}
		System.out.println(temp);
	}

}
