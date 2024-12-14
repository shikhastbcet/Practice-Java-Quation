package Excel_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_From_Excel1 {
static 	WebDriver driver;

//	public String[][] getDataFromExcel() throws IOException {
//		File file = new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Apmosys_Email.xlsx");
//		FileInputStream fis = new FileInputStream(file);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//
//		int noOfRows = sheet.getPhysicalNumberOfRows();
//		int noOfColums = sheet.getRow(0).getLastCellNum();
//
//		String[][] data = new String[noOfRows - 1][noOfColums];
//
//		for (int i = 0; i < noOfRows - 1; i++) {
//			for (int j = 0; j < noOfColums; j++) {
//				DataFormatter df = new DataFormatter();
//				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
//
//			}
//		}
//		workbook.close();
//		fis.close();
//		return data;
// 
//	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		File file = new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Apmosys_Email.xlsx");
		System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count=sheet.getLastRowNum();
		int noOfColums = sheet.getRow(0).getLastCellNum();
		String Email, Pass;
		for (int i= 0; i < count; i++) {
			
			//first row frist colum
			Email= sheet.getRow(i).getCell(0).getStringCellValue();
			//frist row second colum
			Pass= sheet.getRow(i).getCell(1).getStringCellValue();

			 driver.navigate().to("http://mail.apmosys.com/");		
				driver.switchTo().window(driver.getWindowHandle()); // handle new window tab
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.name("email-address")).sendKeys(Email);
				// driver.findElement(By.name("email-address")).sendKeys("Shikha.Zombade@apmosys.com");
				driver.findElement(By.name("next")).click();
				driver.findElement(By.name("password")).sendKeys(Pass);
				driver.findElement(By.name("next")).click();
			Thread.sleep(50);
			System.out.println("Completed"+i+ " "+ Email+"          Pass: "+Pass);
			
		}
		workbook.close();
		fis.close();
		
	}

}
