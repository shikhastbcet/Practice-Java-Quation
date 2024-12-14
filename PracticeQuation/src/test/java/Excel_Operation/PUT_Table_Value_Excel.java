package Excel_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PUT_Table_Value_Excel{
	public static WebDriver driver;
	public static void Values_Of_Table() throws InterruptedException, IOException {
		//set path where you want Store extracted data 
		File f=new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Book2.xlsx");
		//take input Stream pass File reffarnce veriable
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet sheet=wb.getSheet("Sheet1");
		Thread.sleep(2000);
		//Whole table path
		WebElement table= driver.findElement(By.id("lockTablePlaceholder"));
		//Whole table body
		WebElement tbody=table.findElement(By.tagName("tbody"));
		//Table Row's
		List<WebElement>   row=tbody.findElements(By.tagName("tr"));
		//Size of Table
		int row_size=row.size();
		System.out.println(row_size);
		for (int i = 0;i<row.size();i++) {	
			//Send data from Row
			Row r= sheet.createRow(i+1);
			List<WebElement>   col=row.get(i).findElements(By.tagName("td"));
						for (int j = 0;j<col.size();j++) {
							//send  data from cell
							Cell c=r.createCell(j);
				String data=col.get(j).getText();
				//set Velue in cell
				c.setCellValue(data);
			}
			System.out.println("");
		}
		//close all operation		
		fis.close();
		FileOutputStream  fos= new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
		
	}
	public static void Login() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.TAB+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[3]/a")).click();
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Login();
		Values_Of_Table();

	}

}
