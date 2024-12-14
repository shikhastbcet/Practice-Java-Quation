package Array;
import java.lang.reflect.Array;

public class Array_Defoult_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		for (int aa : a) {
			System.out.println("Int Array Defoult Value" + aa);
		}
		float f[] = new float[3];
		for (float ff : f) {
			System.out.println("Flout Array Defoult Value" + ff);
		}
		String[] str = new String[3];
		for (String ss : str) {
			System.out.println("String Array Defoult Value" + ss);
		}
	}
}
