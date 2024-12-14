package Assessment;

public class Factorial_Count_Print {

	public static void main(String[] args) {
		int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    //1=1*1/1=1*2/2=2*3/6=6*4/24=24*5
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
