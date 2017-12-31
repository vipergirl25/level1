package level1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		new TypingTutor().GUI();
	}
	char currentLetter = generateRandomLetter();
	String letterCurr = Character.toString(currentLetter);
	JLabel letter = new JLabel(letterCurr);
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	void GUI() {
		letter.setFont(letter.getFont().deriveFont(28.0f));
		letter.setHorizontalAlignment(letter.CENTER);	
		panel.add(letter);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);

	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyPress = e.getKeyChar();
		String keypress = Character.toString(keyPress);
		System.out.println("you typed: " + keypress);
		if(keypress.equals(letterCurr)) {
			System.out.println("correct");
			panel.setBackground(Color.green);
		}else {
			panel.setBackground(Color.red);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		letterCurr = Character.toString(currentLetter);
		letter.setText(letterCurr);
		
	}

	

}
