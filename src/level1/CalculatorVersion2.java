package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorVersion2 implements ActionListener {
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	JTextField input1 = new JTextField(20);
	JTextField input2 = new JTextField(20);
	JLabel resultDisplay = new JLabel();
	String number1 = input1.getText();
	String number2 = input2.getText();
	int firstnumber = Integer.parseInt(number1);
	int secondnumber = Integer.parseInt(number2);
	int result;
	String resultText = Integer.toString(result);
	
	private void UI() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	panel.add(input1);
	panel.add(input2);
	panel.add(add);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(resultDisplay);
	resultDisplay.setSize(100, 100);
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	frame.add(panel);
	frame.setSize(400, 400);
	frame.setVisible(true);
	}
	int add(int firstnumber, int secondnumber) {
		result=firstnumber + secondnumber;
		return result;
		}
	int subtract(int firstnumber, int secondnumber) {
		result = firstnumber - secondnumber;
		return result;
	}
	int multiply(int firstnumber, int secondnumber) {
		result = firstnumber * secondnumber;
		return result;
	}
	int divide(int firstnumber, int secondnumber) {
		result = firstnumber/secondnumber;
		return result;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==add) {
			add(firstnumber, secondnumber);
			resultDisplay.setText(resultText);
		}
		if(arg0.getSource()==subtract) {
			subtract(firstnumber, secondnumber);
			resultDisplay.setText(resultText);
		}
		if(arg0.getSource()==multiply) {
			multiply(firstnumber, secondnumber);
			resultDisplay.setText(resultText);
		}
		if(arg0.getSource()==divide) {
			divide(firstnumber, secondnumber);
			resultDisplay.setText(resultText);
		}
		
	}

}
