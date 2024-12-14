package i_shine;

import org.openqa.selenium.By;

import Apmosys.BaseApmosys;

public class i_shine_Test extends BaseApmosys{
public static void sendKeys(String path,String value) {
	driver.findElement(By.xpath(path)).sendKeys(value);
}

public static void Click_driver(String locator,String path ) {
//	
//	switch (locator) {
//	case "className":
//		driver.findElement(By.className(path)).click();
//		break;
//	case "id":
//		driver.findElement(By.id(path)).click();
//		break;
//	case "xpath":
//		driver.findElement(By.xpath(path)).click();
//		break;
//	case "cssSlector":
//		driver.findElement(By.cssSelector(path)).click();
//		break;
//	case "name":
//		driver.findElement(By.name(path)).click();
//		break;
//	case "tagName":
//		driver.findElement(By.tagName(path)).click();
//		break;
//
//	case "partialLinkText":
//		driver.findElement(By.partialLinkText(path)).click();
//		break;
//	case "linkText":
//		driver.findElement(By.linkText(path)).click();
//		break;
//	default:
//		break;
//		
//	}
	
	
	if(locator=="className") {
		System.out.println("fhfjhjkjk.kl;/l,.");
		driver.findElement(By.className("'"+path+"'")).click();
		
	}
	
}
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
        Launch("chrome");
     driver.navigate().to("https://ishine.apmosys.com/#/login");
     sendKeys("//*[@id=\"username\"]","Shikha@1234345"); 
     sendKeys("//*[@id=\"userPassword\"]","Dhonoa@1234345");
     //
     Click_driver("className","btn btn-primary btn-block login__btn");
	}

}
