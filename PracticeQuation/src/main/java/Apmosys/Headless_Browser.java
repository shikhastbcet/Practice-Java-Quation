package Apmosys;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Headless_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
			ChromeOptions Option =new ChromeOptions();
			Option.addArguments("--headless");
		WebDriver	driver = new ChromeDriver(Option); // navigate the websiite


			driver.navigate().to("https://www.amazon.in/");      	
			Select select = new Select(driver.findElement(By.id("searchDropdownBox")));  //select Computers & Accessories OPtion 
			select.selectByVisibleText("Computers & Accessories");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			String PriceAtAmezon = driver.findElement(By.xpath("//div[@data-index=\"2\"]/descendant::span[@class=\"a-price-whole\"][1]")).getText();
			PriceAtAmezon = PriceAtAmezon.replace(",", "");
			PriceAtAmezon = PriceAtAmezon.replace("₹", "");
		int	PriceLap1 = Integer.parseInt(PriceAtAmezon);
			System.out.println("FINAL PRICE on AMEZON " + PriceLap1);
		

	}

}
