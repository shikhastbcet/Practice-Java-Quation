package Assessment;

public class Occurance_Char {

	static int count = 0, i, j;

	public static void Occurance(char c, String s) {
		char[] ch = s.toCharArray();
		for (i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				count++;
			}
		}
		System.out.println(c+"= "+count);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s = "I am Zombade Shikha";
	s = s.replace(" ", "");
	// System.out.println(s);
	Occurance('a', s);

}

}
