package Array;

import java.util.ArrayList;

public class HetrogeniousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] o = new Object[5];
		o[0] = new Emp(101, "Shikha");
		o[1] = new Stud(202, "Kalidas");
		o[2] = "Zombade";
		o[3]=new Integer(100);
		for (Object oo : o) {
			if (oo instanceof Emp) {
				Emp e = (Emp) oo;
				System.out.println(e.EmpID + " " + e.EmpName);
			}
			if (oo instanceof Stud) {
				Stud s = (Stud) oo;
				System.out.println(s.StudId+" "+s.StudName);
			}
			if (oo instanceof String) {
				String ss = (String) oo;
				System.out.println(ss);
			}
			if(oo instanceof Integer) {
			Integer	i=(Integer)oo;
			System.out.println(i);
				
			}
		}
	}

}

class Emp {
	String EmpName;
	int EmpID;
	public Emp( int EmpID, String EmpName) {
		// TODO Auto-generated constructor stub
		 this.EmpName=EmpName;
	    this.EmpID=EmpID;
		
	}
}

class Stud {
	int StudId;
	String StudName;
	public Stud(int StudId, String StudName) {
		this.StudId=StudId;
		this.StudName=StudName;
			}
}