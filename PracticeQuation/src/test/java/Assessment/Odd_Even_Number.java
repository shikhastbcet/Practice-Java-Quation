package Assessment;

public class Odd_Even_Number {

	public static void main(String[] args) {
		int number = 100;
		for(int i=1;i<=number;i++) {
		if(i%2==0) {
			System.out.println("Even Number "+i);			
		}
		else {
			System.out.println("Odd Number "+i);
		}
		}

	}

}