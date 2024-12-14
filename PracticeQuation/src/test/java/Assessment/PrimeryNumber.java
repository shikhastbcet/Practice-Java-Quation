package Assessment;
public class PrimeryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 2;
		for (int i = 1; i <= 4; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("It's Primary Number");
		}
		else {
			System.out.println("It isn't Primary Number");
		}
	}
}