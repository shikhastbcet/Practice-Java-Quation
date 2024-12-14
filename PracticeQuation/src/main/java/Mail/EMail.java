package Mail;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EMail {
	static WebDriver driver; 
//	@Test(priority = 1)
	private void Send_Mail() throws MessagingException {
		// TODO Auto-generated method stub
String to="shikhastbcet@gmail.com";
 String from="shikhazombade3@gmail.com";
String message="This is Message from Shikha";
String subject="Report Of LastTestFailur";


//Create host 
String host="apmosys.icewarp.com";
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

	
	private static void screenshot() {
		// TODO Auto-generated method stub
File image =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyDirectory(image, new File("C:\\Users\\ShriramMulti\\eclipse-workspace\\ToolsQA\\ScreenShot's\\shikha.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("Somthing Went Worng");
}
	}
	
	@Test(priority = 0)
	private void LogIn() throws InterruptedException, MessagingException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriramMulti\\Shikha\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(option);		
//		driver.navigate().to("https://mail.apmosys.com");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//	WebElement elemen=	driver.findElement(By.xpath("//button[@name=\"next\" or @type=\"button\"]"));
//	if(elemen.isDisplayed()) {
//		System.out.println("Element is Present");
//		Send_Mail();
//		}
//else {
//	System.out.println("TAKE SCREENSHOT");
	screenshot();
}
//	}

}
