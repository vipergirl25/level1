package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "hellofriend@gmail.com";
	static final String FAKE_PASSWORD = "iamafriend";
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}


	JButton bad = new JButton("BAD");
	JButton good = new JButton("GOOD");
	private void userinterface() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField text = new JTextField();
		bad.addActionListener(this);
		good.addActionListener(this);
		panel.add(text);
		panel.add(bad);
		panel.add(good);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bad) {
			sendSpam("elena.letourneau.22@bishops.com", "hi", "hello");
		}
		else if(e.getSource() == good) {
			sendSpam("elena.letourneau.22@bishops.com", "hi", "hello");
		}
	}
	public static void main(String[] args) {
		new Spamalot().userinterface();
	}
}
