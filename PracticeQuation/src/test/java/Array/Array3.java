package Array;

public class Array3 {
	int EmpId;
	String EmpName;

	Array3(int i, String string) {
		// TODO Auto-generated constructor stub
		this.EmpId = i;
		this.EmpName = string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating constructor pass argument create array
		Array3 a[] = new Array3[3];
		Array3 a1 = new Array3(101, "Zombade Shikha");
		Array3 a2 = new Array3(102, "Rutuja Patil");
		Array3 a3 = new Array3(103, "Rohan Akade");
		a[0] = a1;
		a[1] = a2;
		a[2] = a3;

		for (Array3 aa : a) {
			System.out.println(aa.EmpId + "  " + aa.EmpName);

		}

	}
}
