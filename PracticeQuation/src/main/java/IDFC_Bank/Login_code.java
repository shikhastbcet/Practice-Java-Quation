package IDFC_Bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_code extends Bank_Base{

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//	        driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://my.idfcfirstbank.com/login");
//		log_in("Shikha@2000");
//		Thread.sleep(5000);
//		Login_code.Pay();
//		
//		driver.close();
//	}
	public static  void log_in(String Pass) throws Exception {

//		driver.navigate().to("https://my.idfcfirstbank.com/login");
//		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.findElement(By.xpath("//input[@name=\"mobileNumber\"]")).sendKeys("9552256037");
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to login')]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='login-password-input']")).sendKeys("Shikha@2000");
		driver.findElement(By.xpath("//span[contains(text(),'Login securely')]")).click();
		System.out.println("Enter OTP");
		driver.findElement(By.xpath("//INPUT[@name='otp']")).click();
		Thread.sleep(19000);  
		driver.findElement(By.xpath("//*[@id=\"app\"]/section/div/div/div[2]/div/button")).click();
		System.out.println("Click on verify Button");
	}
	public static void  Pay() throws Exception {
		Thread.sleep(70000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a[3]")).click();
		System.out.println("Click on Pay");	
		Thread.sleep(70000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		System.out.println("Click on Send Money");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"MainContentWrapper\"]/div/div/button")).click();
		System.out.println("Click on New PayMent");
		driver.findElement(By.xpath("//input[@data-testid='accountNumberOrUpiInput']")).sendKeys("10100236926"+Keys.TAB+"10100236926"+Keys.ENTER);
		System.out.println("Enter Account Details");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@data-testid='continueButton']")).click();
		System.out.println("Click on continue Button");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@name='bankNameInput']")).sendKeys("IDFC");		
		driver.findElement(By.xpath("//div[@data-testid='IDFC FIRST BANK']")).click();
		System.out.println("Select Bank");
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"PayeeAccountContainer\"]/div/div[5]/div[1]/div/p"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		
		driver.findElement(By.xpath("//input[@data-testid='accountHolderNameInput']")).sendKeys(Keys.TAB+""+Keys.TAB+""+Keys.TAB+""+Keys.TAB+""+Keys.ENTER);
		Thread.sleep(10000);
	driver.findElement(By.xpath("/html/body/div[3]/div/section/section/div/section/div[2]/form/div/div[1]/div/div[1]/div/input")).click();
	Thread.sleep(19000); 
	driver.findElement(By.xpath("//*[@id=\"FlowModalWrapper\"]/section/div/section/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"FlowModalWrapper\"]/section/div/section/section/div[2]/div/div/div[1]/div/input")).sendKeys("100"+Keys.TAB+""+Keys.TAB+""+Keys.ENTER);
		 Thread.sleep(2000);
		 TakeScreenShot("PayMent_Done");
		 System.out.println("Payment Done");
		
		}
}
