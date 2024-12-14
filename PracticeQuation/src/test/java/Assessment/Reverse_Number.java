package Assessment;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number=123,temp=0;
		String str="";
		while(Number>0){
			temp=Number%10;
			str=str+temp;
			Number=Number/10;			
		}
		System.out.println(Integer.parseInt(str));		
	}

}