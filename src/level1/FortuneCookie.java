package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JButton button = new JButton();
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.showButton();
	}
	
	public void showButton(){
	System.out.println("hi humans. i am not one of you.");

	button.addActionListener(this);
	Random rand = new Random();
	int numberthing = rand.nextInt(5);
	
	if(numberthing == 0) {
		JOptionPane.showMessageDialog(null, "You will go on to live a happy life.");
	}
	if(numberthing == 1) {
		JOptionPane.showMessageDialog(null, "You will meet your idol.");
	}
	if(numberthing == 2) {
		JOptionPane.showMessageDialog(null, "You will adopt a puppy tomorrow.");
	}
	if(numberthing == 3) {
		JOptionPane.showMessageDialog(null, "You will become allergic to cats and then invent a cure for all allergies because you love cats so much.");
	}
	if(numberthing == 4) {
		JOptionPane.showMessageDialog(null, "Your obsession with cats has become too much and you need to get rid of all your cats.");
	}
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button) {
		System.out.println("woohoo");
	}
}
}