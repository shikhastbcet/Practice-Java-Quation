package Excel_Operation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedFF {

	public  static ChromeDriver driver;
	public static float p,p1,F;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Gainers / Losers')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
		WebElement table =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		WebElement tbody =table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
		List<WebElement>   row=tbody.findElements(By.tagName("tr"));
		List<WebElement> tr=tbody.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		List<WebElement> td=tbody.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		String min=td.get(1).getText();
		String F=min.replace(",","");
		Float FP=Float.parseFloat(F);
		String S = null;
System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]")).getText()+"\t\t\t\t "+driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[4]")).getText());
		for(int i=1;i<tr.size();i++) {
			String T1=td.get(i).getText();
			String T2=T1.replace(",","");
			p=Float.parseFloat(T2);
			if (p<FP) {
				FP=p;
			 S=tr.get(i).getText();
				
			}
		}
		System.out.println(S+"\t\t\t"+FP);
		//	for (WebElement webElement : tr) {
		//		String T=webElement.getText();
		//		System.out.println(T);
		//	}
		//	for (WebElement webElement : td) {
		//		String T=webElement.getText();
		//		System.out.println("   " +T);
		//	}

		//		System.out.println( "Company Name :"+driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[5]/td[1]")).getText()+"  \nPrice"+driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[5]/td[4]")).getText());
		//	=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));

	}

}
