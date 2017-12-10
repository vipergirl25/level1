package level1;

// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String demi = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Demi_Lovato_%28Red_carpet%29_-_Global_Citizen_Festival_Hamburg_07.jpg/1200px-Demi_Lovato_%28Red_carpet%29_-_Global_Citizen_Festival_Hamburg_07.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component thing = createImage(demi);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		
		quizWindow.add(thing);
		

		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("Who is this?");

		// 7. print "CORRECT" if the user gave the right answer
		if(question.equals("Demi Lovato") || question.equals("demi lovato")) {
			System.out.println("CORRECT");
		}

		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(thing);

		// 10. find another image and create it (might take more than one line of code)
		String katee = "http://cimg.tvgcdn.net/i/2017/08/21/e2206e27-65c2-49fe-b565-027f108b84a4/170821-katee-sackhoff.jpg";
		Component thingy = createImage(katee);

		// 11. add the second image to the quiz window
		quizWindow.add(thingy);
		

		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		String question2 = JOptionPane.showInputDialog("Who is this?");

		// 14+ check answer, say if correct or incorrect, etc.
		if(question2.equals("Katee Sackhoff") || question2.equals("katee sackhoff")) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




