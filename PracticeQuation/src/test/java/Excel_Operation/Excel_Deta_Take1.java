package Excel_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Excel_Deta_Take1 {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
	 	String s = "C:/Users/ShriramMulti/Desktop/Apmosys/Apmosys_Email.xlsx";
		Excel excel = new Excel(s);
		int a = 0;
		int row = excel.getrowcount(a);
		String Username, Password;
		for (int i = 0; i <= row; i++) {

			Username = excel.get_data(0, i, 0);
			Password = excel.get_data(0, i, 1);

			driver = new ChromeDriver();
			driver.manage().window().maximize();

			Thread.sleep(5000);
			driver.get(" http://mail.apmosys.com/ ");
			Thread.sleep(5000);
			driver.findElement(By.name("email-address")).sendKeys(Username);
			System.out.println("username :-- " + Username);

			Thread.sleep(6000);
			driver.findElement(By.name("next")).click();
			Thread.sleep(6000);
			driver.findElement(By.name("password")).sendKeys(Password);

			System.out.println("Password :-- " + Password);

			driver.findElement(By.name("next")).click();
			Thread.sleep(6000);
			String Title= driver.getTitle();
			System.out.println(Title);
			System.out.println("Data read from excel");
			Thread.sleep(5000);
			// driver.quit();

		}
	}
}
