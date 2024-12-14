package Extends_Report;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extends_Report {

	public static ExtentReports extent = new ExtentReports();
	public 	static ExtentSparkReporter ES=new ExtentSparkReporter("Extent.html");

	@BeforeTest
	public static void BeforeTest(){
		extent.attachReporter(ES);
	}
	@Test
	public static void Test1(){
	ExtentTest ET=extent.createTest("Launch Browser");
    ET.log(Status.PASS,"User Launch Brawser ");
    ET.pass("User Launch Brawser succesfully");
	}
	@Test
	public static void Test2(){
	ExtentTest ET=extent.createTest("Launch Browser");
	
	    ET.info("User User login succesfully");
	    ET.pass("User logout into application");
	    ET.warning("Reset Password");
	}
	@Test
	public static void Test3(){
	ExtentTest ET=extent.createTest("Launch Browser");
	ET.skip("Verify Browser");
	}
	public static void Test4(){
		ExtentTest ET=extent.createTest("Launch Browser");
		ET.fail("User getting crashed");
		}
	@Test
	public static void Test5(){
	ExtentTest ET=extent.createTest("Launch Browser");	
	  ET.pass("Verify Browser");
	    ET.info("User LogOut  succesfully");
	  
	}
	@AfterTest
	public static void AfterTest(){
extent.flush();
}
}
