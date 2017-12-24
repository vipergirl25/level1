package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	public static void main(String[] args) {
		new CutenessTv().whichVideo();
	}
	JButton ducks = new JButton();
	JButton frogs = new JButton();
	JButton fluffyUnicorn = new JButton();
void whichVideo(){
JFrame frame = new JFrame();
JPanel panel = new JPanel();
panel.add(ducks);
panel.add(frogs);
panel.add(fluffyUnicorn);
frame.add(panel);
frame.pack();
frogs.addActionListener(this);
frogs.setText("Frogs");
ducks.setText("Ducks");
fluffyUnicorn.setText("Fluffy Unicorns");
ducks.addActionListener(this);
fluffyUnicorn.addActionListener(this);
frame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==ducks) {
		showDucks();
	}
	if(e.getSource()==frogs) {
		showFrog();
	}
	if(e.getSource()==fluffyUnicorn) {
		showFluffyUnicorns();
	}
}
void showDucks() {
	playVideo("YA0AQEq1BnI");
}

void showFrog() {
	playVideo("aSjCb-FfxhI");
}

void showFluffyUnicorns() {
	playVideo("qRC4Vk6kisY");
}

void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}



}
