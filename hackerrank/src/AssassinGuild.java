import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AssassinGuild {

	public static void main(String[] args) throws IOException, ParseException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String d;
		d = br.readLine();

		Calendar c = Calendar.getInstance();
		Date d1 = new SimpleDateFormat("dd-mm-yyyy").parse(d);
		c.setTime(d1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		switch (dayOfWeek) {
		case 1:
			System.out.println("Kiss of Death");
			break;

		case 2:
			System.out.println("Troll Skull");
			break;

		case 3:
			System.out.println("Dragon Fin");
			break;

		case 4:
			System.out.println("Golden Heart");
			break;

		case 5:
			System.out.println("Diamond of the Blood");
			break;

		case 6:
			System.out.println("Chalice of the Phantom");
			break;

		case 7:
			System.out.println("Lock of the Daedra");
			break;

		}

	}
}
