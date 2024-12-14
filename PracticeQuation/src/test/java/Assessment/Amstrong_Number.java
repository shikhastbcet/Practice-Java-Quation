package Assessment;

public class Amstrong_Number {

	public static void main(String[] args) {
		//amstrong number means 153=1^3+5^3+3^3
		int num=1953;
		int sum=0;
	    int i=num;
		
		while(num>0) {
			int n=num%10;			
			sum=sum+(n*n*n);
			num=num/10;
			}
		if(sum==i) {
			System.out.println("It's Amstrong Number "+i);
			}
		else {
			System.out.println("It's not Amstrong "+i);
		}
		}

}