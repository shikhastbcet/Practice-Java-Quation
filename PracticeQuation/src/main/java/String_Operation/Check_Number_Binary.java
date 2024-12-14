package String_Operation;



public class Check_Number_Binary  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =11100111;
		int d;
		boolean flag=true;
		while (number!=0) {
		d=number%10;
		if((d==1 ||d==0)) {
				
		}
		else {
			flag=false;
			break;
		}
			number=number/10;
	}
   		if(flag) {
			System.out.println("The given number is binary");
		}
		else {
			System.out.println("The given number is not binary");
		}
   		
   		
	}
}

