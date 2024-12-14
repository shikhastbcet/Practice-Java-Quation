package Excel_Operation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SensexTable_To_Excel {
	static 	WebDriver driver;
	static 	List<WebElement>   col;

	public static void table_Read() throws  Exception {
		File f=new File("C:\\Users\\ShriramMulti\\Desktop\\Apmosys\\Sensex1.xlsx");
		//set path where you want Store extracted data 
		Thread.sleep(5000);
	
		//take input Stream pass File reffarnce veriable
	FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet sheet=wb.getSheet("Sheet1");
		Thread.sleep(2000);
		//Whole table path
		WebElement table=driver.findElement(By.xpath("//table[@class='stripped-table']"));
		//Whole table body
		WebElement tbody=table.findElement(By.tagName("tbody"));
		//Table Row's
		List<WebElement>   row=tbody.findElements(By.tagName("tr"));
		String data = null;
		//Size of Table
		int row_size=row.size();
		System.out.println(row_size);
		for (int i = 0;i<row.size();i++) {	
			//Send data from Row
			Row r= sheet.createRow(i);
			col=row.get(i).findElements(By.tagName("td"));
			for (int j = 0;j<col.size();j++) {										
				//send  data from cell
				Cell c=r.createCell(j);
				data=col.get(j).getText();
				System.out.print (" "+data);
				//set Velue in cell
				c.setCellValue(data);
			}
			System.out.println("");
		}
	
		float cp;
		int Num_Row=sheet.getLastRowNum(); 
		for (int i = 0; i < Num_Row; i++) {
						
				String price= sheet.getRow(i).getCell(1).getStringCellValue();		
				String price1= sheet.getRow(i+1).getCell(1).getStringCellValue();		
				Float P=Float.parseFloat(price);
				Float P1=Float.parseFloat(price1);
				for (int j = i+1; j <Num_Row; j++) {
		 
					
				}
				if(P<P1) {
					cp=P1;
					P1=P;
					P=cp;
					System.out.print("  "+P);
				}
			}
	
		
		//close all operation		
		fis.close();
		FileOutputStream  fos= new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
	
	
	}


		//close all operation		
//		fis.close();
//		FileOutputStream  fos= new FileOutputStream(f);
//		wb.write(fos);
//		fos.close();
//		wb.close();


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Personal Document\\Documents of shikha\\Software\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.bqprime.com/markets/equities/stocks-in-indices");
		driver.manage().window().maximize();
		table_Read() ;

	}

}
