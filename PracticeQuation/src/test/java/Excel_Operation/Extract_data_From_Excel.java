package Excel_Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extract_data_From_Excel {
public static 	WebDriver driver;

public static void Apmosys() throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://apmosys.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[text()='Login'])[1]")).click();
	driver.findElement(By.xpath("(//*[text()='Employee'])[1]")).click();
	driver.findElement(By.name("username")).sendKeys("prabhat.singh@apmosys.com");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Apmosys@123");
	driver.findElement(By.id("submitButton")).click();
	Thread.sleep(2000);
	
	driver.get("https://mail.apmosys.com/webmail/#sign-in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("email-address")).sendKeys("prabhat.singh@apmosys.com");
	 Thread.sleep(2000);
	driver.findElement(By.name("next")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Welcome@2022");
	Thread.sleep(2000);
	driver.findElement(By.name("next")).click();
	Thread.sleep(4000);
	driver.switchTo().frame(driver.findElement(By.id("gui.frm_main.main.mailview#frame")));
	Thread.sleep(4000);
   String s=driver.findElement(By.id("iw_webmail_msg_body")).getText();
   System.out.println(s);
//   String x=s.substring(21, 27);
//   System.out.println(x);
   driver.close();
   Thread.sleep(2000);
   String x=s.substring(21, 27);
   driver.findElement(By.id("otp")).sendKeys(x);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@class='btn']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@class='fa fa-file-text-o']")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/div/ul/li[6]/ul/li[2]/a")).click();
   Thread.sleep(3000);
   
   
 
}
	public static void main (String[] args) throws Exception {
//
//		System.setProperty("webdriver.chrome.driver","G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
//		 driver = new ChromeDriver();
		 File file=new File("C:\\Users\\prabh\\OneDrive\\Desktop\\Email.xlsx");
	      FileInputStream finput =new FileInputStream(file);
	     XSSFWorkbook wb=new XSSFWorkbook(finput);
	     XSSFSheet sheet=wb.getSheet("abcd");
	

		WebElement table= driver.findElement(By.id("viewEodDataTable_wrapper"));
		List <WebElement> row= table.findElements(By.tagName("tr"));
		int rcount=row.size();
		//System.out.print("no. of rows are " +" "+rcount);
		for (int r=0;r<rcount;r++)
		{
			Row R=sheet.createRow(r+1);
			
			List <WebElement> column= row.get(r).findElements(By.tagName("td"));
			int ccount=column.size();
		    //System.out.println("\n");
			for (int c=0;c<ccount;c++)
			{
				String c1=column.get(c).getText();
				Cell c2= R.createCell(c);
				c2.setCellValue(c1);
			}
			
		}
		System.out.println("Desired work is done");
	finput.close();
	FileOutputStream foutput =new FileOutputStream(file);
	wb.write(foutput);
	foutput.close();
	wb.close();
//	 Apmosys();
		
		
	}

}