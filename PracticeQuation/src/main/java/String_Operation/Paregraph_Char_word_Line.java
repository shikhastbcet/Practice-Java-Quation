package String_Operation;

public class Paregraph_Char_word_Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "One two three four five Once I caught a fish alive. Six seven eight nine ten. Then I let go again. Why did you let it go?.Because it bit my finger so.Which finger did it bite?.This little finger on the right.";
		int count = 0;
		String[] words = str.split(" ");
		String[] Line = str.split(".");
		System.out.println("Number of word in Pareghraph "+words.length+ "\n Number of line in pareghraph "+Line.length);
		
		String str1=str.replace(",","");
		String str2=str1.replace(".","");
		char [] ch=str2.toCharArray(); 
		for (int i = 0; i < ch.length; i++) {
			count ++;			
	}
		System.out.println("Number of word in Pareghrapha : " +count);
}}

