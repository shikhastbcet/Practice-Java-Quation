package Excel_Operation;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Monster_Registration {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		driver.navigate().to("https://www.monsterindia.com/seeker/registration?spl=IN-Acq-SEM-Google-Core_Brand_Old_Exact_Web_S-GSN-Core_Brand_Old-monster-desktop-Brand---373205385078---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-Core_Brand_Old_Exact_Web_S-GSN-Core_Brand_Old-monster-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster&gclid=CjwKCAjw5P2aBhAlEiwAAdY7dKkuYUQkJckN1qGn3tWoOiyi49mLRuvwMC8kbhlvAwSSmA83lkZImxoC9PwQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));
		driver.findElement(By.xpath("//input[@type='file']"))
				.sendKeys("G:\\Personal Document\\Documents of shikha\\ZombbadeShikhaResume2022.docx");
		driver.findElement(By.name("fullname")).sendKeys("Zombade Shikha");
		driver.findElement(By.name("email")).sendKeys("Zombadeshikha3@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Pass@12345");
		driver.findElement(By.name("Mobile Number")).sendKeys("9823046993");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		// Thread.sleep(5000);

		// CURRENT LOCATION
		WebElement loc = driver.findElement(By.xpath("//span[text()='Select your current location']"));
		loc.click();
		driver.findElement(By.name("location")).sendKeys("pune");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//span[contains(text(),'Pune')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// YEAR OF EXPERIANCE
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div/div/form/div[2]/div[7]/div/div/div/div/div/div[2]/span"))
				.click();
		WebElement Year = driver.findElement(By.xpath(
				"//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[2]/div[7]/div/div/div/div/div/div[3]"));
		action.sendKeys(Year, "Fresher").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Skills
		driver.findElement(By.xpath("//span[contains(text(),'Enter or select your skills')]")).click();
		driver.findElement(By.name("keywords")).sendKeys("Data");
		action.sendKeys(Keys.ENTER).build().perform();
		
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		//Preferred industries
		driver.findElement(By.xpath("//span[contains(text(),'Maximum 2 industries can ')]")).click();
		driver.findElement(By.name("industry")).sendKeys("Alternate Energy");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		Thread.sleep(2000);
		//Preferred Department	
		action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Maximum 2 functions can be selected')]")).click();
		driver.findElement(By.name("function")).sendKeys("Education/Teaching");
		action.sendKeys(Keys.ENTER+""+Keys.TAB).build().perform();
		
		
		//Preferred role
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[contains(text(),'Maximum 2 roles can be selected')]")).click();
		action.sendKeys(Keys.ENTER+" "+Keys.TAB).build().perform();
	
//driver.close();
	}
}
