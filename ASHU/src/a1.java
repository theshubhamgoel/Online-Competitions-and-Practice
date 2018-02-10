import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 class a1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ReverseCharacters(br.readLine());
		
		System.out.println("hello");
	}
	
	public static String ReverseCharacters(String input1)
    {
		  String[] temp=input1.split(" ");
	        String d="",x;
	      StringBuilder sb;
	     
	        for (int i = 0; i < temp.length-1; i++) {
				x=temp[i].toLowerCase();
				sb=new StringBuilder(x);
				x=sb.reverse().toString();
				sb=new StringBuilder(x);
				sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
				d=d+sb.toString()+" ";
				//System.out.print(sb.toString()+" ");
			}
	        
	     x=temp[temp.length-1].toLowerCase();
				sb=new StringBuilder(x);
				x=sb.reverse().toString();
				sb=new StringBuilder(x);
				sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
				d=d+sb.toString();
	        //System.out.println(d);
	      //output1=d;
	      return d;
    }
}
