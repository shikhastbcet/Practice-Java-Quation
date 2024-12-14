package TestNG_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapropiver {
static WebDriver driver;
	@Test(dataProvider ="Cridential" )
	private void dataprovider_s(String user, String Pass) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriramMulti\\Shikha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.navigate().to("http://mail.apmosys.com/");
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.findElement(By.name("email-address")).sendKeys(user);
		driver.findElement(By.name("next")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.name("next")).isDisplayed());
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Pass);
		driver.findElement(By.name("next")).click();
		driver.quit();
		System.out.println("End Succefuly");
		Thread.sleep(3000);
		
		
	}
	@DataProvider(name="Cridential")
	private Object[][] logindat() {
		// TODO Auto-generated method stub
Object[] [] data= {{"shikha.zombage@apmosys.com", "Shikha@2000"} ,{"shikha.zombage@apmosys.com", "feddsdsvfdvdf"}};
return data;
}
}
