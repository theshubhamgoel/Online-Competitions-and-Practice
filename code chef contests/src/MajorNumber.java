import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MajorNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, curr, next, count, flag;
		int[] a;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());

			a = new int[n];
			temp = new StringTokenizer(br.readLine());

			for (int j = 0; j < a.length; j++)
				a[j] = Integer.parseInt(temp.nextToken());

			Arrays.sort(a);

			curr = a[0];
			flag = count = 1;
			for (int j = 1; j < a.length; j++) {
				next = a[j];
				if (curr == next)
					count++;
				else {
					
					if (count > n / 2) {
						flag = 0;
						break;
					}
					curr = next;
					count = 1;
				}
			}
			
			if (count > n / 2) {
				System.out.println(curr);
			}else{
				System.out.println("NO MAJOR");
			}

		}
	}
}
