package Recurssion;

public class Amstrong_Rec {
	static int n =153;
	static int temp=0;
	static int temp1=0;
	static int Num=n;
	static int Res=0;

	public static int Recurssion(int temp) {
	
		if(n>0) {
			temp=n%10; //35
			n=n/10;//1
			Recurssion(n);
			temp1=(temp*temp*temp)+temp1;
		}
		return temp1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Res=Recurssion(n);
		if(Res==Num) {
			System.out.println("Yes"+Res);
		}
		else {
			System.out.println("No"+Res);

		}
	}
}
