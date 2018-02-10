import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CulturalProgramme {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0, a, b;
		StringTokenizer temp;
		int[] arr = new int[10000002];
		n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			temp = new StringTokenizer(br.readLine());
			a = Integer.parseInt(temp.nextToken());
			b = Integer.parseInt(temp.nextToken());

			arr[a] ++;
			arr[b + 1]--;
		}

		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		
		System.out.println(max);
	}
}
