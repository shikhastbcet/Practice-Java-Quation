package String_Operation;

import java.util.Iterator;

public class Reverse_each_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello i am Shikha";
String words[]=s.split(" ");
String revString="";
for(int i=0;i<words.length;i++) {
	String word=words[i];
	 String revWord ="";
	for(int j=word.length()-1;j>=0;j--) {
	
		revWord = revWord + word.charAt(j);
	
	}
	 revString = revWord + " "+revString; 
}
System.out.println(revString);

//for (int i =words.length-1; i>=0; i--) {
//	for (int j =words[i].length()-1;j>=0;j--) {
//		System.out.print(words[i].charAt(j));
//	}
//	System.out.print(" ");
//	
//}

	}

}
