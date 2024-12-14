package ICIC_Prudential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICIC_Base {
	public static WebDriver driver;

	public static void Launch_Browser(String Browser) {
		switch (Browser) {
		case "chrome":
			System.out.println("CHROME BROWSER");
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions option1 = new EdgeOptions();
			option1.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(option1);
			break;
		case "mozila":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option2 = new FirefoxOptions();
			option2.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver(option2);
			break;

		default:
			WebDriverManager.chromedriver().setup();
			ChromeOptions option3 = new ChromeOptions();
			option3.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option3);

		}

	}
    public static void Click(By By) {
    	WebElement Button = driver.findElement(By);
    	Button.click();
    } 
    
    public static void MouseOver(By by) {
    	Actions action=new Actions(driver);
    	action.moveToElement(driver.findElement(by)).build().perform();
    	
    }
    public static void WaitElementToBeClickable(By by) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	driver.findElement(by).click();
	wait.until(ExpectedConditions.elementToBeClickable(by));
	System.out.println("Succesfully click");
    }
}
