package IDFC_Bank_Test;

import java.io.File;

import IDFC_Bank.Bank_Base;
import IDFC_Bank.Login_code;

public class Access_Bank extends Bank_Base {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Launch("chrome","https://my.idfcfirstbank.com/login");
		driver.manage().window().maximize();
		Login_code.log_in("Shikha@2000");
		Thread.sleep(5000);
		Login_code.Pay();		
		driver.close();
	
	}

}
