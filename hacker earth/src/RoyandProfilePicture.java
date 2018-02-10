import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoyandProfilePicture {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l, n, w, h;
		StringTokenizer temp;
		l = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			w = Integer.parseInt(temp.nextToken());
			h = Integer.parseInt(temp.nextToken());
			
			if(w<l||h<l){
				System.out.println("UPLOAD ANOTHER");
			}else if(w!=h){
				System.out.println("CROP IT");
			}else
				System.out.println("ACCEPTED");

		}
	}

}
