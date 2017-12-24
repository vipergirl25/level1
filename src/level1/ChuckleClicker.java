package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	 new ChuckleClicker().MakeButtons();
}

	void MakeButtons(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	button1.setText("joke");
	button2.setText("punchline");
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1 || e.getSource()==button2) {
		System.out.println("hi");
		if(e.getSource()==button1) {
			System.out.println("Why did the gum cross the road?");
		}
		else if(e.getSource()==button2) {
			System.out.println("Because it was stuck to the chickens foot.");
		}
	}
}
}