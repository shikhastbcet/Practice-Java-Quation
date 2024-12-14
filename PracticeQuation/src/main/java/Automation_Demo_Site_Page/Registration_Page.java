package Automation_Demo_Site_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Registration_Page extends Base_Class{
	static By r=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	static By Gender=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]");
	static By Hobbie =By.id("checkbox1");
	static By Hobbie1 =By.id("checkbox3");
	static By File=By.xpath("//*[@id=\"imagesrc\"]");
	static By lang=By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]");
	static By Languege=By.xpath("//a[contains(text(),'English')]");
public static void Register(String username,String lastname,String add,String email,String phon) throws InterruptedException {
	driver.findElement(r).sendKeys(username,Keys.TAB,lastname,Keys.TAB,add,Keys.TAB,email,Keys.TAB,phon);
	driver.findElement(Gender).click();
	driver.findElement(Hobbie).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "");
	driver.findElement(Hobbie1).click();
	driver.findElement(File).sendKeys("G:\\Personal Document\\Documents of shikha\\2 sem.jpg");
	Actions act=new Actions(driver);
act.click(driver.findElement(lang)).sendKeys(Keys.ENTER,Keys.PAGE_DOWN,Keys.ENTER).build().perform();
//act.click(driver.findElement(Languege)).build().perform();
Thread.sleep(3000);
}


	
}
