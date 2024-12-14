package Assessment;

public class Count_Vowels_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //Factorial Number
		char[] ch = { 'a', 'A', 'o', 'O', 'e', 'E', 'i', 'I' };
		String str = "Hello Apmosys";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			for (int o = 0; o < ch.length; o++) {
				if (ch[o] == str.charAt(i)) {
					
					count++;
				}
			}
		}
		System.out.println("String have " + count + " Vowels ");
	}

}