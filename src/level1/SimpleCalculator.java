package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	public static void main(String[] args) {
		new SimpleCalculator().UITHing();
	}
	JButton add = new JButton("add");
	JButton subtract = new JButton("sub");
	JButton multiply = new JButton("mul");
	JButton divide = new JButton("div");
	JTextField enter1 = new JTextField(10);
	JTextField enter2 = new JTextField(10);
	JLabel result = new JLabel();
	int resultofoperation;
	String results;
	void UITHing() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(enter1);
		panel.add(enter2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(result);
		frame.add(panel);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(300, 300);

	}
	int Add(int number1, int number2) {
		resultofoperation = number1 + number2;
		return resultofoperation;
	}
	int Subtract(int number1, int number2) {
		resultofoperation = number1 - number2;
		return resultofoperation;
		
	}
	int Multiply(int number1, int number2) {
		resultofoperation = number1 * number2;
		return resultofoperation;
		
	}
	int Divide(int number1, int number2) {
		resultofoperation = number1 / number2;
		return resultofoperation;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add) {
		String Number1 = enter1.getText();
		String Number2 = enter2.getText();
		int number1 = Integer.parseInt(Number1);
		int number2 = Integer.parseInt(Number2);
		Add(number1, number2);
		results = Integer.toString(resultofoperation);
		result.setText(results);
			
		}
		else if(e.getSource()==subtract) {
		String Number1 = enter1.getText();
		String Number2 = enter2.getText();
		int number1 = Integer.parseInt(Number1);
		int number2 = Integer.parseInt(Number2);
		Subtract(number1, number2);
		results = Integer.toString(resultofoperation);
		result.setText(results);
			
		}
		else if(e.getSource()==multiply) {
		String Number1 = enter1.getText();
		String Number2 = enter2.getText();
		int number1 = Integer.parseInt(Number1);
		int number2 = Integer.parseInt(Number2);
		Multiply(number1, number2);
		results = Integer.toString(resultofoperation);
		result.setText(results);
		
	}
		else if(e.getSource()==divide) {
		String Number1 = enter1.getText();
		String Number2 = enter2.getText();
		int number1 = Integer.parseInt(Number1);
		int number2 = Integer.parseInt(Number2);
		Divide(number1, number2);
		results = Integer.toString(resultofoperation);
		result.setText(results);
		
	}
		
	}

}
