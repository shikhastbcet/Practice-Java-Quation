package Array;
public class InstanceArray {
	int InstanceID;
	String InstanceName;

	InstanceArray(int i, String string) {
		this.InstanceID = i;
		this.InstanceName = string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceArray ia1 = new InstanceArray(101, "Object1");
		InstanceArray ia2 = new InstanceArray(200, "Object2");
		InstanceArray ia3 = new InstanceArray(300, "Object3");
		InstanceArray ia4 = new InstanceArray(3400, "Object4");
		// System.out.println(ia1.InstanceID);
		// Using for:each loop we can achive the value of array
		InstanceArray[] IA = new InstanceArray[4];
		IA[0] = ia1;
		IA[1] = ia2;
		IA[2] = ia3;
		IA[3] = ia4;
		for (InstanceArray IA1 : IA) {
			System.out.println(IA1.InstanceID + "  " + IA1.InstanceName);

		}
	}
}