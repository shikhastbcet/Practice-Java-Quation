package Assessment;

public class Perfact_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6,i=1;
		int sum = 0;
		while (number>i) {
			if (number%i == 0) {
				sum=sum+i;			
			}
			i++;
		}
		if(sum==number) {
			System.out.println("It is Perfect Number "+number);
		}
		else {
			System.out.println("It's not Perfect Number "+number);
		}
	}
}