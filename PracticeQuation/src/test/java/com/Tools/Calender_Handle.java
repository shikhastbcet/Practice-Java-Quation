package com.Tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Handle {
public static WebDriver driver;
public static String Year;
public static 	 List<WebElement> td;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
 // Set the property or		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Tuljapur",Keys.ENTER,"",Keys.TAB,"pune",Keys.ENTER,"",Keys.TAB);


		
	String year="Dec 2023";
    String Day="31";
		for(int i=1;i<=1000;i++) {
		 Year=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
		 
    	 if(year.equalsIgnoreCase(Year)) {
    		 System.out.println(Year);
    		 td = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));    		 
    		 for(WebElement D: td) {
    			 if(Day.equalsIgnoreCase(D.getText())) {
//    			System.out.println(Day.equalsIgnoreCase(D.getText()));
    			Thread.sleep(2000);
    			 driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td[text()='"+Day+"']")).click();
    			System.out.println("Your selected Date is "+Day+" "+year);
    			 break;
    		 }
    		 }
    		 break;
    	 }
//		 System.out.println(Year+"             "+str);
    	 driver.findElement(By.className("next")).click();
     }
   	 driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
   	 System.out.println("ghghngjmjgh");

	}

}
