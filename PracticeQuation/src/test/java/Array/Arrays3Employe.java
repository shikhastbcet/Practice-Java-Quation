package Array;
public class Arrays3Employe {

    int id;
	 String str;

	public Arrays3Employe(int id, String str) {
		this.id=id;
		this.str=str;
			
	}
          public static void main(String[] args) {
		// TODO Auto-generated method stub
		/****  Object store  ****/
		
		Arrays3Employe	a1=new Arrays3Employe(101,"Shikha");
		Arrays3Employe	a2=new Arrays3Employe(102,"Kalidas");
		Arrays3Employe	a3=new Arrays3Employe(103,"Zombade");
		Arrays3Employe a[]=new Arrays3Employe[3];
		a[0]=a1;
		a[1]=a2;
		a[2]=a3;
		for(Arrays3Employe aa:a) {
		  System.out.println(aa.id+" "+aa.str);}
	}
 
}

