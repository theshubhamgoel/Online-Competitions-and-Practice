import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GiftRift {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int r, c, t, min, max = 0,flag=0;
		StringTokenizer temp;
		int mat[][];
		int col_max[];

		temp = new StringTokenizer(br.readLine());
		r = Integer.parseInt(temp.nextToken());
		c = Integer.parseInt(temp.nextToken());

		mat = new int[r][c];
		col_max = new int[c];

		for (int j = 0; j < r; j++) {
			temp = new StringTokenizer(br.readLine());
			for (int j2 = 0; j2 < c; j2++) {
				t = Integer.parseInt(temp.nextToken());
				mat[j][j2] = t;
				if (col_max[j2] < t)
					col_max[j2] = t;
			}
		}

		for (int i = 0; i < r; i++) {
			min = 100000001;
			for (int j = 0; j < c; j++) {
				if (min > mat[i][j])
					min = mat[i][j];
			}

			for (int j = 0; j < c; j++) {
				if(min==mat[i][j])
					if(col_max[j]==min){
						flag=1;
						max=min;
						break;
					}
			}
			
			if(flag==1)
				break;
		}
		
		if(flag==1)
			System.out.println(max);
		else
			System.out.println("GUESS");

	}
}
