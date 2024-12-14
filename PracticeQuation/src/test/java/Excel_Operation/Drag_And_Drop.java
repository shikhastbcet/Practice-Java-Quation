package Excel_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement From = driver.findElement(By.xpath("//a[contains(text(),' 5000 ')]"));
		WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	
		
		
		
	}

}
