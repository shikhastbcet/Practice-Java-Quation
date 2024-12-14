package Array;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Normal Collection
		ArrayList A1 = new ArrayList();
		A1.add(100);
		A1.add(200);
		A1.add("Cyber");
		System.out.println(A1);
		
		for (Object o : A1) {
			if (o instanceof ArrayList) {
				System.out.println("It's in an object form");
			}
			
		}
		
		if (A1.contains("Cyber")) {
			System.out.println("It contain");
		}
		System.out.println(A1.size());
		System.out.println(A1.clone());
		System.out.println(A1.get(0));
		System.out.println(A1.hashCode());
		A1.clear(); 
		if (A1.isEmpty()) {
			System.out.println("It Empty");
		}
	    System.out.println(10/0);
	}
	

}

