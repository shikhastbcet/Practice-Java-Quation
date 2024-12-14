package Excel_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Apmosys.BaseApmosys;

public class Bank_IDFC_Excel extends BaseApmosys{
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
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
			Thread.sleep(8000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(number);
			driver.findElement(By.xpath("//span[contains(text(),'Proceed to login')]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//input[@name='login-password-input']")).sendKeys(Pass);
			driver.findElement(By.xpath("//span[contains(text(),'Login securely')]")).click();
			System.out.println("Enter OTP");
			driver.findElement(By.xpath("//INPUT[@name='otp']")).click();
			Thread.sleep(19000);  
			driver.findElement(By.xpath("//*[@id=\"app\"]/section/div/div/div[2]/div/button")).click();
			System.out.println("Click on verify Button");
		}
		}
