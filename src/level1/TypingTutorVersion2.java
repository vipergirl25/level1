package level1;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutorVersion2 implements KeyListener {
	public static void main(String[] args) {
		new TypingTutorVersion2().createUI();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel currentLetterDisplay = new JLabel();
	char currentLetter = generateRandomLetter();
	String currentLetterText = Character.toString(currentLetter);
	char generateRandomLetter() {
		Random r = new Random();
		return (char)	(r.nextInt(26) + 'a');
	}
	private void createUI() {
		currentLetterDisplay.setFont(currentLetterDisplay.getFont().deriveFont(28.0f));
		currentLetterDisplay.setHorizontalAlignment(currentLetterDisplay.CENTER);
		currentLetterDisplay.setText(currentLetterText);
		panel.add(currentLetterDisplay);
		frame.addKeyListener(this);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
	char userKeyPress = arg0.getKeyChar();
	String userKeyPressPrint = Character.toString(userKeyPress);
	System.out.println(userKeyPressPrint);
	if(userKeyPressPrint.equals(currentLetterText)) {
		System.out.println("correct");
		panel.setBackground(Color.GREEN);
	}
	else {
		System.out.println("incorrect");
		panel.setBackground(Color.RED);
	}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		currentLetter = generateRandomLetter();
		currentLetterText = Character.toString(currentLetter);
		currentLetterDisplay.setText(currentLetterText);
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
