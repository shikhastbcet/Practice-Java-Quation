package Array;


public class ArraysAccess {

	static void m1(int[] num) {
		for (int aa : num) {
			System.out.println(aa);
		}
	}

	static String[] m2() {
		String[] str1 = new String[3];
		str1[0] = "Hello";
		str1[1] = "Hiii";
		str1[2] = "Hey";
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 1, 2, 3, 4, 5 };
		m1(num);
		String[] str2 = m2();
		for (String ss : str2) {
			System.out.println(ss);
		}
	}
}

