package String_Operation;
public class Count_Word_In_String {

	public static void main(String[] args) {
		// Count words in String Removing White space
		String str = "I am from Apmosys, shikha ";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char str1 = str.charAt(i);
			if (str1 == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
