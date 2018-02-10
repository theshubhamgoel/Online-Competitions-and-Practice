import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Subsetsum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases, n, set[], flag, x;
		long y,sum;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(br.readLine());
			temp = new StringTokenizer(br.readLine());

			set = new int[n];
			sum = 0;
			flag = 1;

			for (int j = 0; j < n; j++) {
				x = Integer.parseInt(temp.nextToken());
				set[j] = x;
				sum += x;
			}

			y = (long) Math.pow(2, 0);
			
			for (long j = 1; j < 63; j++) {
				if (y > sum)
					break;
				else {
					if(!isSubsetSum(set, n, y)){
						flag=0;
						break;
					}
				}
				y = (long) Math.pow(2, j);
			}

			if (flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}
	
	static boolean isSubsetSum(int set[], int n, long y)
	{
	   // Base Cases
	   if (y == 0)
	     return true;
	   if (n == 0 && y != 0)
	     return false;
	 
	   // If last element is greater than sum, then ignore it
	   if (set[n-1] > y)
	     return isSubsetSum(set, n-1, y);
	 
	   /* else, check if sum can be obtained by any of the following
	      (a) including the last element
	      (b) excluding the last element   */
	   return isSubsetSum(set, n-1, y) || isSubsetSum(set, n-1, y-set[n-1]);
	}
}
