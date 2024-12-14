package Assessment;

public class Palindrome_Number {
//Palindrome_Number is same with his reverse  aabaa==aabaa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number=12321, revarse = 0,num;
   int temp=number;
     while (number>0) {
    	num=number%10;
    	 revarse= (revarse*10)+num;
    	 number=number/10;		
	}
     if(temp==revarse) {
    	 System.out.println("True");
     }
     else {
    	 System.out.println("False");
     }
     
	}

}