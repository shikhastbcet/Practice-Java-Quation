package TestNG_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Calender_Handle {
	public static WebDriver driver;
	public static  String Year;
	public static  	 List<WebElement> td;
	public static  String year;
	public static  String Day;
		@Parameters("FName")//to pass these parameters in method you have to run these file in suit on xml 
	@Test(priority = 1)
	public static void Launch(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriramMulti\\Shikha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Tuljapur",Keys.ENTER,"",Keys.TAB,"pune",Keys.ENTER,"",Keys.TAB);
	}


	@Test(priority = 2)

	public static void Year() throws InterruptedException {
		year="Dec 2023";
		Day="31";
		for(int i=1;i<=1000;i++) {
			Year=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();

			if(year.equalsIgnoreCase(Year)) {
				td = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));    		 
				for(WebElement D: td) {
					if(Day.equalsIgnoreCase(D.getText())) {
						//	    			System.out.println(Day.equalsIgnoreCase(D.getText()));
						Thread.sleep(2000);
						driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td[text()='"+Day+"']")).click();
						System.out.println("Your selected Date is "+Day+" "+year);
						break;
					}
				}
				break;
			}
			//			 System.out.println(Year+"             "+str);
			driver.findElement(By.className("next")).click();
		}

	}
}