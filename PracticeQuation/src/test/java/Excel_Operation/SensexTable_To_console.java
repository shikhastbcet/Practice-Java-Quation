package Excel_Operation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SensexTable_To_console {
	static 	WebDriver driver;

	public static void table_Read() {
		WebElement table=driver.findElement(By.xpath("//*[@id=\"stock-in-indices-landing\"]"));
		WebElement tbody=table.findElement(By.tagName("tbody"));				
		List<WebElement>  tr=tbody.findElements(By.tagName("tr"));	

		for (int i=0;i<tr.size();i++) {
			List<WebElement> 	td=tr.get(i).findElements(By.tagName("td"));
			for(int j=0; j<td.size();j++) {
				String s=td.get(j).getText();
				System.out.print("\t "+s);				
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Personal Document\\\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.bqprime.com/markets/equities/stocks-in-indices");
		driver.manage().window().maximize();
		table_Read() ;

	}

}