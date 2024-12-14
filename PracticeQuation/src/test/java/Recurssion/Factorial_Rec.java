package Recurssion;

public class Factorial_Rec {
	static int n = 6;
	static int res = 1;
	static int R = 1;

	public static int Factorial(int n) {
		if (n > 0) {
			res *= n;
			Factorial(n - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R = Factorial(n);
		System.out.println(R);
	}

}
