import java.util.ArrayList;
import java.util.List;


public class exp2 {

	public static List<String> getPermutation(String input) {

	    List<String> collection = null;

	    if (input.length() == 1) {
	        collection = new ArrayList<String>();
	        collection.add(input);
	        return collection;
	    } else {
	        collection = getPermutation(input.substring(1));
	        Character first = input.charAt(0);
	        List<String> result = new ArrayList<String>();
	        for (String str : collection) {
	            for (int i = 0; i < str.length(); i++) {
	                String item = str.substring(0, i) + first
	                        + str.substring(i);
	                result.add(item);
	            }
	            String item = str.concat(first.toString());
	            result.add(item);
	        }
	        return result;
	    }

	}

	public static void main(String[] args) {
	    System.out.println(exp2.getPermutation("abcd"));

	}

}
