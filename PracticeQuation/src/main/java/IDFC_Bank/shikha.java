package IDFC_Bank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shikha {
	
	public static WebDriver driver;
	
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("www.google.com");
	}

	public static void main(String[] args) {
		openBrowser();
		

	}

}
