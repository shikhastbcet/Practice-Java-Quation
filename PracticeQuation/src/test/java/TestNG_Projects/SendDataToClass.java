package TestNG_Projects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendDataToClass {
//Dataprovider is the class where from we take data i this class using dataProvider="name of dataproovider" ,dataProviderClass=classNameOfDataGain.class
	@Test(dataProvider = "Cridential",dataProviderClass = Datapropiver.class)
private void DateFromDataprovider(String user,String Pass) {
	// TODO Auto-generated method stub
System.out.println("User= "+user+"Pass = "+Pass);
}
}
