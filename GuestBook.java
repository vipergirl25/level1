package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		new GuestBook().GUI();
	}
	JButton addName = new JButton("add name");
	JButton viewNames = new JButton("view names");
	String name;
	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	void GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==addName) {
			name = JOptionPane.showInputDialog("Enter a name:");
			names.add(name);
		}
		else if(arg0.getSource()==viewNames) {
			JOptionPane.showMessageDialog(null, names);
		}
		
	}
}
