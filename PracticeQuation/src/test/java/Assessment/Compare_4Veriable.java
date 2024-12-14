package Assessment;

public class Compare_4Veriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 1;
		int B = 5;
		int C = 3;
		int D = 4;
		if (A > B && A > C && A > D) {
			System.out.println("Greast Value is " + A);
		}
		if (B > C && B > D && B > A) {
			System.out.println("Greast Value is " + B);
		} else if (C > A && C > B && C > D) {
			System.out.println("Greast Value is " + C);

		} else {
			System.out.println("Greast Value is " + D);

		}
	}
}
