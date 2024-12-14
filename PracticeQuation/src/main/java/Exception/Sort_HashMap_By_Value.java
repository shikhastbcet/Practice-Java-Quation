package Exception;
import java.util.HashMap;

public class Sort_HashMap_By_Value {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HashMap<String, String> codenames = new HashMap<String, String>(); 
//		codenames.put("2", "Sparkler"); 
//		codenames.put("3", "Playground"); 
//		codenames.put("5", "Kestrel");
//		codenames.put("4", "Merlin"); 
//		codenames.put("6", "Dolphin"); 
//		System.out.println("HashMap before sorting, random order "+codenames);

		//Read more: https://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html#ixzz7hy5Rkey8
		
		
		 int matrix[][] = {{1, 2, 3},
                 {4, 5, 6},
                {7, 8, 9}};
    
   int n = 3;

	
	for (int i = 0; i < n; i++)
    {
        int Mrow = matrix[i][0], col= 0;
        for (int j = 1; j < n; j++)
        {
            if (Mrow > matrix[i][j])
            {
                Mrow = matrix[i][j];
                col = j;
            }
        }
  
      
        int k;
        for (k = 0; k < n; k++)
  
            // Note that col_ind is fixed
            if (Mrow < matrix[k][col])
                break;
  
        // If saddle point is present in this row then
        // print it
        if (k == n)
        {
           System.out.println("Value of Saddle Point " + Mrow);
        }
    
	else{
	       System.out.println("No Saddle Point ");  
   }
}}}



