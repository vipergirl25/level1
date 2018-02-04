package level1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam implements ActionListener {
	public static void main(String[] args) {
		new Exam().UI();
	}
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	private void UI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		yellow.addActionListener(this);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		red.addActionListener(this);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		blue.addActionListener(this);
		Color mattGreen = Color.decode("#138c41");
		green.setBackground(mattGreen);
		green.setOpaque(true);
		green.addActionListener(this);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		frame.setTitle("Color Teacher as requested by matt");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==yellow) {
			speak("yellow");
		}
		if(arg0.getSource()==red) {
			speak("red");
		}
		if(arg0.getSource()==blue) {
			speak("blue");
		}
		if(arg0.getSource()==green) {
			speak("what matt says is green");
		}
	}

}
