package Array;

import java.util.Arrays;

public class Marge_Arrays{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,33,3,4};
		int b[]= {4,5,6,7};
		int c=0;
		int cc[]=new int [a.length+b.length];
		for (int A:a) {
			cc[c]=A;
			System.out.println(cc[c++]);
		}
		for (int B:b) {
			cc[c]=B;
			System.out.println(cc[c++]);
		}
	Arrays.sort(cc);
	System.out.println(Arrays.toString(cc));}
 
}
