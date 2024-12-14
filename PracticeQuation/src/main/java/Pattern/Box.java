package Pattern;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter Row's : ");
int n=scan.nextInt();
System.out.println("Enter Columns : ");
int c=scan.nextInt();		
		
		for (int i = 1; i <=n; i++) {
			for (int j =1; j <=c; j++) {
				if (i==1||i==n||j==1||j==c) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

//		
	
}

}
