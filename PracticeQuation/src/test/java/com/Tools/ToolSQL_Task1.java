package com.Tools;

import java.awt.AWTException; 
import java.awt.Robot;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToolSQL_Task1 {
	public static WebDriver driver;
	public static String parent;
	public static void Modal_Dialogs() throws InterruptedException {
//		Modal Dialogs
		driver.findElement(By.xpath("//span[contains(text(),'Modal Dialogs')]")).click();
		driver.findElement(By.id("showSmallModal")).click();
		  Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

		
	}
  public static void Nested_Frames(JavascriptExecutor js) throws InterruptedException, AWTException {
	  Thread.sleep(1000);
	  driver.switchTo().window(parent);
	  js.executeScript("window.scrollBy(0,250)", "");
	  driver.findElement(By.xpath("(//*[@id=\"item-3\"])[2]")).click();	
	  driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/iframe")));
	 WebElement a= driver.findElement(By.xpath("/html/body"));
	 System.out.println(a.getText());
	 driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe")));
	 WebElement b=driver.findElement(By.xpath("/html/body/p"));
	 System.out.println(b.getText());
	 driver.switchTo().window(parent);
    System.out.println("Click on Nested_Frames");
    js.executeScript("window.scrollBy(0,350)", "");
    }
	public static void Frames(JavascriptExecutor js) throws InterruptedException {
		js.executeScript("window.scrollBy(0,250)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//span[contains(text(),'Frames')])[1]")).click();
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		WebElement str=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println(str.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame2\"]")));
		WebElement str1=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println(str1.getText());
		 	}
	public static void Alert_Frame_Windows(String parent) throws Exception {
		driver.findElement(By.xpath("//div[contains(text(),'Alerts, Frame & Windows')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();
		driver.findElement(By.xpath("//*[@id=\"tabButton\"]")).click();
		System.out.println("Click on New tab");
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		System.out.println("Click on New Window");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='messageWindowButton']")).click();
		System.out.println("Click on New Window Message");
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parent)) {
				driver.switchTo().window(handle);
				Thread.sleep(4000);
				driver.close();
			}
		}
//		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		System.out.println("Click on Alerts");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Zombade Shikha");
		alert3.accept();
		System.out.println("Alerts, Frame & Windows");
	}
	public static void Forms(JavascriptExecutor js) throws Exception {
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Forms')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		driver.findElement(By.id("firstName"))
				.sendKeys("Shikha" + Keys.TAB + "Zombade" + Keys.TAB + "Zombadeshikha@gmail.com" + Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210" + Keys.TAB);
		Select slt = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		slt.selectByIndex(11);
		System.out.println("Click on Forms");
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByVisibleText("2000");
		Thread.sleep(2300);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"))
				.click();
		Robot rb = new Robot();
		rb.mouseWheel(50);
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		act.sendKeys(sub, "Math" + Keys.ENTER).build().perform();
//		act.sendKeys("Maths").build().perform();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"))
				.sendKeys("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Text.docx");
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"))
				.sendKeys("Sector 4, Navi Mumbai" + Keys.TAB + "" + Keys.TAB + "" + Keys.ENTER);
		System.out.println("Subject is send");
		Thread.sleep(4000);
		driver.navigate().back();
	}

	public static void Dynamic_Properties(JavascriptExecutor js) throws Exception {
		
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[9]/span")).click();
//		driver.findElement(By.xpath("//button[coँntains(text(),'Will enable 5 seconds')]")).click();
		System.out.println("Will enable 5 seconds");
		driver.findElement(By.xpath("//button[contains(text(),'Color Change')]")).click();
		System.out.println("Color Change");
		Thread.sleep(9900);
		driver.findElement(By.xpath("//button[contains(text(),'Visible After 5 Seconds')]")).click();
		System.out.println("Visible After 5 Seconds");
	}

	public static void Upload_and_Download(JavascriptExecutor js) throws Exception {
		// Upload and Download
	
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
		System.out.println("File Download");
		driver.findElement(By.id("uploadFile"))
				.sendKeys("G:\\Personal Document\\Documents of shikha\\ZombbadeShikhaResume2022.docx");
		System.out.println("File Upload");
	}

	public static void Broken_Links(	JavascriptExecutor js) throws Exception {
	
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),'Broken Links - Images')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here for Valid Link')]")).click();
		System.out.println("Click Here for Valid Link");
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Back to Parent Window");

	}

	public static void Links_Operation(String parent,JavascriptExecutor js) throws Exception {
		// Click Operations Links
		
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Links')]")).click();
		System.out.println("Web_Tables Operation Done");
		driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]")).click();
		driver.getWindowHandle();
		driver.switchTo().window(parent);
		System.out.println("Static Link  Operation Done");
		Thread.sleep(9000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("(//a[contains(text(),'Home')])[2]")).click();
		driver.getWindowHandle();
		driver.switchTo().window(parent);
//		System.out.println("Dynamic Link  Operation Done");
		Thread.sleep(9000);
		driver.switchTo().window(parent);
	}

	public static void Buttons_Click_Operations(JavascriptExecutor js) throws Exception {
		// Click Operations Buttons_Click_Operations
	
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
		System.out.println("Buttons_Click  Operation Done");
	}

	public static void Web_Tables() throws Exception {
		// Click Web Tables
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]")).click();
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName"))
				.sendKeys("Shikha" + Keys.TAB + "Zombade" + Keys.TAB + "ZombadeShikha@gmail.com" + Keys.TAB + "22"
						+ Keys.TAB + "00000" + Keys.TAB + "Automation" + Keys.TAB + Keys.ENTER);
		Thread.sleep(9000);

		System.out.println("Web_Tables Operation Done");
		Thread.sleep(3000);
		driver.findElement(By.id("searchBox")).sendKeys("Shikha");
		driver.findElement(By.id("delete-record-4")).click();
		System.out.println("Web_Table is Succesfully Deleted");
		driver.findElement(By.id("searchBox")).clear();
		driver.findElement(By.id("basic-addon2")).click();
	}

	public static void Radio_Button() throws Exception {
		// Click Radio_Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for=\"yesRadio\"]")).click();
		System.out.println("Radio_Button Operation Done");
	}

	public static void Check_Box() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.id("item-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Desktop')]")).click();
		System.out.println("Check_Box Operation Done");

	}

	public static void Text_Box(JavascriptExecutor js) throws Exception {
		// TODO Auto-generated method stub
//		Thread.sleep(9900);
		driver.findElement(By.id("userName")).sendKeys("Zombade Shikha Kalidas" + Keys.TAB + "Zombadeshikha@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Sector 4,Navi Mumbai" + Keys.TAB + "Tuljapur");
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		System.out.println("Text_Box Operation Done");
		parent = driver.getWindowHandle();

	}
	public static void Launch_WithHead_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\selenium\\chromedriver.exe"); // Set the property or		
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}
public static void Launch_Headless_Browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\selenium\\chromedriver.exe"); // Set the property or
	ChromeOptions Option =new ChromeOptions();
	Option.addArguments("--headless");
	driver = new ChromeDriver(Option);
	driver.navigate().to("https://demoqa.com/text-box");
	driver.manage().window().maximize();
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Launch_WithHead_Browser();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Text_Box(js);
		Check_Box();
		Radio_Button();
		Web_Tables();
		Buttons_Click_Operations(js);
		String Parent = driver.getWindowHandle();
		Links_Operation(parent,js);
		Broken_Links(js);
//		Upload_and_Download();
		Dynamic_Properties(js);
		Forms(js);
		Alert_Frame_Windows(parent);
		Frames(js);
		js.executeScript("window.scrollBy(0,250)", "");
		Nested_Frames(js);
		Modal_Dialogs();
	}

}

