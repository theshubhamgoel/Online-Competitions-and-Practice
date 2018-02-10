import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InternetMediaTypes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, q, x, y;
		String t1, t2;
		String[] file_ext, media_type, temp;
		temp = br.readLine().split(" ");
		n = Integer.parseInt(temp[0]);
		q = Integer.parseInt(temp[1]);

		file_ext = new String[n];
		media_type = new String[n];
		for (int i = 0; i < n; i++) {
			temp = br.readLine().split(" ");
			file_ext[i] = temp[0];
			media_type[i] = temp[1];
		}

		for (int i = 0; i < q; i++) {
			t1 = br.readLine();
			x = t1.lastIndexOf(".");
			y = t1.length();
			if (x == -1)
				x = y;
			t2 = "";
			for (int j = x + 1; j < y; j++)
				t2 = t2 + t1.charAt(j);

			int flag = 0, j;
			for (j = 0; j < file_ext.length; j++) {
				if (file_ext[j].equals(t2)) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				System.out.println(media_type[j]);
			else
				System.out.println("unknown");

		}
	}
}
