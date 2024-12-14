package com.Tools;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Apmosys.BaseApmosys;

public class URl_Copy_Pest extends BaseApmosys  {
	
public static void main(String[] args) throws Exception {
	Launch("chrome");
	driver.navigate().to("https://smile.amazon.com/gp/charity/homepage.html");
	ScrollDown(1500);
	WebElement url= driver.findElement(By.xpath("(//a[@class=\"a-size-base-plus a-link-normal footer-link\"])[3]"));
	Actions act=new Actions(driver);
	act.contextClick(url).build().perform();
	act.keyDown(Keys.UP).build().perform();
	act.keyUp(Keys.UP).build().perform();
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_PAGE_UP+KeyEvent.VK_UP+KeyEvent.VK_ENTER);
}
}
