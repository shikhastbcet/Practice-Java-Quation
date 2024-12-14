package ICIC_Prudential;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class ICIC_Page extends ICIC_Base{
//static String url="https://www.icicipruamc.com/";
static String Browser="chrome";
	public static void main(String[] args) throws Exception {
		Launch_Browser(Browser);		
		driver.get("https://www.icicipruamc.com");
		Planes();
	}
	private static void Planes() throws Exception {
		// TODO Auto-generated method stub
//         MouseOver(By.xpath("//*[@class=\"list-inline mainList\"]/li[2]"));
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
//         Click(By.xpath("/html/body/header/div[5]/div/div/div[2]/div[2]/div[1]/ul/li[2]/div[2]/div/div[3]/div/div[2]/div/div[1]/ul/li[1]/a"));
//     System.out.println("Yes");		
 	File f=new File("C:\\Users\\ShriramMulti\\Desktop\\Frame.xlsx");
	System.out.println(f.exists());
//	try {
//		FileInputStream fis=new FileInputStream(f);
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	System.out.println("file not Foud ");
//	}
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet=wb.getSheet("Sheet1");
	int row=sheet.getLastRowNum();
	int col=sheet.getRow(0).getLastCellNum();
	System.out.println(row+"    "+col);
	System.out.println("-----------------------------------Successful--------------------------------------------");
	}

	
}
