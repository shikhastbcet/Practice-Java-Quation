package Apmosys;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApmosysLoginTest {
	static String ParentId = null;
	static String ChildId = null;
	 static WebDriver driver;

	public static void Add_EOD() throws InterruptedException {

		driver.findElement(By.id("txtFromDate")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@class='ui-state-default
		// ui-state-highlight']")).click();
		driver.findElement(By.className(" ui-datepicker-days-cell-over  ui-datepicker-today")).click();
	
	}

	public static void EOD() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"sidebar-menu\"]/descendant::li[12]")).click();
		driver.findElement(By.xpath("//div[@id='sidebar-menu']/descendant::li[12]/descendant::li[1]")).click();
	}

	public static void Apmosys_Login() throws Exception {
		driver.navigate().to("http://www.apmosys.in/");
		driver.findElement(By.id("mega-menu-item-1513")).click();
		driver.findElement(By.id("mega-menu-item-1514")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username' or name='username']")).sendKeys("shikha.zombade@apmosys.com");
		driver.findElement(By.xpath("//input[@id='userPassword' or placeholder=\"Enter Password\" ]")).sendKeys("Apmosys@123");
		driver.findElement(By.xpath("//button[contains (text(),'SIGN IN')]")).click();
		System.out.println("OTP Sent ");
		String parentId = driver.getWindowHandle();
		System.out.println("Parent" + parentId);
		ParentId = parentId;
	}

	public static void switchWindow(String otp) throws InterruptedException {
		Thread.sleep(30000);
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("otp")).sendKeys(otp + "" + Keys.ENTER);
		// Thread.sleep(3000);
		// driver.findElement(By.className("btn")).click();
	}

	public static String Email() throws InterruptedException {
		System.out.println("Email Open ");
		driver.switchTo().newWindow(WindowType.TAB); // Use of open new Window tab
		driver.navigate().to("http://mail.apmosys.com/");
		driver.switchTo().window(driver.getWindowHandle()); // handle new window tab
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("email-address")).sendKeys("shikha.zombade@apmosys.com");
		// driver.findElement(By.name("email-address")).sendKeys("Shikha.Zombade@apmosys.com");
		driver.findElement(By.name("next")).click();
		driver.findElement(By.name("password")).sendKeys("Shikha@2000");
		driver.findElement(By.name("next")).click();
		Thread.sleep(9999);
		// This xpath is only for new email that XPATH will be unique on only new email
		// and click on it
		// WebElement fistmail = driver.findElement(By.xpath("//div[@class='CLASS_M
		// unread active']"));
		// fistmail.click();
		// Which inbox email iframe to open email iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[@ id='gui.frm_main.main.mailview#frame']"));
		driver.switchTo().frame(frame);
		// and ggettext
		Thread.sleep(4000);
		String Emailotp = driver.findElement(By.xpath("//body[@id='iw_webmail_msg_body']")).getText().substring(20);
		return Emailotp;

	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriramMulti\\Shikha\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.navigate().to("http://www.apmosys.in/");
		System.out.println("Open Browser Successfully");
		Apmosys_Login();
		System.out.println("Apmosys_Login");
		String OTP = Email();
		System.out.println(OTP);
		System.out.println("Window Successfully switch" + OTP);
		switchWindow(OTP);
		System.out.println("home" + ParentId);
		EOD();
		Add_EOD();

	}

}
