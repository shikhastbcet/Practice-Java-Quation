package Assessment;

import java.util.Arrays;

public class Occurance_number {

	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234557;
		//digits number split and store in array
		String a[]=Integer.toString(n).split("");
		System.out.println(Arrays.toString(a));
		int num[]= {1,2,3,4,5,1,2,3,3,2,2,3};
		int X=5;
		for (int i = 0; i < num.length; i++) {
			if(X==num[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
