package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JButton convert = new JButton();
	JTextField input = new JTextField(20);
	JTextField answer = new JTextField(20);
	public static void main(String[] args) {
		new BinaryConverter().UserInterface();
	}
	void UserInterface(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		convert.addActionListener(this);
		convert.setText("convert");
		panel.add(input);
		panel.add(convert);
		panel.add(answer);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == convert) {
			String i = input.getText();
			String binary1 = convert(i);
			System.out.println(binary1);
			answer.setText(binary1);
			}
		
			
		}
	 String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	}
