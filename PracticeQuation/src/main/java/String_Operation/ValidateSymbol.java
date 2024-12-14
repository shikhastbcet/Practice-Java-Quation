package String_Operation;

public class ValidateSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "()12345678}";
int l=str.length();
if(str.startsWith("(") &str.endsWith(")")) {
	System.out.println("True");
}
else {
	System.out.println("False");
}
	}

}
