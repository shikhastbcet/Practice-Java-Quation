package MainController;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Functions {
	
	void Launch(String str);

	void WaitForClickable(By by);

	void waitforVisibilityOfElement(WebElement element);
	void waitforVisibilityOfElement(By by);
	 void fluentWait(final By by) ;
	 void WaitForElementToBeClickable(By by);
	 void selectDropDownListOptionByText(WebElement element, String text);
	 void selectDropDownListOptionByAttribut(WebElement element, String value);
	 void selectDropDownListOptionByIndex(WebElement element, int index);
	 void TakeScreenShot(String name) throws Exception ;
	 void ScrollDown(int pix) throws Exception;
}
