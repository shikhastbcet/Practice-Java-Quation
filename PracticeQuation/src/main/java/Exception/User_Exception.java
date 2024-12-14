package Exception;


public class User_Exception {
 static void Method(int balence) {
	 if(balence<5000) {
		 System.out.println("Successfully");
	 }
	 else {
			 throw new ArithmeticException("Please Enter valid A");
	 }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method(8000);

	}

}