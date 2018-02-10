import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarkandToys {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt(), k = stdin.nextInt();
		int prices[] = new int[n];
		for (int i = 0; i < n; i++)
			prices[i] = stdin.nextInt();

		int answer = 0;
		Arrays.sort(prices);

		for (int i = 0; i < prices.length; i++) {
			if (k < prices[i])
				break;
			answer++;
			k -= prices[i];
		}

		System.out.println(answer);
	}
}
