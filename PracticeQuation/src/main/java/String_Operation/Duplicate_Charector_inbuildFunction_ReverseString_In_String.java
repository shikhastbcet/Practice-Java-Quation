package String_Operation;

public class Duplicate_Charector_inbuildFunction_ReverseString_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("ShikhaZombade");
		char ch[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == ch[i]) {
					System.out.print(ch[i] + " ");
					count++;

				}
			}

		}
		System.out.print("\n" + count + " Charevtor are duplicate ");
	}

}
//======================================================================================================
//inbuildFunction_ReverseString
//=======================================================================================================

 class inbuildFunction_ReverseString {
	public static void main(String[] args) {
		String str="Shikha";
		StringBuffer str2=new StringBuffer(str);
		System.out.println(str2.reverse());
	}

}
/*
 * String str = "Great responsibility"; int count;
 * 
 * //Converts given string into character array char[] string1 =
 * str.ToCharArray();
 * 
 * Console.WriteLine("Duplicate characters in a given string: "); //Counts each
 * character present in the string for(int i = 0; i <string1.Length; i++) {
 * count = 1; for(int j = i+1; j <string1.Length; j++) { if(string1[i] ==
 * string1[j] && string1[i] != ' ') { count++; //Set string1[j] to 0 to avoid
 * printing visited character string1[j] = '0'; } } //A character is considered
 * as duplicate if count is greater than 1 if(count > 1 && string1[i] != '0')
 * Console.WriteLine(string1[i]); } } }
 */