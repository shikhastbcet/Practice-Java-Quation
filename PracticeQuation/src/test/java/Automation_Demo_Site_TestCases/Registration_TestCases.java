package Automation_Demo_Site_TestCases;

import Automation_Demo_Site_Page.Base_Class;
import Automation_Demo_Site_Page.Registration_Page;

public class Registration_TestCases  extends Base_Class{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Launch("chrome");
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		Registration_Page.Register("Shikha","Zombade","Navi Mumbai","shikha@gmail.com","98076543245");
	}

}
