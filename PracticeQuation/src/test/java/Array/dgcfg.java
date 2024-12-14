package Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dgcfg {
static WebDriver driver;
static By Plans=By.xpath("(//*[text()='Plans'])");
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(option);
	        driver.navigate().to("https://www.iciciprulife.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(9000);
	        driver.findElement(Plans).click();
Thread.sleep(50000);
driver.close();
	        System.out.println("---New Test---");

		}

}
