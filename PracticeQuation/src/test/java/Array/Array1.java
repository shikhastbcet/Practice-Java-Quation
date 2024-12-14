package Array;

import java.lang.reflect.Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// FIRST WAY TO CREAT AN NARMAL ARRAY
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		// Use for(){} to extract the array value
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// Use for(){} to extract the array value
		int num[] = { 100, 200, 300, 400, 500 };
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}

	}
}


