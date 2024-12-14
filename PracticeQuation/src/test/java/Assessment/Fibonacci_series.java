package Assessment;

import java.util.Iterator;

public class Fibonacci_series {

	public static void main(String[] args) {
		// Fibonacci Series mean addition of priveus number and next number
		
		int A=0;
		int B=1;
		for (int i = 0; i <= 10; i++) {
			int C =A+B;
		//System.out.println(C);
			A=B;
			//System.out.println(A);
			B=C;
			System.out.println(C);				
			}
//====================================================================		
//		int a=0,b=1,c=0,sum=0,d=153,n=0,f=d;
////		for (int i=0;i<=10;i++) {
////		a=b+c;//1+0
////		c=b;//1
////		b=a;//1
////		System.out.println(c);	
////		}
//
//	while(d>0) {
//		n=d%10;
//		sum=(n^3)+sum;
//		d=d/10;
//	}
//	if(sum==f) {
//		System.out.println(sum==f);
//	}
	}

}
