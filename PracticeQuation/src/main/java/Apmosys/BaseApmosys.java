package Apmosys;



import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseApmosys {
	public static WebDriver driver;

	public static void Launch(String str) {
	
	
			switch (str) {
			case "chrome":
				System.out.println("CHROME BROWSER");
				WebDriverManager.chromedriver().setup();
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(option);
//				driver.navigate().to(url);
				break;
			case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions option1= new EdgeOptions();
			option1.addArguments("--remote-allow-origins=*");
				driver = new EdgeDriver(option1);
//				driver.navigate().to(url);
				break;
			case "mozila":
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions option2=new FirefoxOptions();
				option2.addArguments("--remote-allow-origins=*");
				driver = new FirefoxDriver(option2);
//				driver.navigate().to(url);
				break;
				
			default:
				WebDriverManager.chromedriver().setup();
				ChromeOptions option3=new ChromeOptions();
				option3.addArguments("--remote-allow-origins=*");
							driver = new ChromeDriver(option3);
//							driver.navigate().to(url);
			}
		
		}

	
	public static void Sendkeys(String path,String locator ,String key) {
		switch (path) {
		case "className":
			driver.findElement(By.className(path)).click();
			break;
		case "id":
			System.out.println("sfsdgdhbf");
			driver.findElement(By.id(path)).click();
			break;
		case "xpath":
			driver.findElement(By.xpath(path)).click();
			break;
		case "cssSlector":
			driver.findElement(By.cssSelector(path)).click();
			break;
		case "name":
			driver.findElement(By.name(path)).click();
			break;
		case "tagName":
			driver.findElement(By.tagName(path)).click();
			break;
			
		case "partialLinkText":
			driver.findElement(By.partialLinkText(path)).click();
			break;
		case "linkText":
			driver.findElement(By.linkText(path)).click();
			break;
		
	}
	}
public static void Click_driver(String path ,String locator) {
	
	switch (locator) {
	case "className":
		driver.findElement(By.className(path)).click();
		break;
	case "id":
		driver.findElement(By.id(path)).click();
		break;
	case "xpath":
		driver.findElement(By.xpath(path)).click();
		break;
	case "cssSlector":
		driver.findElement(By.cssSelector(path)).click();
		break;
	case "name":
		driver.findElement(By.name(path)).click();
		break;
	case "tagName":
		driver.findElement(By.tagName(path)).click();
		break;
		
	case "partialLinkText":
		driver.findElement(By.partialLinkText(path)).click();
		break;
	case "linkText":
		driver.findElement(By.linkText(path)).click();
		break;
	default:
		break;
	}
	
	
}




	public static void WaitForClickable(By by) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(by).click();
		wait.until(ExpectedConditions.elementToBeClickable(by));
		System.out.println("Succesfully click");
	}
	
	public static void click(By by, String msg) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(by).click();
		wait.until(ExpectedConditions.elementToBeClickable(by));
		System.out.println(msg);
	}

	public static void waitforVisibilityOfElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitforVisibilityOfElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf((WebElement) by));
	}

	public static void WaitForElementToBeClickable(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static void fluentWait(final By by) {
		// Waiting 20 seconds for an element to be present on the page, checking for its
		// presence once every 2 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
		});
	}

	public static void selectDropDownListOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectDropDownListOptionByAttribut(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectDropDownListOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void TakeScreenShot(String name) throws Exception {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\ShriramMulti\\eclipse-workspace\\ToolsQA\\Sreen_Shot\\"+"name"+".png");
		FileUtils.copyFile(src, trg);
	}
	public static void ScrollDown(int pix) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+pix+")", "");
	}
	public static void Function(String Action) {
		switch (Action) {
		case "Click":
			
			break;

		default:
			break;
		}
	}
}

