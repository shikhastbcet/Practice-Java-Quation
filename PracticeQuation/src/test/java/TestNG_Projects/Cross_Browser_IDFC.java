package TestNG_Projects;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_IDFC {


	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeTest
	public static void Launch(String str) {
		switch (str) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");// Set the property
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver","G:\\Personal Document\\Documents of shikha\\Software\\selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "mozila":
			System.setProperty("webdriver.gecko.driver","G:\\Personal Document\\Documents of shikha\\Software\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
		@Test
		private static void IDFC() throws Exception {

			File file = new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\IDFC.xlsx");
			System.out.println(file.exists());
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int count=sheet.getLastRowNum();
			int noOfColums = sheet.getRow(0).getLastCellNum();
			String  Pass;

			long  Number = (long) sheet.getRow(0).getCell(1).getNumericCellValue();
			String number= String.valueOf(Number);
			//frist row second colum
			Pass= sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(Pass+" "+Number);
			driver.navigate().to("https://my.idfcfirstbank.com/login");
//			Thread.sleep(8000);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//			driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(number);
//			driver.findElement(By.xpath("//span[contains(text(),'Proceed to login')]")).click();
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//input[@name='login-password-input']")).sendKeys(Pass);
//			driver.findElement(By.xpath("//span[contains(text(),'Login securely')]")).click();
//			System.out.println("Enter OTP");
//			driver.findElement(By.xpath("//INPUT[@name='otp']")).click();
//			Thread.sleep(19000);  
//			driver.findElement(By.xpath("//*[@id=\"app\"]/section/div/div/div[2]/div/button")).click();
//			System.out.println("Click on verify Button");
		}
	}
