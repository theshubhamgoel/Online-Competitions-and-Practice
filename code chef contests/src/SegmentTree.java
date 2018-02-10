import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SegmentTree {

	private int[] tree;
	private int maxsize;
	private int height;

	private final int STARTINDEX = 0;
	private final int ENDINDEX;
	private final int ROOT = 0;

	public SegmentTree(int size) {
		height = (int) (Math.ceil(Math.log(size) / Math.log(2)));
		maxsize = 2 * (int) Math.pow(2, height) - 1;
		tree = new int[maxsize];
		ENDINDEX = size - 1;
	}

	private int leftchild(int pos) {
		return 2 * pos + 1;
	}

	private int rightchild(int pos) {
		return 2 * pos + 2;
	}

	private int mid(int start, int end) {
		return (start + (end - start) / 2);
	}

	private int getSumUtil(int startIndex, int endIndex, int queryStart,
			int queryEnd, int current) {
		if (queryStart <= startIndex && queryEnd >= endIndex) {
			return tree[current];
		}
		if (endIndex < queryStart || startIndex > queryEnd) {
			return 0;
		}
		int mid = mid(startIndex, endIndex);
		return getSumUtil(startIndex, mid, queryStart, queryEnd,
				leftchild(current))
				+ getSumUtil(mid + 1, endIndex, queryStart, queryEnd,
						rightchild(current));
	}

	public int getSum(int queryStart, int queryEnd) {
		if (queryStart < 0 || queryEnd > tree.length) {
			return -1;
		}
		return getSumUtil(STARTINDEX, ENDINDEX, queryStart, queryEnd, ROOT);
	}

	private int constructSegmentTreeUtil(int[] elements, int startIndex,
			int endIndex, int current) {
		if (startIndex == endIndex) {
			tree[current] = elements[startIndex];
			return tree[current];
		}
		int mid = mid(startIndex, endIndex);
		tree[current] = constructSegmentTreeUtil(elements, startIndex, mid,
				leftchild(current))
				+ constructSegmentTreeUtil(elements, mid + 1, endIndex,
						rightchild(current));
		return tree[current];
	}

	public void constructSegmentTree(int[] elements) {
		constructSegmentTreeUtil(elements, STARTINDEX, ENDINDEX, ROOT);
	}

	private void updateTreeUtil(int startIndex, int endIndex, int updatePos,
			int update, int current) {
		if (updatePos < startIndex || updatePos > endIndex) {
			return;
		}
		tree[current] = tree[current] + update;
		if (startIndex != endIndex) {
			int mid = mid(startIndex, endIndex);
			updateTreeUtil(startIndex, mid, updatePos, update,
					leftchild(current));
			updateTreeUtil(mid + 1, endIndex, updatePos, update,
					rightchild(current));
		}
	}

	public void update(int update, int updatePos, int[] elements) {
		int updatediff = update - elements[updatePos];
		elements[updatePos] = update;
		updateTreeUtil(STARTINDEX, ENDINDEX, updatePos, updatediff, ROOT);
	}

	static int arr[];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_cases = 0, n, u, a, b, c, m, p;
		StringTokenizer temp;
		test_cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < test_cases; i++) {
			temp = new StringTokenizer(br.readLine());
			n = Integer.parseInt(temp.nextToken());
			u = Integer.parseInt(temp.nextToken());
			arr = new int[n];
			
			SegmentTree segmentTree = new SegmentTree(n);
	        segmentTree.constructSegmentTree(arr);

			for (int j = 0; j < u; j++) {
				temp = new StringTokenizer(br.readLine());
				a = Integer.parseInt(temp.nextToken());
				b = Integer.parseInt(temp.nextToken());
				c = Integer.parseInt(temp.nextToken());
			}

			m = Integer.parseInt(br.readLine());

			for (int j = 0; j < m; j++) {
				p = Integer.parseInt(br.readLine());
			}
		}
	}
}
