package Apmosys;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Email_Apmosys extends BaseApmosys {
//	public static WebDriver driver;

	public static void Email_Login() throws InterruptedException {
		System.out.println("Open Email Succefully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.name("email-address")).sendKeys("Shikha.Zombade@apmosys.com");
		driver.findElement(By.name("next")).click();
		driver.findElement(By.name("password")).sendKeys("Shubham@2000");
		driver.findElement(By.name("next")).click();

	}

	public static void Compose_Email() throws InterruptedException {
		Thread.sleep(50000);
		System.out.println("Click on Compose");
//		List<WebElement> unread =driver.findElements(By.className("CLASS_M unread"));
//		System.out.println("Unread Mail  "+unread.size());
		driver.findElement(By.xpath("//span[contains(text(),'Compose')]")).click();
		driver.findElement(By.id("gui.frm_compose#switch")).click();
		driver.findElement(By.name("gui.frm_compose.to.plus#main")).sendKeys("alaka.panda@apmosys.com" + Keys.ENTER);
		driver.findElement(By.name("gui.frm_compose.cc.plus#main"))
				.sendKeys("Dhanashree.Morkhandikar@apmosys.com" + Keys.ENTER);
		driver.findElement(By.name("gui.frm_compose.bcc.plus#main"))
				.sendKeys("venkatesh.naik@apmosys.com" + Keys.ENTER);
		driver.findElement(By.name("gui.frm_compose.subject#main")).sendKeys("New Year Invitation");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB + "Happy New Year Dear Dhanashree Morkhandikar Alaka Pande  venkatesh naik").build()
				.perform();

		driver.findElement(By.xpath("//*[@id=\"gui.frm_compose.x_btn_att\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"gui.cmenu/1\"]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Happy New Year.png')]")).click();
		driver.findElement(By.id("gui.insert_item.x_btn_ok")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gui.frm_compose.x_btn_send#main")).click();

	}

	public static void Unseen_Email() throws Exception {
		Thread.sleep(40000);
		String Email = driver.getTitle();
		String EmailUnRead = driver.findElement(By.xpath("//*[@id=\"gui.frm_main.filter#M\"]/i")).getText();
		int EmailUnRead1 = Integer.parseInt(EmailUnRead);

		System.out.println("All UnEmails : " + Email.subSequence(9, 12));

	}

	public static void Send_Email() throws Exception {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"gui.frm_main.filter#M\"]/i")).click();
		driver.findElement(
				By.xpath("//*[@id=\"gui.frm_main.bar.tree.slide.1.folders/shikha.zombade@apmosys.com/0/1\"]/div/b"))
				.click();
		Thread.sleep(40000);
		String Send = driver.getTitle();
		System.out.println("Send_Email : " + Send);
	}

	public static void main(String[] agr) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
		Launch("chrome");
		driver.get("https://mail.apmosys.com");
		driver.manage().window().maximize();
		Email_Login();
//		Compose_Email();
		Unseen_Email();
//		Send_Email() ;
	}

}
