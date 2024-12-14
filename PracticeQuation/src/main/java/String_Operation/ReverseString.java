package String_Operation;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str=new String("ahkihs zombade");
		
		for(int i=str.length();i>0;i--) {
			char ch=str.charAt(i-1);
			System.out.print(ch+"    ");
			
		}

	}

}
