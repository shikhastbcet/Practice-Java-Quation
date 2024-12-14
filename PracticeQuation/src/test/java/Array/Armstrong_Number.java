package Array;


public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int sum = 0;
		int number=num;
		while (num > 0) {
			int n = num % 10;
			sum += n * n * n;
			num = num / 10;
			
		}
		System.out.println(sum);
		if (sum == number) {
			System.out.println("It's ARMSTRONG Number :" + number+" = "+sum);
		} else {
			System.out.println("It's not ARMSTRONG Number :" + number+" = "+sum);
		}
	}
	
	
	
	
	
	
}
