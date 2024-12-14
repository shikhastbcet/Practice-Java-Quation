package Exception;

public class User_Define_Exception {
	User_Define_Exception(String str){
	try { 
		throw new MyException(str);
	
	}catch(MyException ex) {
		System.out.println(ex.getMessage());				
	}
}
}
			
class MyException  extends Exception {
	MyException(String str){
		super(str);		
	}
}
//To run this Exception u have to create an object  of User_Define_Exception in that class where u want to raised exception 
