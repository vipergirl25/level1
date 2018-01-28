package level1;

import javax.swing.JOptionPane;

public class MasterOfMethods {
	public static void main(String[] args) {
		MasterOfMethods hi = new MasterOfMethods();
		hi.isInAGoodMood("mom");
		hi.askMom();
	}
	boolean goodMood;
	void askMom() {
		if(goodMood==true) {
			JOptionPane.showMessageDialog(null, "Can I have 20 bucks?");
		}
	}
	boolean isInAGoodMood(String parentName) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if(happy.equalsIgnoreCase("yes")) {
			goodMood=true;
		}
		else {
			goodMood=false;
		}
		return goodMood;
	}
	}


