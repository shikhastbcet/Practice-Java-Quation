package Array;

public class Decending_order_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = new int [] {45, 20, 80, 78, 81};     
	        int temp = 0;            
	          
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];     
	                   arr[j] = temp;    
	               }     
	            }     
	        }    	            
	        System.out.println();  
	             
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	    
}
}

