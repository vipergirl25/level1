package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static int timesPressed = 0;
	JFrame frame = new JFrame();
	static Random rand = new Random();
	Date timeAtStart = new Date();
	static int hi = 0;
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}


	JButton mole = new JButton("mole");
	public static void main(String[] args) {
		hi = rand.nextInt(26);
		new WhackAMole().drawButtons(hi);
	}
	void drawButtons(int hi){
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 25; i++) {
			if(i==hi) {
				panel.add(mole);
			}
			else{
				JButton b = new JButton();
				panel.add(b);
				b.addActionListener(this);
			}
			
		}
		mole.addActionListener(this);
		frame.setSize(500, 500);
		frame.add(panel);
		frame.setVisible(true);
		if(timesPressed==10) {
			endGame(timeAtStart, timesPressed);
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mole) {
			frame.dispose();
			hi = rand.nextInt(24);
			new WhackAMole().drawButtons(hi);
			timesPressed++;
		}
		else {
			speak("these instructions tell me to call you a dork, but i don't want to so i won't");
		}
		
	}
}
