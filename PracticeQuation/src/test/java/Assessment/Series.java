package Assessment;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 0;
		int e = 1;
		int a[];
		for (int i = 1; i < 15; i++) {
			if (i % 2 != 0) {
				// ODD
				o = i;
				System.out.print(o + ",");
			}
		}
     for(int i=1;i<=15 ;i++) { 
    	 e = (int) Math.pow(2, i);
			System.out.print(e + ",");
     }
    
	}
}
