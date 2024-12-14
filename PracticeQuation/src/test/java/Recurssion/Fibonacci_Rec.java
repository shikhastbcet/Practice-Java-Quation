package Recurssion;

public class Fibonacci_Rec {

	
	static int a = 0;
	static int b = 1;
	static int c = 0;

	public static int Fibo(int n) {
		if (n >= 1) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			Fibo(n - 1);
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a+"\n"+b);
		int f = Fibo(10);
		System.out.println(f);
	}

}
