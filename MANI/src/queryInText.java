import java.io.BufferedReader;
import java.io.InputStreamReader;

public class queryInText {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Sir, Please give me some Data");
		String x = br.readLine();
		x = x.trim().replaceAll(" +", " ");
		System.out.println("Sir, Please give me query");
		System.out.println("Supported Format : ");
		System.out.println("==========================");
		System.out.println("select text/count between word1 word2\n");
		String query = br.readLine();
		query = query.trim().replaceAll(" +", " ");

		int i1 = -1, i2 = -1;
		String arr[] = query.split(" ");
		String type = arr[1];
		String word1 = arr[3];
		String word2 = arr[4];

		String temp[] = x.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(word1))
				i1 = i;

			if (temp[i].equals(word2))
				i2 = i;
		}

		System.out.println();
		if (i1 == -1 || i2 == -1)
			System.out.println("No result found Sir");
		else {
			if (i1 < i2 || !arr[2].equals("between")) {
				if (type.equals("count")) {
					System.out.println("Sir Count is = " + (i2 - i1 - 1));
				} else if (type.equals("text")) {
					for (int i = i1 + 1; i < i2; i++) {
						System.out.print(temp[i] + " ");
					}
				} else
					System.out.println("Wrong Query Sir");
			} else
				System.out.println("No result found Sir");
		}

	}
}
