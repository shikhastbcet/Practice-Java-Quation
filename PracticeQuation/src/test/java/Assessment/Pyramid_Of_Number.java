package Assessment;
public class Pyramid_Of_Number {

	public static void main(String[] args) {
		// Pyramis of munber

		int R = 5, s = 4, temp = 1;   
		//S for space ,temp for increase the by odd number for triangle

		for (int Ro = 1; Ro <= R; Ro++) {   //Row 

			for (int i = 0; i < s; i++) {    //space 
				System.out.print(" ");
			}

			for (int Col = 1; Col <= temp; Col++) {  //Triangle
				if (Ro % 2 == 0 ) {             //space between Triangle
					if (  Col % 2 == 0) {
						System.out.print(Col);					}
					else {
						System.out.print(" ");					}
				}				
				else {
					if (  Col % 2 != 0) {
						System.out.print(" ");
					}
					else {
						System.out.print(Col);
					}
				}

			}
 temp =temp+2;
 s--;
 System.out.println();
		} 

	}

}

