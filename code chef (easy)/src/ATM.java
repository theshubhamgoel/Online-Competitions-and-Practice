import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		float bal = 0;
		int tran;

		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);
		df.setGroupingUsed(false);

		tran = sc.nextInt();
		bal = sc.nextFloat();

		if (tran >= bal)
			System.out.println(df.format(bal));
		else if (tran % 5 != 0)
			System.out.println(df.format(bal));
		else if(tran-bal<=.5 && tran-bal>=-.5){
			System.out.println(df.format(bal));
		}
		else {
			bal = (float) (bal - tran - 0.50);
			System.out.println(df.format(bal));
		}
	}
}
