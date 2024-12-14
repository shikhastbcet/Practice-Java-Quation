package TestNG_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowser {
public  WebDriver driver;

public void Chrome() {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");// Set the property or
	driver = new ChromeDriver();
	System.out.println("Open Browser Successfully");
}
}
