import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class exp2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		InputReader ir = new InputReader(System.in);

		int test_cases = 0, n, j, max_occ, max_occ_index, temp_occ, temp_occ_index;
		test_cases = Integer.parseInt(ir.readLine());
		String temp[];
		int[] arr;

		for (int i = 0; i < test_cases; i++) {
			n = Integer.parseInt(ir.readLine());
			temp = ir.readLine().split(" ");
			arr = new int[n];

			for (j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}

			Arrays.sort(arr);
			max_occ = max_occ_index = temp_occ = temp_occ_index = 0;
			for (j = 0; j < n; j++) {
				if (arr[temp_occ_index] == arr[j]) {
					temp_occ++;
				} else {
					if (max_occ < temp_occ) {
						max_occ = temp_occ;
						max_occ_index = temp_occ_index;
					}
					temp_occ = 0;
					temp_occ_index = j;
					j = j - 1;
				}
			}

			if (max_occ < temp_occ) {
				max_occ = temp_occ;
				max_occ_index = temp_occ_index;
			}
			System.out.println(arr[max_occ_index] + " " + max_occ);
		}
	}

}

class InputReader {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public String readLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuffer res = new StringBuffer();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
