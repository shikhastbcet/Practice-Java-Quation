package Excel_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quizizz {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.name("q")).sendKeys("Join a Quizizz activity - Enter code - Join my quiz" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[contains(text(),'Enter code')]"))
				.click();
		System.out.println("Click on Quizizzes link X");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div/form/input[1]"))
				.sendKeys("shikhazombade3@gmail.com" + Keys.TAB + "Pass@1234" + Keys.ENTER);
		File file = new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Assessment_Link.xlsx");
		System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
//		for(int i=0;i<count;i++) {
		System.out.println(sheet.getRow(0).getLastCellNum());
		double Code;
		// frist row second colum
		Thread.sleep(2000);
		
		Code =sheet.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(Code);
		String code= String.valueOf(Code);
		
			System.out.println("Completed" + " " + Code );
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/form/div/input")).sendKeys(code.substring(0,6
					));
//		}
		
		workbook.close();
		fis.close();

	System.out.println("Login Successfully");
	}
}
