package Apmosys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Price_Compare {

	private static final int PriceAtAmezom1 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PriceAtAmezom1;
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.navigate().to("https://www.amazon.in/");		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy M32 Prime Edition (Light Blue, 6GB RAM, 128GB)"+Keys.ENTER);
        String PriceAtAmezom= driver.findElement(By.xpath("//div[@data-index=\"2\"]/descendant::span[25]")).getText();
        System.out.println(PriceAtAmezom);
        PriceAtAmezom=PriceAtAmezom.replace(",","");
        PriceAtAmezom=PriceAtAmezom.replace("₹","");
			 PriceAtAmezom1=Integer.parseInt(PriceAtAmezom);
        System.out.println("Price At Amezom1 "+PriceAtAmezom1);
		
		
     /*  driver.switchTo().newWindow(WindowType.TAB);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
    	driver.navigate().to("https://www.smartprix.com/");
    	driver.findElement(By.name("q")).sendKeys("Samsung Galaxy M32 Prime Edition (Light Blue, 6GB RAM, 128GB)"+Keys.ENTER);    	
       String PriceAtSmartprix=driver.findElement(By.xpath("//*[@id=\"app\"]/main/div[1]/div[2]/div[2]/div[1]/span[1]")).getText();
       PriceAtSmartprix=PriceAtSmartprix.replace(",","");
       PriceAtSmartprix=PriceAtSmartprix.replace("₹","");
		int PriceAtSmartprix1=Integer.parseInt(PriceAtSmartprix);
       System.out.println("Price At Smartprix "+PriceAtSmartprix1);
       
      driver.switchTo().newWindow(WindowType.TAB);
       driver.navigate().to("https://howzzthat.com/");
       driver.findElement(By.xpath("//summary[@aria-label=\"Search\"][1]")).sendKeys("Samsung Galaxy M32 Prime Edition (Light Blue, 6GB RAM, 128GB)"+Keys.ENTER);
      String PriceAtHowzzhat=driver.findElement(By.xpath("//span[@class=\"price-item price-item--regular\"]")).getText();
      PriceAtHowzzhat=PriceAtHowzzhat.substring(5,10);
  
      PriceAtHowzzhat=PriceAtHowzzhat.replace(",","");  
		int PriceAtHowzzhat1=Integer.parseInt(PriceAtHowzzhat);
	    System.out.println("Price At Howzzhat "+PriceAtHowzzhat1);
	    
	    if(PriceAtAmezom1<PriceAtSmartprix1 && PriceAtHowzzhat1 < PriceAtSmartprix1 ) {
	    		    	System.out.println("Price of mobile is Gteatest on PriceAtSmartprix1 "+PriceAtSmartprix1);		
	    	}
	       if(PriceAtAmezom1<PriceAtHowzzhat1 && PriceAtSmartprix1<PriceAtHowzzhat1 ) {
	    	   System.out.println("Price of mobile is Gteatest on Price At Howzzhat "+PriceAtHowzzhat1);		
	    	  	       }
	       if(PriceAtHowzzhat1<PriceAtAmezom1 && PriceAtSmartprix1<PriceAtAmezom1) {
	    	   System.out.println("Price of mobile is Gteatest on Price At Amezom "+PriceAtAmezom1);
	       }
	       
	       */
	    }
	    
	   
	}


