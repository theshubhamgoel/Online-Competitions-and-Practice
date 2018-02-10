import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class paypal1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n = 0, m;
		StringTokenizer temp;
		temp = new StringTokenizer(br.readLine());

		int[] input1 = new int[2];
		input1[0] = Integer.parseInt(temp.nextToken());
		input1[1] = Integer.parseInt(temp.nextToken());

		String[] input2 = new String[input1[1]];

		for (int i = 0; i < input1[0]; i++) {
			input2[i] = br.readLine();
		}

		landingPosition(input1, input2);
	}

	public static int landingPosition(int[] input1, String[] input2) {
		int n = input1[0];
		int m = input1[1];

		int mat[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			StringTokenizer temp = new StringTokenizer(input2[i], "#");
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = temp.nextToken() == "x" ? 0 : 1;
			}
		}
		
		printMaxSubSquare(mat);
		return -1;
	}
	
	
	static void printMaxSubSquare(int M[][])
	{
	  int i,j;
	  int R=M.length;
	  int C=M[0].length;
	  int S[][]=new int[M.length][M[0].length];
	  int max_of_s, max_i, max_j; 
	 
	  /* Set first column of S[][]*/
	  for(i = 0; i < R; i++)
	     S[i][0] = M[i][0];
	 
	  /* Set first row of S[][]*/     
	  for(j = 0; j < C; j++)
	     S[0][j] = M[0][j];
	     
	  /* Construct other entries of S[][]*/
	  for(i = 1; i < R; i++)
	  {
	    for(j = 1; j < C; j++)
	    {
	      if(M[i][j] == 1) 
	        S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1;
	      else
	        S[i][j] = 0;
	    }    
	  } 
	  
	  /* Find the maximum entry, and indexes of maximum entry 
	     in S[][] */
	  max_of_s = S[0][0]; max_i = 0; max_j = 0;
	  for(i = 0; i < R; i++)
	  {
	    for(j = 0; j < C; j++)
	    {
	      if(max_of_s < S[i][j])
	      {
	         max_of_s = S[i][j];
	         max_i = i; 
	         max_j = j;
	      }        
	    }                 
	  }     
	  
	  System.out.println(max_of_s);
	   
	}  
	
	
	static int min(int a, int b, int c)
	{
	  int m = a;
	  if (m > b) 
	    m = b;
	  if (m > c) 
	    m = c;
	  return m;
	}
}
