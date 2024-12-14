package Array;

public class ArraySecondHighestNo {

	public static void main(String[] args) {

		int[] num = { 10, 30, 40, 59 };
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
					System.out.println(num[i]);
				}

			}
			
		}
		System.out.println(num[2]);
			
	}
}
