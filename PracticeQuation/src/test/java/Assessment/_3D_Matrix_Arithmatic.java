package Assessment;

public class _3D_Matrix_Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][][]num= {{{10 ,20 ,90},{30 ,40 ,80},{50 ,60 ,70}}};
int num1[][][]= {{{10,20,30},{40,50,60},{70,80,90}}};
    for (int i = 0; i <num.length; i++) {
		for (int j = 0; j <3; j++) {
			
			System.out.println("ADDITION OF 3D ARRAY");
			for (int j2 = 0; j2 <3; j2++) {
				System.out.print(num[i][j][j2]+num1[i][j][j2]+" ");
			}
			System.out.println();
		}
		System.out.println("\nSUBTRACT  OF 3D ARRAY");
    for (int j = 0; j <3; j++) {
		for (int j2 = 0; j2 <3; j2++) {
			System.out.print(num[i][j][j2]-num1[i][j][j2]+" ");
		}
		System.out.println();
	}
	System.out.println("\nDIVISION OF 3D ARRAY");
   for (int j = 0; j <3; j++) {
		for (int j2 = 0; j2 <3; j2++) {
			System.out.print(num[i][j][j2]/num1[i][j][j2]+" ");
		}
		System.out.println();
	}
	System.out.println("\nMULTIPLICATION OF 3D ARRAY");

    for (int j = 0; j <3; j++) {
		for (int j2 = 0; j2 <3; j2++) {
			System.out.print(num[i][j][j2]*num1[i][j][j2]+" ");
		}
		System.out.println();
	}
    }
   }
   }


