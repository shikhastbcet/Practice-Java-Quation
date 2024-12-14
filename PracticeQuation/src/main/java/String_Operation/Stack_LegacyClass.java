package String_Operation;

import java.util.Stack;

public class Stack_LegacyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)Introduce in 1.0 Version
		//2) Store Homogues and Hectroguos data
		//3) Duplication allowed
		//4) Null insertion is allowed
		//5) Insertion order is maintion
		//6) Syschronise -Multiple thread/process at a time
		//7)Data is Growable iin nature
		//8) Three Course are applicable 1-Enumrable 2-itrator 3- ListItrator
		
		Stack S=new Stack();
		S.add(100);
		S.add("String");
		S.add('C');
		S.add('C');  //Duplication is allowed
		S.add(null);
		System.out.println(S);
	
		//	System.out.println("Add one stack data to another Stack");
		Stack S1=new Stack();
		S1.add(200);
		S1.add("String1");
		S1.add('D');
		S1.add(null);
		S1.addAll(S);
		System.out.println(S1);
	
	//System.out.println("Remove one stack data to another Stack");
		S1.removeAll(S);
		System.out.println(S);
		
	}

}
