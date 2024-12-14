package String_Operation;

public class Occurance_Char {

	static int count , i, j;

	public static void Occurance(char c, String s) {
	
	
		char[] ch = s.toCharArray();
		count=0;
		for (i = 0; i < ch.length; i++) {
			
			if (ch[i] == c) {
				count++;
				ch[i]='j';
			}
		
		}
		
			System.out.println(c+" ="+count);
	
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s = "I am Zombade Shikha";
	s=s.toLowerCase();
	s = s.replace(" ", "");
for(int d=0;d<s.length();d++) {
	Occurance(s.charAt(d), s);


}

}

}