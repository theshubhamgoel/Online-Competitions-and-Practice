import java.util.Random;

public class Racers implements Runnable {

	public String name;
	public static String winner = "";
	public long totalTimeTaken = 0;

	public Racers(String s) {
		name = s;
	}

	@Override
	public void run() {
		startTheRace();
		if (winner == "")
			winner = name;
	}

	private void startTheRace() {
		int lengthInMeter = 80;
		long startTime = System.currentTimeMillis();
		Random r=new Random();
		for (int i = 1; i <= lengthInMeter; i++) {
			System.out.println(name + "'s status : " + i);
			if (name.equals("tortois"))
				RaceDemo.tortoiesPos = i*10;
			else
				RaceDemo.rabbitPos = i*10;
			
			try {
				Thread.currentThread().sleep(r.nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		long endTime = System.currentTimeMillis();
		totalTimeTaken = endTime - startTime;
		System.out.println(totalTimeTaken);
	}
}
