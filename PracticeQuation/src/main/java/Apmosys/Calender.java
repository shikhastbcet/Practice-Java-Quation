package Apmosys;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	static WebDriver driver;

	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	public static void click(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(by).click();
		wait.until(ExpectedConditions.elementToBeClickable(by));

	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.navigate().to("http://radcard.idatamap.com/landing");
Thread.sleep(3000);
ScrollDown();
click(By.xpath("//*[@class=\"patient\"]"));
		Scanner scanner = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Date");
		String[] arrOfStr;
				String Date = scanner.next();
		if (Date.contains(":")) {
			String[] words = Date.split(":");
				 arrOfStr = Date.split(":");
			for (String a : arrOfStr)
				System.out.println(a);
		}
		if (Date.contains("/")) {
			String[] words = Date.split("/");
			arrOfStr = Date.split("/");
			for (String a : arrOfStr)
				System.out.println(a);
		}
		if (Date.contains(".")) {
			String[] words = Date.split(".");
			System.out.println(words.length);
			 arrOfStr = Date.split("[.]");
			for (String a : arrOfStr)
				System.out.println(a);
		}
	}

}

