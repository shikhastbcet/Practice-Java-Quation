package Mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Mail_Test {
	static WebDriver driver; 
	@Test(priority = 1)
	private void Send_Mail() throws MessagingException {
		// TODO Auto-generated method stub
String to="shikhastbcet@gmail.com";
 String from="shikhazombade3@gmail.com";
String message="This is Message from Shikha";
String subject="Report Of LastTestFailur";


//Create host 
String host="smtp.gmail.com";
//Get Properties fron System
Properties properties = System.getProperties();
//Get gmail server
properties.put("mail.smtp.host", host);
properties.put("mail.smtp.port", 467);
properties.put("mail.smtp.ssl.enable", true);
properties.put("mail.smtp.auto", true);

//Get the Session object.// and pass username and password
Session session= 	 Session.getInstance(properties, new javax.mail.Authenticator() {

    protected PasswordAuthentication getPasswordAuthentication() {
    	 return new PasswordAuthentication("shikha.zombade@apmosys.com", "Apmosys@123");
      

    }

});
session.setDebug(true);

// Compose massage

MimeMessage mess = new MimeMessage(session);
mess.addRecipient(Message.RecipientType.TO, new InternetAddress());

// Set From mailID
try {
    mess.setFrom(from);
    // adding recipient to message
    mess.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    //Adding subject
    mess.setText(message);
    //send
    Transport.send(mess);
    System.out.println("Send Successfully");
    
} catch (MessagingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
	}
}
