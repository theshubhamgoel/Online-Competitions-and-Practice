import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LifetheUniverseandEverything {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String out = "", x = "";
		while (true) {
			x = br.readLine();
			if (x.equals("42")) {
				break;
			} else {
				out = out + x + "\n";
			}
		}
		System.out.println(out);
	}

}
