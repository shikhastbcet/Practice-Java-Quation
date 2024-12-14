package com.Tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayList_com {
	static WebDriver driver;
	static public 	ArrayList l;

	public static void sort_amount() throws Exception {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 l = new ArrayList<>();
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		List<WebElement> row = driver.findElements(By.xpath("//div[@role=\"gridcell\"][5]"));
		int t=3;
		for (WebElement r : row) {
			String str = r.getText();
			if (str !=null) {
				System.out.println("turt");
				int i = Integer.parseInt(str);
				l.add(i);
			
			}
		}
		System.out.println(l);
	}

	public static void min_salary() {
		 for (int i = 0; i < l.size() - 1; i++) {	           
	            int currentNumber = (int) l.get(i);
        int nextNumber = (int) l.get(i + 1);
        if (currentNumber < nextNumber) {
            System.out.println(currentNumber + " is less than " + nextNumber);
        } else if (currentNumber > nextNumber) {
            System.out.println(currentNumber + " is greater than " + nextNumber);
        }
		 }
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ShriramMulti\\Shikha\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.navigate().to("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		sort_amount();
		min_salary();
	}

}
