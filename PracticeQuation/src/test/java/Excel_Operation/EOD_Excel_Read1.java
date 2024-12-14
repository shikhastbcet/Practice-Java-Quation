package Excel_Operation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EOD_Excel_Read1 {
     static WebDriver driver;
	static String ParentId = null;
	static String ChildId = null;

	
	
	public static void EOD() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id=\"sidebar-menu\"]/descendant::li[12]")).click();
		driver.findElement(By.xpath("//div[@id='sidebar-menu']/descendant::li[12]/descendant::li[2]")).click();
		driver.findElement(By.name("txtFromDate")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(text(),'Oct')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("viewEodDataTable_length")).click();
		driver.findElement(By.xpath("//option[contains(text(),'50')]")).click();
	}

	public static void Apmosys_Login() throws InterruptedException {
		driver.navigate().to("http://www.apmosys.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("mega-menu-item-1513")).click();
		driver.findElement(By.id("mega-menu-item-1514")).click();
		driver.findElement(By.name("username")).sendKeys("Shikha.Zombade@apmosys.com");
		driver.findElement(By.id("password")).sendKeys("Apmosys@123");
		driver.findElement(By.id("submitButton")).click();
		System.out.println("OTP Sent ");
		String parentId = driver.getWindowHandle();
		System.out.println("Parent" + parentId);
		ParentId = parentId;
	}

	public static void switchWindow(String otp) throws InterruptedException {
		Thread.sleep(30000);
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("otp")).sendKeys(otp+""+Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.className("btn")).click();
	}

	public static String Email() throws InterruptedException {
		System.out.println("Email Open ");
		driver.switchTo().newWindow(WindowType.TAB); // Use of open new Window tab
		driver.navigate().to("http://mail.apmosys.com/");
		driver.switchTo().window(driver.getWindowHandle()); // handle new window tab
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.name("email-address")).sendKeys("Shikha.Zombade@apmosys.com");
		// driver.findElement(By.name("email-address")).sendKeys("Shikha.Zombade@apmosys.com");
		driver.findElement(By.name("next")).click();
		driver.findElement(By.name("password")).sendKeys("Welcome@2022");
		driver.findElement(By.name("next")).click();
		Thread.sleep(9999);
		// This xpath is only for new email that XPATH will be unique on only new email
		// and click on it
//		WebElement fistmail = driver.findElement(By.xpath("//div[@class='CLASS_M unread active']"));
//		fistmail.click();
		// Which inbox email iframe to open email iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='gui.frm_main.main.mailview#frame']"));
		driver.switchTo().frame(frame);
		// and ggettext
		Thread.sleep(4000);
		String Emailotp = driver.findElement(By.xpath("//body[@id='iw_webmail_msg_body']")).getText().substring(20);
		return Emailotp;

	}

	public static void Values_Of_Table() throws InterruptedException, IOException {
		//set path where you want Store extracted data 
		File f=new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Data_in.xlsx");
		//take input Stream pass File reffarnce veriable
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet sheet=wb.getSheet("Sheet1");
		Thread.sleep(2000);
		//Whole table path
//		WebElement table= driver.findElement(By.id("viewEodDataTable"));
		//Whole table body
		WebElement tbody=driver.findElement(By.xpath("//*[@id=\"viewEodDataTable\"]/tbody"));
		//Table Row's
		List<WebElement>   row=tbody.findElements(By.tagName("tr"));
		//Size of Table
		int row_size=row.size();
		float sum=0;
		double var;
		System.out.println(row_size);
		for (int i = 0;i<row.size();i++) {	
			//Send data from Row
			Row r= sheet.createRow(i+1);
			List<WebElement>   col=row.get(i).findElements(By.tagName("td"));
						for (int j = 0;j<col.size();j++) {
							//send  data from cell
							Cell c=r.createCell(j);
							if (j==6) {
								String data1=col.get(j).getText();
								Sysout(data1);
							data1=	data1.replace(":", ".");
							if(data1!="") {														
								Float data2=Float.parseFloat(data1);
							sum+=data2;
							}
							c.setCellValue(data1);
							

						}
							else {
				String data=col.get(j).getText();
				c.setCellValue(data);

							}
				//set Velue in cell
//				System.out.print(data+" ");
			}
			System.out.println("");
		}
		//Calculate total  hr
		Row r1 = sheet.createRow(28);
		Cell c1 = r1.createCell(6);
		c1.setCellValue("=SUM(G2:G27)");
		c1.setCellValue(sum);
		var=sheet.getRow(28).getCell(6).getNumericCellValue();
		System.out.print(var);
		//close all operation		
		fis.close();
		FileOutputStream  fos= new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("END   Total= "+sum);
		
	}
	
	private static void Sysout(String data) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Open Browser Successfully");
		Apmosys_Login();
		System.out.println("Apmosys_Login");
		String OTP = Email();
		System.out.println(OTP);
		System.out.println("Window Successfully switch" + OTP);
		switchWindow(OTP);
		System.out.println("home" + ParentId);
		EOD();
			
	
		Values_Of_Table();
		
		

	}


}

