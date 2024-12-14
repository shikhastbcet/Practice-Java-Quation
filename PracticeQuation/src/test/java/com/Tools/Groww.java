package com.Tools;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Apmosys.BaseApmosys;

public class Groww extends BaseApmosys {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();// Set the property or		
		driver.navigate().to("https://groww.in/stocks/yes-bank-ltd");
		driver.manage().window().maximize();
Thread.sleep(2000);
//System.out.print( driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[1]/span[2]/span[3]")).getText());
//System.out.print( driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[2]/span[2]/span[2]")).getText());
//System.out.print( driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[4]/span[2]/span[4]")).getText());
//System.out.println( driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[2]/span[2]/span[1]")).getText());
//String f= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[1]/span[2]/span[3]")).getText();
//String s=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[2]/span[2]/span[2]")).getText();
//String t=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[4]/span[2]/span[4]")).getText();
//String ff= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[2]/span[2]/span[1]")).getText();
//
//String value=f+s+"."+t+ff;
//System.out.println(value);
//System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]/span[2]")).getText());
List<WebElement>	Value=driver.findElements(By.xpath("//span[@class=\"lpu38Pri fs28 \"]"));
List<WebElement>	dot=driver.findElements(By.xpath("//span[@style=\"overflow: hidden; display: inline-block; position: relative;\"]"));
int i=dot.size();
for(WebElement V:Value) {
	String s=V.getText();
	System.out.println(s);
	for(WebElement D:dot) {		
		if(D.getText().equals(s)) {
			System.out.println(D.getText());
				}
	}
}
//System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div[3]/div/div[1]/span[2]")).getText()); 
}
	

}
