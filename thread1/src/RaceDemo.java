import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JOptionPane;

public class RaceDemo extends Applet implements ActionListener {
	Image tortois, rabbit;
	Button start;
	Label text;
	String welcomeMessage = "Welcome to racing mania";
	static int tortoiesPos, rabbitPos, flag = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Racers r1 = new Racers("Shubham");
		Racers r2 = new Racers("Mani");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		while (t1.isAlive() || t2.isAlive()) {

		}

		System.out.println("Total time taken by " + r1.name + " is : "
				+ r1.totalTimeTaken + "ms");
		System.out.println("Total time taken by " + r1.name + " is : "
				+ r1.totalTimeTaken + "ms");

		System.out.println("Winner is : " + Racers.winner);

	}

	@Override
	public void init() {
		super.init();
		resize(1000, 300);

		tortois = getImage(getDocumentBase(), "tortois.jpg");
		rabbit = getImage(getDocumentBase(), "rabbit.jpg");

		start = new Button("Start the Race");
		start.setBounds(80, 600, 60, 50);
		text = new Label(welcomeMessage);
	}

	@Override
	public void start() {
		super.start();
		add(start);
		add(text);
		start.addActionListener(this);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		Font myFont = new Font("TimesRoman", Font.BOLD, 13);
		g.setFont(myFont);
		text.setLocation(420, 25);
		text.setFont(myFont);
		start.setLocation(450, 50);
		g.drawImage(tortois, 30 + tortoiesPos, 90, this);
		g.drawImage(rabbit, 30 + rabbitPos, 180, this);

		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (Racers.winner.equals("") && flag == 1)
			repaint();

		if (flag == 1 && !Racers.winner.isEmpty())
			JOptionPane.showMessageDialog(null, new String("Winner is : " +Racers.winner));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		flag = 1;

		Racers r1 = new Racers("tortois");
		Racers r2 = new Racers("rabbit");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		System.out.println("Total time taken by " + r1.name + " is : "
				+ r1.totalTimeTaken + "ms");
		System.out.println("Total time taken by " + r1.name + " is : "
				+ r1.totalTimeTaken + "ms");

		System.out.println("Winner is : " + Racers.winner);
		repaint();
	}

}
